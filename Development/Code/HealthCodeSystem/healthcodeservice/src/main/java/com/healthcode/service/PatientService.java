package com.healthcode.service;

import java.io.File;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.healthcode.dao.PatientDao;
import com.healthcode.entity.Patient;


public interface PatientService extends CoreService<Patient>{
	
	/**
	 * 
	 * Gets the details of all the patients, Why need this kind of service??? TODO: Task
	 * @param List of keys
	 * @return Patients
	 * @throws Exception
	 */

	public List<Patient> getAllPatients() throws Exception;
	
	public Collection<Patient> getPatientsByCity(final String cityName);
	
	Collection<Patient> getPersonByDisease(String diseaseName);
	
	void bookDocAppointment(String docCode,Date dateTime);
	
	void uploadMedicalRecords(final String healthCode, Collection<File> medicalRecord);
	
	Collection<File> getMedicalRecords(final String healthCode);
	
	Collection<Patient> getFamilyMemberDetails(final String healthCode);
	
	Collection<Patient> getPatientByDisease(final String diseaseName);
	
	void grantAccessToDoctor(final String healthCodeOfDoc, Date date);
	
	void grantFamilyAccesstoDoctor(final String heathCodeOfDoc, Date date);
	
}
