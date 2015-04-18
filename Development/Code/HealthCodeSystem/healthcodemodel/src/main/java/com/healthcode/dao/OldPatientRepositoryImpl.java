package com.healthcode.dao;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.healthcode.entity.Patient;


@Repository(value ="Old")
public class OldPatientRepositoryImpl implements CustomPatientRepository {
@Autowired
private MongoTemplate mongoTemplate;
@Override
public Patient getPatientDetailsbyHealthCode(String healthCode) {
	System.out.println(" Old Repiosirtoy");
MongoOperations mongoOp = (MongoOperations) mongoTemplate;
//Query 'Patient' collection by Health Code
Query searchPatientbyHealthCode = new Query(Criteria
.where(CustomPatientRepository.HEALTHCODE)
.is(healthCode));
Patient patient = mongoOp.findOne(searchPatientbyHealthCode,Patient.class);
return patient;
}
@PostConstruct
public void customInit()
{
    System.out.println("Old Method customInit() invoked...");
}
 
@PreDestroy
public void customDestroy()
{
    System.out.println("Method customDestroy() invoked...");
}
}
