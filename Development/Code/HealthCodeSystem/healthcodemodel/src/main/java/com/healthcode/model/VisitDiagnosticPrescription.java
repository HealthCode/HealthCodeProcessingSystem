package com.healthcode.model;

import java.util.Collection;

public class VisitDiagnosticPrescription {
	
	//TODO : This is mandatory filed, @required?
	private String healthCode;
	private String visitEntryRef;
	private Collection<String> testNames;
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
	public Collection<String> getTestNames() {
		return testNames;
	}
	public void setTestNames(Collection<String> testNames) {
		this.testNames = testNames;
	}
	
	
}
