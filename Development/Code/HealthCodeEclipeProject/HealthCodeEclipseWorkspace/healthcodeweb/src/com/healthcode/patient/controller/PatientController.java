package com.healthcode.patient.controller;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.healthcode.patient.service.PatientService;
import com.healthcode.springdata.patient.model.domain.Patient;

@Controller
public class PatientController {
	
	@Autowired
	PatientService patientService;
	@RequestMapping("/patientdetails.do")
	public ModelAndView getPersonDetails() throws Exception
	{
		ModelAndView patientMav = new ModelAndView("patientDetails");
		List<Patient> patients = patientService.getPatientDetails();
		
		JSONArray jsonPatients = JSONArray.fromObject(patients);
		patientMav.addObject("patients", jsonPatients.toString());
		return patientMav;
	}
	
	@RequestMapping("/savepatientdetails.do")
	public ModelAndView savePersonDetails() throws Exception
	{
		ModelAndView patientMav = new ModelAndView("patientDetails");
		Patient newPatient = new Patient();
		newPatient.setFirstName("SpringMongo FirstName");
		newPatient.setLastName("SpringMongo LastName");
		newPatient.setHealthCode("0105");
		patientService.savePatientDetails(newPatient);
		return patientMav;
	}	
}
