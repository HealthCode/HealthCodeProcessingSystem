package com.healthcode.service;

import java.util.Collection;

import com.healthcode.model.Address;
import com.healthcode.model.ContactInfo;
import com.healthcode.model.Patient;
import com.healthcode.model.PersonDetails;

public interface PersonDetailsService extends CoreService<PersonDetails>{
	
	Collection<PersonDetails> getPersonByAgeRange(Integer start, Integer end);
	
	Collection<PersonDetails> getPersonByGender(String gender);
	
	Collection<PersonDetails> getPersonByGenderAndAge(String geneder,Integer start, Integer end);
	
	PersonDetails getPersonByContactNo(final String contantNo);
	
	PersonDetails getPersonByEMail(final String eMail);
	
	void addFamilyMember(final String groupId,PersonDetails member);

}
