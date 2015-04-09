package com.healthcode.entity;


import java.util.Collection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Patient_Details")
public class Patient  extends PersonDetails{

	private String healthCode;
	private Collection<DiseaseDetails> disease = null;
	
	public Patient(){
		
	}

}
