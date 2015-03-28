package com.healthcode.dao.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.healthcode.dao.Constants;
import com.healthcode.dao.DoctorRepository;
import com.healthcode.model.Doctor;
import com.mongodb.DBObject;
import com.mongodb.QueryBuilder;


public class DoctorRepositoryImpl extends BaseRepositoryImpl<Doctor> implements DoctorRepository {

	DoctorRepositoryImpl()
	{
		mongoOp = (MongoOperations) getMongoDBInstance();
	}

	public Doctor getPersonByHealthCode(String healthCode) {
		//Query 'Patient' collection by Health Code
		Query searchPatientbyHealthCode = new Query(Criteria
								.where(Constants.HEALTHCODE)
								.is(healthCode)); 
		Doctor doctor = mongoOp.findOne(searchPatientbyHealthCode,Doctor.class); 
		
		return doctor;
	}

	public Collection<Doctor> getPersonByCity(String cityName) {
		//Query 'Patient' collection by Health Code
		Query searchPatientbyHealthCode = new Query(Criteria
								.where(Constants.CITY)
								.is(cityName)); 
		Collection<Doctor> doctor = mongoOp.find(searchPatientbyHealthCode,Doctor.class); 
		
		return doctor;
	}

	public Collection<Doctor> getPersonByAgeRange(Integer start, Integer end) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Doctor> getPersonByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Doctor> getPersonByGenderAndAge(String geneder,
			Integer start, Integer end) {
		// TODO Auto-generated method stub
		return null;
	}

	public Doctor getDoctorBySpecilization(String specilization) {
		// TODO Auto-generated method stub
		return null;
	}

	public Doctor getDoctorByArea(String area) {
		// TODO Auto-generated method stub
		return null;
	}

	public Doctor getDoctorByRating(String specilization) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Doctor> getDoctorsByHospital(String hospitalName) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
