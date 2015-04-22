package com.healthcode.controller;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.healthcode.dto.ResponseMessage;
import com.healthcode.dto.UserDetails;
import com.healthcode.entity.Patient;
import com.healthcode.service.PatientService;

@Controller
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@RequestMapping("new/allpatients.do")
	public ModelAndView getAllPatients() throws Exception
	{
		ModelAndView patientMav = new ModelAndView("patientDetails");
		List<Patient> patients = patientService.getAllPatients();
		
		JSONArray jsonPatients = JSONArray.fromObject(patients);
		patientMav.addObject("patients", jsonPatients.toString());
		return patientMav;
	}
	
	/*
	 * This method will register a new patient in the 
	 * 
	 * 
	 */
	@RequestMapping(value = "new/savepatientdetails.do",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<ResponseMessage<String>> savePersonDetails(@RequestBody UserDetails userDetails) throws Exception
	{
		Patient newPatient = new Patient();
		newPatient.setFirstName(userDetails.getFirstName());
		newPatient.setLastName(userDetails.getLastName());
		patientService.AddEntry(newPatient);
		
		ResponseMessage<String> response = new ResponseMessage.Builder<String>().success("User created").build();
		
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "new/getpatient.do",
					method = {RequestMethod.GET})
	public ModelAndView getPatient(@RequestParam(value = "healthCode", required=false)
									String healthCode)	throws Exception
	{
		
		ModelAndView patientMav = new ModelAndView("patientDetails");
		Patient patients = patientService.getEntry(healthCode);
		
		JSONObject jsonPatient = JSONObject.fromObject(patients);
		patientMav.addObject("patients", jsonPatient.toString());
		return patientMav;
	}
	
}
