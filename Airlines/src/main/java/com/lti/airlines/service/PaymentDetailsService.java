package com.lti.airlines.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airlines.model.PaymentDetails;
import com.lti.airlines.repo.PaymentDetailsRepository;

@Service
public class PaymentDetailsService {

	@Autowired
	PaymentDetailsRepository pdr;
	
	public void saveAll(PaymentDetails pd)
	{
		pdr.save(pd);
	}
}
