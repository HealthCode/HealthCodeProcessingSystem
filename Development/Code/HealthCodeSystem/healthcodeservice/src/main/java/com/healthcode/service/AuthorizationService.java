package com.healthcode.service;

import com.healthcode.entity.Address;
import com.healthcode.entity.AuthDetails;
import com.healthcode.entity.ContactInfo;

public interface AuthorizationService extends CoreService<AuthDetails> {
	
	void changePassword(final String healthCode, final String newPassowrd);
	
	void changeAddress(final String healthCode, final Address newAddress);
	
	void changeContactInfo(final String healthCode, final ContactInfo newContactInfo);
	
	String getHelpAnswer(final String helathCode, final String helpQuestion);
}
