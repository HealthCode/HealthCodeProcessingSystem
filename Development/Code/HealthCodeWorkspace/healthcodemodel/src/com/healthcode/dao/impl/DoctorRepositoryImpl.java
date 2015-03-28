package com.healthcode.dao.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.healthcode.dao.Contants;
import com.healthcode.dao.DoctorRepository;
import com.healthcode.model.Doctor;
import com.mongodb.DBObject;
import com.mongodb.QueryBuilder;


public class DoctorRepositoryImpl extends BaseRepositoryImpl<Doctor> implements DoctorRepository {

	DoctorRepositoryImpl()
	{
		mongoOp = (MongoOperations) getMongoDBInstance();
	}
	
	@Override
	public Doctor getPersonByHealthCode(String healthCode) {
		
		//Query 'Patient' collection by Health Code
		Query searchPatientbyHealthCode = new Query(Criteria
								.where(Contants.HEALTHCODE)
								.is(healthCode)); 
		Doctor doctor = mongoOp.findOne(searchPatientbyHealthCode,Doctor.class); 
		
		return doctor;
	}
	

	@Override
	public Collection<Doctor> getPersonByCity(String cityName) {
		
		//Query 'Patient' collection by Health Code
		Query searchPatientbyHealthCode = new Query(Criteria
								.where(Contants.CITY)
								.is(cityName)); 
		Collection<Doctor> doctor = mongoOp.find(searchPatientbyHealthCode,Doctor.class); 
		
		return doctor;
	}

	@Override
	public Collection<Doctor> getPersonByAgeRange(Integer start,
			Integer end) {
		//Query 'Patient' collection by Health Code

		
		DBObject query1 = QueryBuilder.start(Contants.EXPERIENCE).lessThanEquals(end).get();
		QueryBuilder query  = QueryBuilder.start(Contants.EXPERIENCE).greaterThanEquals(start).and(query1);
				
		
	//	Doctor doctor = mongoOp.(query,Doctor.class); 
		
		return null;
	}

	@Override
	public Collection<Doctor> getPersonByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Doctor> getPersonByGenderAndAge(String geneder,
			Integer start, Integer end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor getDoctorBySpecilization(String specilization) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor getDoctorByArea(String area) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor getDoctorByRating(String specilization) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Doctor> getDoctorsByHospital(String hospitalName) {
		// TODO Auto-generated method stub
		return null;
	}

}
