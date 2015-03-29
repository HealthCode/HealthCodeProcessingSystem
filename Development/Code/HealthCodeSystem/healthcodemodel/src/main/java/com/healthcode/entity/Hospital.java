package com.healthcode.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author Parvath Bingi
 * 
 * This POJO represents 'Hospital_Details' collection in DB 
 *
 */
@Document(collection="Hospital_Details")

public class Hospital extends ModelEntity {

	
	private List<String> doctors;

	public List<String> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<String> doctors) {
		this.doctors = doctors;
	}
	

}
