package com.healthcode.dao.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.healthcode.dao.Constants;

import com.healthcode.dao.PatientDao;
import com.healthcode.dao.PatientRepository;
import com.healthcode.dao.PersonInterface;

import com.healthcode.entity.Doctor;
import com.healthcode.entity.Patient;
import com.healthcode.entity.PersonDetails;


@Repository(value = "Patient")
public class PatientRepositoryImpl  extends BaseRepositoryImpl<Patient> implements PatientRepository {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public Collection<Patient> getPersonByDisease(String diseaseName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Patient getPersonByHealthCode(String healthCode) {
		
		MongoOperations mongoOp = (MongoOperations) mongoTemplate;
		
		//Query 'Patient' collection by Health Code
		Query searchPatientbyHealthCode = new Query(Criteria
								.where(Constants.HEALTHCODE)
								.is(healthCode)); 
		Patient patient = mongoOp.findOne(searchPatientbyHealthCode,Patient.class); 
		
		return patient;
	}


	
	
}
