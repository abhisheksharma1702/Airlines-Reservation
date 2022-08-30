package com.lti.airlines.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airlines.model.PassangerDetails;
import com.lti.airlines.repo.PassangerDetailsRepository;

@Service
public class PassangerDetailsService {

	@Autowired
	private PassangerDetailsRepository pdr;
	
	public void saveAll(PassangerDetails pd)
	{
		pdr.save(pd);
	}
	
	public void getDetails() {
		pdr.findAll();
	}
}
