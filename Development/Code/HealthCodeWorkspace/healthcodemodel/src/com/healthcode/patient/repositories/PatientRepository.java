package com.healthcode.patient.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthcode.springdata.patient.model.domain.Patient;

@Repository
public interface PatientRepository extends MongoRepository<Patient, String>{
}