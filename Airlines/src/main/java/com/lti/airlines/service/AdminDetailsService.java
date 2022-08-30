package com.lti.airlines.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airlines.model.AdminDetails;
import com.lti.airlines.repo.AdminDetailsRepository;

@Service 
public class AdminDetailsService {

	@Autowired
	AdminDetailsRepository repo;
	
	public void saveAll(AdminDetails reg)
	{
		repo.save(reg);
	}
	
	public List<AdminDetails> getAdminDetails() {
		return repo.findAll();
	}

	public List<AdminDetails> loginAdmin(String userid, String password) {
		return repo.findByUseridAndPassword(userid, password);
	}
}
