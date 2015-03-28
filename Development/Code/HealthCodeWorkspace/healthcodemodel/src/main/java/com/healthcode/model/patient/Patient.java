package com.healthcode.model.patient;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author Rama Vadlamudi
 * 
 * This POJO represents 'Patient' collection in MongoDB 
 *
 */
@Document(collection="Patient")
public class Patient {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String healthCode;
	
	public Patient(){
		
	}
	
	Patient(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
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
	public String getHealthCode() {
		return healthCode;
	}
	public void setHealthCode(String healthCode) {
		this.healthCode = healthCode;
	}
}
