package com.healthcode.dao;

import java.util.Collection;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthcode.model.Patient;

/**
 *
 *	PatientRepository handles queries provided by Out-Of-The-Box 
 *	queries provided by MongoDB and custom queries defined in CustomPatientRepository
 *
 */
@Repository
public interface PatientRepository extends PersonInterface<Patient>{
	
	Collection<Patient> getPersonByDisease(String diseaseName);
}