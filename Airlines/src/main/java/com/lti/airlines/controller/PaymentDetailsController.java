package com.lti.airlines.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airlines.model.PaymentDetails;
import com.lti.airlines.service.PaymentDetailsService;

@RestController
public class PaymentDetailsController {

	@Autowired
	PaymentDetailsService pds;
	
	@PostMapping("/payment")
	public void add(@RequestBody PaymentDetails pd)
	{
		pds.saveAll(pd);
	}
}
