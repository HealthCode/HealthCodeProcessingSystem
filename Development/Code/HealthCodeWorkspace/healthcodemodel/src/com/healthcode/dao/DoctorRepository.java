package com.healthcode.dao;

import java.util.Collection;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthcode.model.Doctor;

/**
 *
 *	DoctorRepository handles queries provided by Out-Of-The-Box 
 *	queries provided by MongoDB and custom queries defined in CustomPatientRepository
 *
 */
@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String>, PersonInterface<Doctor>{
	
	Doctor getDoctorBySpecilization(String specilization);
	
	Doctor getDoctorByArea(String area);
	
	Doctor getDoctorByRating(String specilization);
	
	Collection<Doctor> getDoctorsByHospital(String hospitalName);
}


