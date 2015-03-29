package com.healthcode.service.impl;

import java.io.File;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcode.dao.PatientRepository;
import com.healthcode.entity.Patient;
import com.healthcode.service.PatientService;

@Service
public class PatientServiceImpl extends CoreServiceImpl<Patient> implements PatientService{
	
	@Autowired
	private PatientRepository patientRepository;

	public List<Patient> getAllPatients() throws Exception {
		return patientRepository.findAll();
	}

	public Collection<Patient> getPatientsByCity(String cityName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Patient> getPersonByAgeRange(Integer start, Integer end) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Patient> getPersonByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Patient> getPersonByGenderAndAge(String geneder,
			Integer start, Integer end) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Patient> getPersonByDisease(String diseaseName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void bookDocAppointment(String docCode, Date dateTime) {
		// TODO Auto-generated method stub
		
	}

	public void uploadMedicalRecords(String healthCode,
			Collection<File> medicalRecord) {
		// TODO Auto-generated method stub
		
	}

	public Collection<File> getMedicalRecords(String healthCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Patient> getFamilyMemberDetails(String healthCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Patient> getPatientByDisease(String diseaseName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void grantAccessToDoctor(String healthCodeOfDoc, Date date) {
		// TODO Auto-generated method stub
		
	}

	public void grantFamilyAccesstoDoctor(String heathCodeOfDoc, Date date) {
		// TODO Auto-generated method stub
		
	}

	

}
