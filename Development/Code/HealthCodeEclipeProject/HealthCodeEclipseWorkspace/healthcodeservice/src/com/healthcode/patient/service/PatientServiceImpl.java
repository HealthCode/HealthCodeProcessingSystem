package com.healthcode.patient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcode.patient.repositories.PatientRepository;
import com.healthcode.springdata.patient.model.domain.Patient;

@Service
public class PatientServiceImpl implements PatientService{
	@Autowired
	PatientRepository patientRepository;
	
	@Override
	public List<Patient> getPatientDetails() throws Exception{
		return patientRepository.findAll();
	}
	
	@Override
	public void savePatientDetails(Patient patient) throws Exception {
		patientRepository.save(patient);
	}
}
