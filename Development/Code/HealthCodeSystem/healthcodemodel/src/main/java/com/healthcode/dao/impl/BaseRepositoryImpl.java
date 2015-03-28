package com.healthcode.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.healthcode.dao.PersonInterface;


public abstract class BaseRepositoryImpl<T> implements PersonInterface<T>{

	@Autowired
	private MongoTemplate mongoDBInstance;
	MongoOperations mongoOp = null;
	
	
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

	public Page<T> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public void delete(T arg0) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Iterable<? extends T> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<T> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public T findOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends T> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends T> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
