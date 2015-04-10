package com.healthcode.dao.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import com.healthcode.dao.PersonInterface;


@Repository
public class BaseRepositoryImpl<T> implements PersonInterface<T>{

	@Autowired
	private MongoTemplate mongoDBInstance;
	
	@Autowired
	private MongoOperations mongoOp = null;
	
	BaseRepositoryImpl()
	{
		mongoOp = getMongoDBInstance();
	}
	
	public MongoTemplate getMongoDBInstance() {
		return mongoDBInstance;
	}

	public void setMongoDBInstance(MongoTemplate mongoDBInstance) {
		this.mongoDBInstance = mongoDBInstance;
	}

	public MongoOperations getMongoOp() {
		return mongoOp;
	}

	public void setMongoOp(MongoOperations mongoOp) {
		this.mongoOp = mongoOp;
	}


	@Override
	public Collection<T> getPersonByAddressCity(String cityName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<T> getPersonByAge(Integer start, Integer end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<T> getPersonByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<T> getPersonByGenderAndAge(String geneder, Integer start,
			Integer end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getPersonByHealthCode(String healthCode) {
		// TODO Auto-generated method stub
		return null;
	}



	

}
