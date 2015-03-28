package com.healthcode.patient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcode.patient.repositories.PatientRepository;
import com.healthcode.springdata.patient.model.domain.Patient;

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
	public Patient getPatient(String healthCode) throws Exception {
		// TODO Auto-generated method stub
		return patientRepository.getPatientDetailsbyHealthCode(healthCode);
	}
}
