package com.healthcode.model;

public class MedicalUnit extends ModelEntity{
	
	private String code;
	private String Name;
	MedicalUnitType type;
	Address address;
	private ContactInfo contacts;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public MedicalUnitType getType() {
		return type;
	}
	public void setType(MedicalUnitType type) {
		this.type = type;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public ContactInfo getContacts() {
		return contacts;
	}
	public void setContacts(ContactInfo contacts) {
		this.contacts = contacts;
	}

	
}
