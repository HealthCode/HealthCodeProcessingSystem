package com.healthcode.service.impl;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.healthcode.entity.Patient;
import com.healthcode.entity.PersonDetails;
import com.healthcode.service.PatientService;
import com.healthcode.service.PersonDetailsService;


@Component
public class PersonDetailServiceImpl extends CoreServiceImpl<PersonDetails> implements PersonDetailsService{

//	@Override
//	public Collection<PersonDetails> getPersonByAgeRange(Integer start,
//			Integer end) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public Collection<PersonDetails> getPersonByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Collection<PersonDetails> getPersonByGenderAndAge(String geneder,
			Integer start, Integer end) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PersonDetails getPersonByContactNo(String contantNo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PersonDetails getPersonByEMail(String eMail) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addFamilyMember(String groupId, PersonDetails member) {
		// TODO Auto-generated method stub
		
	}

}
