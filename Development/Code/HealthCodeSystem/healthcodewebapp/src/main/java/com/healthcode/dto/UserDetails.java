package com.healthcode.dto;

import com.healthcode.entity.Address;
import com.healthcode.entity.ContactInfo;

public class UserDetails {

	private String firstName;

	private String lastName;

	private String age;

	private String gender;

	protected Address address;

	private ContactInfo contactInfo;

	public String getFirstName() {
		return firstName;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
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
	
}
