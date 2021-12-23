package com.batch.model;

public class encounters {

	private String id;
	private String patient;
	private String  organization;
	private String  provider;
	private String  encounterclass;
	private String  code ;
	public encounters(String id, String patient, String organization, String provider, String encounterclass,
			String code, String description) {
		super();
		this.id = id;
		this.patient = patient;
		this.organization = organization;
		this.provider = provider;
		this.encounterclass = encounterclass;
		this.code = code;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPatient() {
		return patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}
	private String  description;
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getEncounterclass() {
		return encounterclass;
	}
	public void setEncounterclass(String encounterclass) {
		this.encounterclass = encounterclass;
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
	public encounters(String organization, String provider, String encounterclass, String code, String description) {
		super();
		this.organization = organization;
		this.provider = provider;
		this.encounterclass = encounterclass;
		this.code = code;
		this.description = description;
	}
	public encounters() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
