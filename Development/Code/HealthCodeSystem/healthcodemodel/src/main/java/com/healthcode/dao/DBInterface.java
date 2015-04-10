package com.healthcode.dao;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

public interface DBInterface {

	MongoTemplate getMongoDBInstance();
	MongoOperations getMongoOp();
}
