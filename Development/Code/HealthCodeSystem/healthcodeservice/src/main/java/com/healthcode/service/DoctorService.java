package com.healthcode.service;

import java.util.Collection;

import com.healthcode.model.Doctor;

public interface DoctorService extends CoreService<Doctor>{

	Collection<Doctor> getDoctorsBySpecilization(String specilization);
	
	Collection<Doctor> getDoctorssByArea(String area);
	
	Collection<Doctor> getDoctorByRating(String specilization,String rating);
	
	Collection<Doctor> getDoctorsByHospital(String hospitalName);
	
}
