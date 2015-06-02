package com.healthcode.security.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.healthcode.security.entity.UserProfile;
import com.healthcode.security.service.HealthCodeAuthProvider;

@Controller
public class LoginController {
	
	@Autowired
	HealthCodeAuthProvider healthCodeAuthProvider;
	
	@RequestMapping(method=RequestMethod.GET, value="/login.do")
	public String displayLoginPage(){
	 return "login";
	}

	@RequestMapping(method=RequestMethod.GET, value="/register.do")
	public String displayRegistrationPage(){
	 return "signup";
	}

	@RequestMapping(method=RequestMethod.GET, value="/secured/home.do")
	public String displayHomePage(){
	 return "secured/home";
	}
	
	@RequestMapping(value="/login.do", params="errorLogin")
	public String directToLoginPageWithError(Model model){
	 // Adding an attribute to flag that an error happened at login
	 model.addAttribute("loginFailed", true);
	 
	 return "login";
	}

	@RequestMapping(method=RequestMethod.POST, value="/signup.do")
	public String registerUser(HttpServletRequest request, HttpServletResponse response, Model model) throws NoSuchAlgorithmException, UnsupportedEncodingException{
	 String username = request.getParameter("username");
	 String password = request.getParameter("password");
	 String roles = request.getParameter("roles");
	 boolean success = healthCodeAuthProvider.registerUser(username, password, roles);
	 if(success){
		 return "login";
	 }
	 else{
		 model.addAttribute("registrationFailed", true);
		 return "signup";
	 }
	}
}
