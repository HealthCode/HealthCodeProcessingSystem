package com.healthcode.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author Parvath Bingi
 * 
 * This POJO represents 'Visit Entry Details' collection in DB 
 *
 */
@Document(collection="Visit_Entry_Details")
public class VisitEntry {
	@Id
	private String Id;
	private String visitEntryRef;
	private String doctorCode;
	private String healthCode;
	private List<VisitPrescriptions> prescriptions;
	private Date visitDate;
	
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getVisitEntryRef() {
		return visitEntryRef;
	}
	public void setVisitEntryRef(String visitEntryRef) {
		this.visitEntryRef = visitEntryRef;
	}
	public String getDoctorCode() {
		return doctorCode;
	}
	public void setDoctorCode(String doctorCode) {
		this.doctorCode = doctorCode;
	}
	public String getHealthCode() {
		return healthCode;
	}
	public void setHealthCode(String healthCode) {
		this.healthCode = healthCode;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
	public List<VisitPrescriptions> getPrescriptions() {
		return prescriptions;
	}
	public void setPrescriptions(List<VisitPrescriptions> prescriptions) {
		this.prescriptions = prescriptions;
	}
	
	
	
	
}
