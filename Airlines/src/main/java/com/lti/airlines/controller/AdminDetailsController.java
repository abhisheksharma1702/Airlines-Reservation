package com.lti.airlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airlines.model.AdminDetails;
import com.lti.airlines.service.AdminDetailsService;

@RestController
public class AdminDetailsController {

	@Autowired
	private AdminDetailsService addS;
	
	@PostMapping("/addAdminDetails")
	public void add(@RequestBody AdminDetails s)
	{
		addS.saveAll(s);
	}
	
	@GetMapping("/adminlogin/{userid}/{password}")
	public List<AdminDetails> loginAdmin(@PathVariable String userid, @PathVariable String password){
		return addS.loginAdmin(userid, password);
	}
	
	@GetMapping("/adminDetails")
	public List<AdminDetails> loginAdminDetails(){
		return addS.getAdminDetails();
	}
}
