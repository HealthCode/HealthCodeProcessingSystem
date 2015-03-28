package com.healthcode.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Collection;
import com.healthcode.model.Hospital;

public interface HospitalRepository extends MongoRepository<Hospital, String>, MedicalUnitInterface{
	
	Collection<Hospital> getHospitalsBySpecilizations(String specilization);
	
	Collection<Hospital> getHospitalByDoctor(String doctorName);
	
}
