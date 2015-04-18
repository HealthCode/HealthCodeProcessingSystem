package com.healthcode.dao.impl;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.healthcode.dao.Constants;
import com.healthcode.dao.PersonDao;
import com.healthcode.entity.Patient;


@Repository("Person")
public class PersonDaoImpl<T> implements PersonDao<T>,InitializingBean, DisposableBean{

	@Autowired
	private MongoTemplate mongoDBInstance;
	
	@Autowired
	private MongoOperations mongoOp = null;
	
	PersonDaoImpl()
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

//	@Override
//	public T getPersonByHealthCode(String healthCode) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public T getPersonByHealthCode(String healthCode) {
		System.out.println("Base Dao : Reading entry from DB");
		MongoOperations mongoOp = (MongoOperations) mongoDBInstance;
		
		//Query 'Patient' collection by Health Code
		Query searchPatientbyHealthCode = new Query(Criteria
								.where(Constants.HEALTHCODE)
								.is(healthCode)); 
		
		T entity = (T) mongoOp.findOne(searchPatientbyHealthCode,Patient.class); //TODO : how to get doctor?
		
		return (T) entity;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
    @PostConstruct
    public void customInit()
    {
        System.out.println("Base Method customInit() invoked...");
    }
     
    @PreDestroy
    public void customDestroy()
    {
        System.out.println("Base Method customDestroy() invoked...");
    }

	

}
