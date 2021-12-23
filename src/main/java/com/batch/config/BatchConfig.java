package com.batch.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.batch.model.encounters;
import com.batch.model.encounters;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
	
	
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	private StepBuilderFactory stepbuilderfactory;
	
	@Bean
	public FlatFileItemReader<encounters> reader(){
		
		FlatFileItemReader<encounters> reader=new FlatFileItemReader<>();
		
		reader.setResource(new ClassPathResource("encounters.csv"));
		reader.setLineMapper(getLineMapper());
		reader.setLinesToSkip(1);
		return reader;
	}

	public LineMapper<encounters> getLineMapper() {
		// TODO Auto-generated method stub
		DefaultLineMapper<encounters> lineMapper=new DefaultLineMapper<>();
		
		DelimitedLineTokenizer lineTokenizer=new DelimitedLineTokenizer();
		lineTokenizer.setNames(new String[] {"Id","PATIENT","ORGANIZATION","PROVIDER","ENCOUNTERCLASS","CODE","DESCRIPTION"});
		lineTokenizer.setIncludedFields(new int[] {0,3,4,5,7,8,9});
		BeanWrapperFieldSetMapper<encounters> fieldsetMapper=new BeanWrapperFieldSetMapper<>();
		fieldsetMapper.setTargetType(encounters.class);
		lineMapper.setLineTokenizer(lineTokenizer);
		lineMapper.setFieldSetMapper(fieldsetMapper);
		
		return lineMapper;
	}
	
	@Bean
	public AllergiesItemProcessor processor()
	{
		return new AllergiesItemProcessor();
	}
	
	@Bean
	public JdbcBatchItemWriter<encounters> writer()
	{
		JdbcBatchItemWriter<encounters> writer = new JdbcBatchItemWriter<>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<encounters>());
		System.out.println("hello");
		writer.setSql("Insert into encounters values(:id,:patient,:organization,:provider,:encounterclass,:code,:description)");
		writer.setDataSource(this.dataSource);
		return writer;
	}
	
	@Bean
	public Job importencountersJob()
	{
		return this.jobBuilderFactory.get("USER-IMPORT-JOB")
				.incrementer(new RunIdIncrementer())
				.flow(step1())
				.end()
				.build();
	}

	
	@Bean
	public Step step1() {
		// TODO Auto-generated method stub
		return this.stepbuilderfactory.get("step1")
				.<encounters,encounters>chunk(10)
				.reader(reader())
				.processor(processor())
				.writer(writer())
				.build();
				
	}

}
