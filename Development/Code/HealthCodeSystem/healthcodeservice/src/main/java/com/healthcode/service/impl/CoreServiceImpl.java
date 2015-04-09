package com.healthcode.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcode.dao.GenericDao;
import com.healthcode.dao.impl.BaseRepositoryImpl;
import com.healthcode.dao.impl.PatientRepositoryImpl;
import com.healthcode.service.CoreService;

@Service
public class CoreServiceImpl<T> implements CoreService<T>{

//	@Autowired
//	GenericDao<T> dao;
	
	public void AddEntry(T entryDetails) throws Exception {
     System.out.println("We are about to save the data");

		//dao.save(entryDetails);
	}

	public void AddEntries(List<T> entries) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void DeleteEntry(T entryDetails) throws Exception {
		//dao.delete(entryDetails);
		
	}

	public void DeleteEntries(List<T> entries) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public T getEntry(String key) {
		//return (T) dao.findOne(key);
		return null;
	}

	public Collection<T> getEntries(Collection<String> keys) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateEntry(String key, T entryDetails) {
		
		
	}

	
}
