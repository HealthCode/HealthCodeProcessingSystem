package com.healthcode.model;

import java.util.Date;
import java.util.Map;
import java.util.Set;

public class DocScheduleBookings extends ModelEntity{
	
	private String doctorCode;
	private String Hospital;
	private Date startTime;
	private Date endtime;
	private Integer totalSlots; //Slots are generated based on the appointmentTimeDuration filed in Doctor.java
	private Map<Integer,Date> reservedSloted; //Reserved by patients
	private Map<Integer,Date> availableSlots; // Avaiable slots.
	private Set<Integer> blockedSlots; // Doc may wish to block some slots.
	
	
	public String getDoctorCode() {
		return doctorCode;
	}
	public void setDoctorCode(String doctorCode) {
		this.doctorCode = doctorCode;
	}
	public String getHospital() {
		return Hospital;
	}
	public void setHospital(String hospital) {
		Hospital = hospital;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public Integer getTotalSlots() {
		return totalSlots;
	}
	public void setTotalSlots(Integer totalSlots) {
		this.totalSlots = totalSlots;
	}
	public Map<Integer, Date> getReservedSloted() {
		return reservedSloted;
	}
	public void setReservedSloted(Map<Integer, Date> reservedSloted) {
		this.reservedSloted = reservedSloted;
	}
	public Map<Integer, Date> getAvailableSlots() {
		return availableSlots;
	}
	public void setAvailableSlots(Map<Integer, Date> availableSlots) {
		this.availableSlots = availableSlots;
	}
	public Set<Integer> getBlockedSlots() {
		return blockedSlots;
	}
	public void setBlockedSlots(Set<Integer> blockedSlots) {
		this.blockedSlots = blockedSlots;
	}
	
	
}
