package com.healthcode.dao;

import java.util.Collection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.healthcode.entity.Patient;
import com.healthcode.entity.PersonDetails;

/**
 *
 *	PatientRepository handles queries provided by Out-Of-The-Box 
 *	queries provided by MongoDB and custom queries defined in CustomPatientRepository
 *
 */

public interface PatientRepository extends PersonDao<Patient>{
	
	Collection<Patient> getPersonByDisease(String diseaseName);
	
	
}