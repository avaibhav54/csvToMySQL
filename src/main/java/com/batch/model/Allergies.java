package com.batch.model;

import java.sql.Date;

public class Allergies {
	
	public Allergies(String start, String stop, String patient, String encounter, String code, String description) {
		super();
		this.start = start;
		this.stop = stop;
		this.patient = patient;
		this.encounter = encounter;
		this.code = code;
		this.description = description;
	}
	public Allergies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getStop() {
		return stop;
	}
	public void setStop(String stop) {
		this.stop = stop;
	}
	public String getPatient() {
		return patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}
	public String getEncounter() {
		return encounter;
	}
	public void setEncounter(String encounter) {
		this.encounter = encounter;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String start;
	private String stop;
	private String patient;
	private String encounter;
	private String code;
	private String description;

}
