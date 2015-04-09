package com.healthcode.entity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Person_Details")
public class PersonDetails extends ModelEntity{

	
	private String firstName;
	private String lastName;
	private String code;
	private String age;
	private String gender;
	protected Address address;
	private ContactInfo contacts;
	private String groupId;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getHealthCode() {
		return code;
	}
	public void setHealthCode(String healthCode) {
		this.code = healthCode;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ContactInfo getContacts() {
		return contacts;
	}
	public void setContacts(ContactInfo contacts) {
		this.contacts = contacts;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	
	
}
