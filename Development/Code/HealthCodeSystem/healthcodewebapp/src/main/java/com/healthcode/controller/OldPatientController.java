package com.healthcode.controller;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Component;

import com.healthcode.entity.Patient;
import com.healthcode.service.OldPatientService;


@Controller
public class OldPatientController {
	
	
	@Autowired
	public OldPatientService patientService;
	
	
	@RequestMapping("/allpatients.do")
	public ModelAndView getAllPatients() throws Exception
	{
		ModelAndView patientMav = new ModelAndView("patientDetails");
		List<Patient> patients = patientService.getAllPatients();
		
		JSONArray jsonPatients = JSONArray.fromObject(patients);
		patientMav.addObject("patients", jsonPatients.toString());
		return patientMav;
	}
	
	@RequestMapping(value = "/savepatientdetails.do",
					method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView savePersonDetails(@RequestParam(value = "healthCode", required=false)
											String healthCode) throws Exception
	{
		ModelAndView patientMav = new ModelAndView("patientDetails");
		Patient newPatient = new Patient();
		newPatient.setHealthCode(healthCode);
		patientService.savePatientDetails(newPatient);
		//patientService.AddEntry(newPatient);
		
		return patientMav;
	}
	
	@RequestMapping(value = "/getpatient.do",
					method = {RequestMethod.GET})
	public ModelAndView getPatient(@RequestParam(value = "healthCode", required=false)
									String healthCode)	throws Exception
	{
		
		ModelAndView patientMav = new ModelAndView("patientDetails");
		Patient patients = patientService.getPatient(healthCode);
		//Patient patients = patientService.getEntry(healthCode);
		
		JSONObject jsonPatient = JSONObject.fromObject(patients);
		patientMav.addObject("patients", jsonPatient.toString());
		return patientMav;
	}
	
}
