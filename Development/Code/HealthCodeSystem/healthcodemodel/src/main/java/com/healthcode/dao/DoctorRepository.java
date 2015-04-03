package com.healthcode.dao;

import java.util.Collection;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthcode.entity.Doctor;
import com.healthcode.entity.Patient;

/**
 *
 *	DoctorRepository handles queries provided by Out-Of-The-Box 
 *	queries provided by MongoDB and custom queries defined in CustomPatientRepository
 *
 */

public interface DoctorRepository extends PersonInterface<Doctor>{
	
	Collection<Doctor> getDoctorsBySpecilization(String specilization);
	
	Collection<Doctor> getDoctorsByArea(String area);
	
	Collection<Doctor> getDoctorsByRating(String specilization,String rating);
	
	Collection<Doctor> getDoctorsByHospital(String hospitalName);
}


