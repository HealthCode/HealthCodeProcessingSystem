package com.healthcode.model;

import java.io.File;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author Parvath Bingi
 * 
 * This POJO represents 'Patient Diagnostic Reports' collection in DB 
 *
 */
@Document(collection="Patient_Diagnostic_Details")

public class PatientDiagnosticReports extends ModelEntity{

	//TODO : This is mandatory filed, @required?
	private String healthCode;
	//This could be null for old records
	private String visitEntryRef;
	//Report file stored in DB for each diagnostic suggestion as key
	private Map<String,File> reportFile;

	public String getVisitEntryRef() {
		return visitEntryRef;
	}
	public void setVisitEntryRef(String visitEntryRef) {
		this.visitEntryRef = visitEntryRef;
	}
	public String getHealthCode() {
		return healthCode;
	}
	public void setHealthCode(String healthCode) {
		this.healthCode = healthCode;
	}
	public Map<String, File> getReportFile() {
		return reportFile;
	}
	public void setReportFile(Map<String, File> reportFile) {
		this.reportFile = reportFile;
	}
	
}
