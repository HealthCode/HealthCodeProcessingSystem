package com.healthcode.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.healthcode.entity.Patient;


public interface OldPatientService {
	
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
	public Patient getPatient(String healthCode) throws Exception;
}
