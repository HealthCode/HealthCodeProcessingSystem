package com.healthcode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.healthcode.dao.OldPatientRepository;
import com.healthcode.entity.Patient;



@Service
public class OldPatientServiceImpl implements OldPatientService{
	
	@Autowired
	@Qualifier("Old")
	public OldPatientRepository patientRepository;
	
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
