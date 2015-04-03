package com.healthcode.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthcode.entity.Doctor;

@Repository
public interface DoctorDao  extends DoctorRepository, MongoRepository<Doctor, String> {

}
