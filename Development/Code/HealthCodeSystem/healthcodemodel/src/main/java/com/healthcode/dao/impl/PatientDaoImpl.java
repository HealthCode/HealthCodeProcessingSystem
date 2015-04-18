package com.healthcode.dao.impl;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.healthcode.dao.Constants;


import com.healthcode.dao.PatientRepository;



import com.healthcode.entity.Patient;



@Repository(value ="Patient")
public class PatientDaoImpl  extends PersonDaoImpl<Patient> implements PatientRepository {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	public PatientDaoImpl()
	{
		System.out.println(" Bean is created");
	}
	public void init()
	{
		System.out.println(" Init method ");
	}
	@Override
	public Collection<Patient> getPersonByDisease(String diseaseName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Patient getPersonByHealthCode(String healthCode) {
		System.out.println("Dao : Reading entry from DB");
		MongoOperations mongoOp = (MongoOperations) mongoTemplate;
		System.out.println("Dao : Reading entry from DB");
		//Query 'Patient' collection by Health Code
		Query searchPatientbyHealthCode = new Query(Criteria
								.where(Constants.HEALTHCODE)
								.is(healthCode)); 
		Patient patient = mongoOp.findOne(searchPatientbyHealthCode,Patient.class); 
		
		return patient;
	}


    @PostConstruct
    public void customInit()
    {
        System.out.println("Patient Method customInit() invoked...");
    }
     
    @PreDestroy
    public void customDestroy()
    {
        System.out.println("Patient Method customDestroy() invoked...");
    }
	
}
