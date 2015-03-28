package com.healthcode.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author Parvath Bingi
 * 
 * This POJO represents 'Visit Entry Prescriptions' collection in DB 
 *
 */
@Document(collection="Visit_Prescription_Details")
public class VisitMedicalPrescriptions extends ModelEntity{

	//TODO : This is mandatory filed, @required?
	private String healthCode;
	private String visitEntryRef;
	private String medicineName;
	private String dosage;
	private String timings;
	private Integer duration; //No Of Days

	
	public String getHealthCode() {
		return healthCode;
	}
	public void setHealthCode(String healthCode) {
		this.healthCode = healthCode;
	}
	public String getVisitEntryRef() {
		return visitEntryRef;
	}
	public void setVisitEntryRef(String visitEntryRef) {
		this.visitEntryRef = visitEntryRef;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
}
