package com.healthcode.dao;

import java.util.Collection;

import com.healthcode.model.PersonDetails;

public interface PersonInterface<T>{

	T getPersonByHealthCode(String healthCode);
	
	Collection<T> getPersonByCity(String cityName);
	
	Collection<T> getPersonByAgeRange(Integer start, Integer end);
	
	Collection<T> getPersonByGender(String gender);
	
	Collection<T> getPersonByGenderAndAge(String geneder,Integer start, Integer end);
	
}
