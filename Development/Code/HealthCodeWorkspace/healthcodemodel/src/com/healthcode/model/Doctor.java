package com.healthcode.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author Parvath Bingi
 * 
 * This POJO represents 'Doctor' collection in DB 
 *
 */
@Document(collection="Doctor_Details")
public class Doctor {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private List<String> specilizations;
	private List<String> Hospitals;
	private Double fee;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<String> getSpecilizations() {
		return specilizations;
	}
	public void setSpecilizations(List<String> specilizations) {
		this.specilizations = specilizations;
	}
	public List<String> getHospitals() {
		return Hospitals;
	}
	public void setHospitals(List<String> hospitals) {
		Hospitals = hospitals;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	
}
