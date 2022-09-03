package com.lti.airlines.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airlines.model.PassangerDetails;
import com.lti.airlines.repo.PassangerDetailsRepository;

@Service
public class PassangerDetailsService {

	@Autowired
	private PassangerDetailsRepository pdr;
	
	public void saveAll(List<PassangerDetails> pd)
	{
		for(PassangerDetails p : pd) {
			pdr.save(p);
		}
	}
	
	public List<PassangerDetails> getDetails() {
		return pdr.findAll();
	}
}
