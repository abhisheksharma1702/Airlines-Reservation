package com.lti.airlines.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airlines.model.MailDetails;
import com.lti.airlines.service.MailDetailsService;

@RestController
public class MailDetailsController {

	 @Autowired 
	 private MailDetailsService emailService;
	 
	    @PostMapping("/sendMail")
	    public String
	    sendMail(@RequestBody MailDetails details)
	    {
	        String status
	            = emailService.sendSimpleMail(details);
	 
	        return status;
	    }
	    
	    @GetMapping("/forgetPassword/{email}")
	    public String forgetPassword(@PathVariable String email)
	    {
	    	String status=emailService.forgetPassword(email);
	    	return status;
	    }
	    
}