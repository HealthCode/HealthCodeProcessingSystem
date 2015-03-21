package com.healthcode.patient.service;

import java.util.List;

import com.healthcode.springdata.patient.model.domain.Patient;

public interface PatientService {
	public List<Patient> getPatientDetails() throws Exception;
	
	public void savePatientDetails(Patient patient) throws Exception;
}
