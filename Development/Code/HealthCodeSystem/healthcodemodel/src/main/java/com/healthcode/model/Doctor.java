package com.healthcode.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * This POJO represents 'Doctor' collection in DB 
 *
 */
@Document(collection="Doctor_Details")
public class Doctor extends PersonDetails{
	
	// This code is same as healthCode for doctors,
	// I don't want to generate separate code for them
	// If Doctor logins with his code, he will be in doc role.
	private String doctorCode;
	private String registrationCode;
	private String diploma;
	private String board;
	private List<String> specilizations;
	private List<String> Hospitals;
	private Double fee;
	private Boolean isActive;
	//Self description of the doctor about his background and history.
	private String description;
	private Integer appointmentDuration;
	private Integer advanceBookingDays;
	private Integer yearsOfExp;
	
	
	public String getRegistrationCode() {
		return registrationCode;
	}
	public void setRegistrationCode(String registrationCode) {
		this.registrationCode = registrationCode;
	}
	public String getDoctorCode() {
		return doctorCode;
	}
	public void setDoctorCode(String doctorCode) {
		this.doctorCode = doctorCode;
	}
	
	public List<String> getSpecilizations() {
		return specilizations;
	}
	public void setSpecilizations(List<String> specilizations) {
		this.specilizations = specilizations;
	}
	public List<String> getHospitals() {
		return Hospitals;
	}
	public void setHospitals(List<String> hospitals) {
		Hospitals = hospitals;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public String getDiploma() {
		return diploma;
	}
	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getAppointmentDuration() {
		return appointmentDuration;
	}
	public void setAppointmentDuration(Integer appointmentDuration) {
		this.appointmentDuration = appointmentDuration;
	}
	public Integer getAdvanceBookingDays() {
		return advanceBookingDays;
	}
	public void setAdvanceBookingDays(Integer advanceBookingDays) {
		this.advanceBookingDays = advanceBookingDays;
	}
	public Integer getYearsOfExp() {
		return yearsOfExp;
	}
	public void setYearsOfExp(Integer yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}
	
	
	
}
