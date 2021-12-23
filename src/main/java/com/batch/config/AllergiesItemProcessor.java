package com.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.batch.model.Allergies;
import com.batch.model.encounters;
import com.batch.model.providers;

public class AllergiesItemProcessor implements ItemProcessor<encounters, encounters> {

	@Override
	public encounters process(encounters item) throws Exception {
		// TODO Auto-generated method stub
		return item;
	}

	

}
