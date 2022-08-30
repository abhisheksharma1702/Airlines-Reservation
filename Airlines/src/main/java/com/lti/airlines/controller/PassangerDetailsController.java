package com.lti.airlines.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airlines.model.PassangerDetails;
import com.lti.airlines.service.PassangerDetailsService;

@RestController
public class PassangerDetailsController {

	@Autowired
	PassangerDetailsService pds;
	
	@PostMapping("/passanger")
	public void add(@RequestBody PassangerDetails pd)
	{
		pds.saveAll(pd);
	}
}
