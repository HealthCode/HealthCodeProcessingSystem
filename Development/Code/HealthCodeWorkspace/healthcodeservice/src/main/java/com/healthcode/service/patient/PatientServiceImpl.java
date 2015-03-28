package com.healthcode.service.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcode.dao.patient.PatientRepository;
import com.healthcode.model.patient.Patient;

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
