package com.healthcode.patient.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthcode.springdata.patient.model.domain.Patient;

/**
 * 
 * @author Rama Vadlamudi
 *
 *	PatientRepository handles queries provided by Out-Of-The-Box 
 *	queries provided by MongoDB and custom queries defined in CustomPatientRepository
 *
 */
@Repository
public interface PatientRepository extends MongoRepository<Patient, String>, CustomPatientRepository{
}