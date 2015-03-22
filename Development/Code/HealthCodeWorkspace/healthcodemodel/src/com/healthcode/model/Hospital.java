package com.healthcode.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author Parvath Bingi
 * 
 * This POJO represents 'Hospital_Details' collection in DB 
 *
 */
@Document(collection="Hospital_Details")

public class Hospital {
	@Id
	private String Id;
	private String name;
	private Address address;

	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
