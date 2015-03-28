package com.healthcode.dao;

import java.util.Collection;
import com.healthcode.model.MedicalUnit;

public interface MedicalUnitInterface{

	MedicalUnit getHospitalByName(String hospitalName);
	
	Collection<MedicalUnit> getHospitalsByCity(String cityName);
	
}
