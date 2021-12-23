package com.batch.model;

public class providers {

	private  String id;
    private String  organization;
    private String  name ;
    private String  gender;
    private String  speciality;
    private String address;
    private String city ;
    private String state;
   private String  zip;
    private String utilization;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getUtilization() {
		return utilization;
	}
	public void setUtilization(String utilization) {
		this.utilization = utilization;
	}
	public providers(String id, String organization, String name, String gender, String speciality, String address,
			String city, String state, String zip, String utilization) {
		super();
		this.id = id;
		this.organization = organization;
		this.name = name;
		this.gender = gender;
		this.speciality = speciality;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.utilization = utilization;
	}
	public providers() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
	
}
