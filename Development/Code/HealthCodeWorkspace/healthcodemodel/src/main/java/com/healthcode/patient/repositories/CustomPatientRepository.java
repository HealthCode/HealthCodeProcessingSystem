package com.healthcode.patient.repositories;

import com.healthcode.springdata.patient.model.domain.Patient;

/**
 * 
 * @author Rama Vadlamudi
 *
 *	This Interface declares the custom and more complex queries, that 
 *	cannot be done using MongoRepository API. 
 *
 */
public interface CustomPatientRepository {
	
	public final static String HEALTHCODE = "healthCode";
	
	/**
	 * This method gets the details of a Patient by HealthCode
	 * @param healthCode
	 * @return Patient
	 */
	public Patient getPatientDetailsbyHealthCode(String healthCode);
}
