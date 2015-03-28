package com.healthcode.service;

public interface NotificationService {
	
	public static final String MOBILE="mobile";
	
	public static final String EMAIL="email";
	
	void sendNotification(final String destIdOrNumbder);

}
