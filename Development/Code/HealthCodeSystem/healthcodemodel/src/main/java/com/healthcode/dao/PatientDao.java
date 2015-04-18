package com.healthcode.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthcode.entity.Patient;

@Repository("Patient")
public interface PatientDao extends PatientRepository,MongoRepository<Patient, String>{

}
