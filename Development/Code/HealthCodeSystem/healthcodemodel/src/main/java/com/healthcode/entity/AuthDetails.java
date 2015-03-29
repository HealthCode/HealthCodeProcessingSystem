package com.healthcode.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * This POJO represents 'Authentication Details' collection in DB 
 *
 */
@Document(collection="Auth_Details")

public class AuthDetails extends ModelEntity{

	private String healthCode;
	//TODO : has to be a encrypted field.
	private String password;
	// This will be set to true, if user registers as doctor. How to ensure that is actully a doc?
	private String role; 
	private Date passwordModified;
	private String helpQuestion;
	private String helpAnswer;
	
	//Check if the person with this health code is a doctor. 
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getHealthCode() {
		return healthCode;
	}
	public void setHealthCode(String healthCode) {
		this.healthCode = healthCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getPasswordModified() {
		return passwordModified;
	}
	public void setPasswordModified(Date passwordModified) {
		this.passwordModified = passwordModified;
	}
	public String getHelpQuestion() {
		return helpQuestion;
	}
	public void setHelpQuestion(String helpQuestion) {
		this.helpQuestion = helpQuestion;
	}
	public String getHelpAnswer() {
		return helpAnswer;
	}
	public void setHelpAnswer(String helpAnswer) {
		this.helpAnswer = helpAnswer;
	}
	

}
