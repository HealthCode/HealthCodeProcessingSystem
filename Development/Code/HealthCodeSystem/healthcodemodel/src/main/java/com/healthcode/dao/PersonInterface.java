package com.healthcode.dao;

import java.util.Collection;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthcode.entity.PersonDetails;

@Repository
public interface PersonInterface<T>{

	T getPersonByHealthCode(String healthCode);
	
	Collection<T> getPersonByCity(String cityName);
	
	Collection<T> getPersonByAgeRange(Integer start, Integer end);
	
	Collection<T> getPersonByGender(String gender);
	
	Collection<T> getPersonByGenderAndAge(String geneder,Integer start, Integer end);
	
}
