package com.healthcode.entity;


import java.util.Collection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Patient_Details")
@ComponentScan
public class Patient extends PersonDetails {

	private Collection<DiseaseDetails> diseases = null;
	
	public Patient(){
		
	}

}
