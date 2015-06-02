package com.healthcode.security.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.healthcode.security.dao.UserProfileInterface;
import com.healthcode.security.entity.UserProfile;

public class UserProfileRepositoryImpl implements UserProfileInterface{

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public UserProfile getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		MongoOperations mongoOp = (MongoOperations) mongoTemplate;
		
		//Query 'Patient' collection by Health Code
		Query searchByUserName = new Query(Criteria
								.where("userName")
								.is(userName)); 
		UserProfile userProfile = mongoOp.findOne(searchByUserName,UserProfile.class);
		return userProfile;
	}
	
	public boolean createUser(UserProfile userProfile) {
		// TODO Auto-generated method stub
		mongoTemplate.insert(userProfile, "UserProfile_Details");
		return true;
	}
	
}
