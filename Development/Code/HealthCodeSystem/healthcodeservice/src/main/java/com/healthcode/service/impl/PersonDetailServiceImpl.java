package com.healthcode.service.impl;

import java.util.Collection;

import com.healthcode.model.Patient;
import com.healthcode.model.PersonDetails;
import com.healthcode.service.PatientService;
import com.healthcode.service.PersonDetailsService;

public class PersonDetailServiceImpl extends CoreServiceImpl<PersonDetails> implements PersonDetailsService{

	public Collection<PersonDetails> getPersonByAgeRange(Integer start,
			Integer end) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<PersonDetails> getPersonByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<PersonDetails> getPersonByGenderAndAge(String geneder,
			Integer start, Integer end) {
		// TODO Auto-generated method stub
		return null;
	}

	public PersonDetails getPersonByContactNo(String contantNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public PersonDetails getPersonByEMail(String eMail) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addFamilyMember(String groupId, PersonDetails member) {
		// TODO Auto-generated method stub
		
	}

}
