package com.healthcode.service;

import java.util.List;

import com.healthcode.model.Patient;
import com.healthcode.model.PersonDetails;

public interface PatientService {
	
	/**
	 * 
	 * Gets the details of all the patients
	 * @return Patients
	 * @throws Exception
	 */
	public List<Patient> getAllPatients() throws Exception;
	
	/**
	 * 
	 * Saves a patient information to collection
	 * @param patient
	 * @throws Exception
	 */
	public void savePatientDetails(Patient patient) throws Exception;
	
	/**
	 * 
	 * Retrieves the details of a patient by HealthCode
	 * @param healthCode
	 * @return Patient
	 * @throws Exception
	 */
	public PersonDetails getPatient(String healthCode) throws Exception;
}
