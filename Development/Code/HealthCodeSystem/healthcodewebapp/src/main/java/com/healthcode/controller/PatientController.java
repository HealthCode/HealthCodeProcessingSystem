package com.healthcode.controller;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/patientdetails")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@RequestMapping("/allpatients.do")
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
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<ResponseMessage<String>> savePersonDetails(@RequestBody UserDetails userDetails) throws Exception
	{
		Patient newPatient = new Patient();
		newPatient.setFirstName(userDetails.getFirstName());
		newPatient.setLastName(userDetails.getLastName());
		newPatient.setGender(userDetails.getGender());
		newPatient.setContacts(userDetails.getContactInfo());
		newPatient.setAge(userDetails.getAge());
		newPatient.setAddress(userDetails.getAddress());
		patientService.AddEntry(newPatient);
		
		System.out.println("User Info"+userDetails);
		ResponseMessage<String> response = new ResponseMessage.Builder<String>().success("User created").build();
		
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/{healthCode}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<ResponseMessage<UserDetails>> getPatient(@PathVariable("healthCode") String healthCode)	throws Exception
	{
		
		Patient patient = patientService.getEntry(healthCode);
		UserDetails userdetails=new UserDetails();
		userdetails.setFirstName(patient.getFirstName());
		userdetails.setLastName(patient.getLastName());
		userdetails.setGender(patient.getGender());
		userdetails.setContactInfo(patient.getContacts());
		userdetails.setAge(patient.getAge());
		userdetails.setAddress(patient.getAddress());
		
		List<UserDetails> result = new ArrayList<UserDetails>();
		result.add(userdetails);
		
		ResponseMessage<UserDetails> response = new ResponseMessage.Builder<UserDetails>().success("Retrieved userdetails").setResult(result).build();
		
		return new ResponseEntity<>(response, HttpStatus.OK);

	}
	
}
