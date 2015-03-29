package com.healthcode.entity;


import java.util.Collection;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Patient_Details")
public class Patient extends PersonDetails {

	private Collection<DiseaseDetails> diseases = null;
	
	public Patient(){
		
	}

}
