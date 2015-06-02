package com.healthcode.security.dao;

import com.healthcode.security.entity.UserProfile;

public interface UserProfileInterface {
	public UserProfile getUserByUserName(String username);
	public boolean createUser(UserProfile userProfile);
}
