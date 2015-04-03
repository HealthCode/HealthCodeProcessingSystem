package com.healthcode.service;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface CoreService<T> {
	
	/**
	 * 
	 * Saves the details of  the patients
	 * @param EntryType
	 * @return Patients
	 * @throws Exception
	 */
	void AddEntry(T entryDetails) throws Exception;
	
	/**
	 * 
	 * Saves the details of list of the patients
	 * @param List Of Entities
	 * @return Patients
	 * @throws Exception
	 */
	void AddEntries(List<T> entries) throws Exception;
	
	/**
	 * 
	 * Delete the details of all the patients
	 * @param EntityType
	 * @return Patients
	 * @throws Exception
	 */
	void DeleteEntry(T entryDetails) throws Exception;
	
	/**
	 * 
	 * Deletes the details of all the patients
	 * @param List of keys to Delete
	 * @return Patients
	 * @throws Exception
	 */
	
	void DeleteEntries(List<T> entries) throws Exception;
	/**
	 * 
	 * Gets the details of  the patients
	 * @param key of the entity
	 * @return Patient Entity
	 * @throws Exception
	 */
	
	T getEntry(final String key);
	
	/**
	 * 
	 * Gets the details of all the patients
	 * @param List of keys
	 * @return Patients
	 * @throws Exception
	 */
	Collection<T> getEntries(Collection<String> keys);
	
	/**
	 * 
	 * Updates the details of the patients
	 * @param key of the entity to modify
	 * @param new entity
	 * @return Patients
	 * @throws Exception
	 */
	void updateEntry(final String key,T entryDetails);
}
