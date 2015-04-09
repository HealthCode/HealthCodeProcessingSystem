package com.healthcode.dao.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.healthcode.dao.Constants;
import com.healthcode.dao.DoctorRepository;
import com.healthcode.entity.Doctor;
import com.healthcode.entity.Patient;
import com.mongodb.DBObject;
import com.mongodb.QueryBuilder;


public class DoctorRepositoryImpl extends BaseRepositoryImpl<Doctor> implements DoctorRepository {

	public Doctor getPersonByHealthCode(String healthCode) {
		//Query 'Patient' collection by Health Code
		Query searchPatientbyHealthCode = new Query(Criteria
								.where(Constants.HEALTHCODE)
								.is(healthCode)); 
		Doctor doctor = getMongoOp().findOne(searchPatientbyHealthCode,Doctor.class); 
		
		return doctor;
	}

	@Override
	public Collection<Doctor> getAllDoctorsBySpecilization(String specilization) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Doctor> getAllDoctorsByAddressCity(String area) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Doctor> getAllDoctorsByRating(String specilization,
			String rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Doctor> getAllDoctorsByHospital(String hospitalName) {
		// TODO Auto-generated method stub
		return null;
	}




}
