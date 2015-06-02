package com.healthcode.security.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthcode.security.entity.UserProfile;


//import com.healthcode.security.entity.UserProfile;
@Repository
public interface UserProfileRepository extends UserProfileInterface, MongoRepository<UserProfile, String>{
	
}