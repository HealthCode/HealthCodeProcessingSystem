package com.healthcode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcode.dao.PatientRepository;
import com.healthcode.model.Patient;
import com.healthcode.model.PersonDetails;
import com.healthcode.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	private PatientRepository patientRepository;

	public List<Patient> getAllPatients() throws Exception {
		return patientRepository.findAll();
	}

	public void savePatientDetails(Patient patient) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public PersonDetails getPatient(String healthCode) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
