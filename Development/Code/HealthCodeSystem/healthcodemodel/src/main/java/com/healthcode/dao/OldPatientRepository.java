package com.healthcode.dao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.healthcode.entity.Patient;

/**
*
* @author Rama Vadlamudi
*
* PatientRepository handles queries provided by Out-Of-The-Box
* queries provided by MongoDB and custom queries defined in CustomPatientRepository
*
*/
@Repository
public interface OldPatientRepository extends MongoRepository<Patient, String>, CustomPatientRepository{
}
