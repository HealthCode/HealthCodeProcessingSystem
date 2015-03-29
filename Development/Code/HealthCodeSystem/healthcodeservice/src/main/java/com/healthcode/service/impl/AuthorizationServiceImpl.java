package com.healthcode.service.impl;

import java.util.Collection;
import java.util.List;

import com.healthcode.entity.Address;
import com.healthcode.entity.AuthDetails;
import com.healthcode.entity.ContactInfo;
import com.healthcode.service.AuthorizationService;

public class AuthorizationServiceImpl implements AuthorizationService {

	public void AddEntry(AuthDetails entryDetails) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void AddEntries(List<AuthDetails> entries) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void DeleteEntry(AuthDetails entryDetails) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void DeleteEntries(List<AuthDetails> entries) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public AuthDetails getEntry(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<AuthDetails> getEntries(Collection<String> keys) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateEntry(String key, AuthDetails entryDetails) {
		// TODO Auto-generated method stub
		
	}

	public void changePassword(String healthCode, String newPassowrd) {
		// TODO Auto-generated method stub
		
	}

	public void changeAddress(String healthCode, Address newAddress) {
		// TODO Auto-generated method stub
		
	}

	public void changeContactInfo(String healthCode, ContactInfo newContactInfo) {
		// TODO Auto-generated method stub
		
	}

	public String getHelpAnswer(String helathCode, String helpQuestion) {
		// TODO Auto-generated method stub
		return null;
	}

}
