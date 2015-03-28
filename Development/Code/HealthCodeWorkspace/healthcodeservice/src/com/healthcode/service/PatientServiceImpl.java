package com.healthcode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcode.dao.PatientRepository;
import com.healthcode.model.Patient;
import com.healthcode.model.PersonDetails;

@Service
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Override
	public List<Patient> getAllPatients() throws Exception{
		return patientRepository.findAll();
	}
	
	@Override
	public void savePatientDetails(Patient patient) throws Exception {
		patientRepository.save(patient);
	}
	
	@Override
	public PersonDetails getPatient(String healthCode) throws Exception {
		// TODO Auto-generated method stub
		return patientRepository.getPersonByHealthCode(healthCode);
	}
}
