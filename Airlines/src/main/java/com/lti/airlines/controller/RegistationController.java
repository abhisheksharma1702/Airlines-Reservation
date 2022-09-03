package com.lti.airlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airlines.model.Registation;
import com.lti.airlines.service.RegistationService;

@RestController
public class RegistationController {

	@Autowired
	private RegistationService regService;
	
	@PostMapping("/registation")
	public void add(@RequestBody Registation reg)
	{
		regService.saveAll(reg);
	}
	
	@PutMapping("/updateUser")
	public void update(@RequestBody Registation reg)
	{
		regService.update_User(reg);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void delete(@PathVariable Integer id ,@RequestBody Registation reg)
	{
		regService.delete_User(id);
	}
	
	@GetMapping("/login/{email}/{password}")
	public List<Registation> login(@PathVariable String email, @PathVariable String password){
		return regService.login(email, password);
	}
	
	@GetMapping("/user/{email}")
	public Registation user(@PathVariable String email){
		return regService.getUser(email);
	}
}
