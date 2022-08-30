package com.lti.airlines.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airlines.model.Registation;
import com.lti.airlines.repo.RegistationRepository;

@Service 
public class RegistationService {

	@Autowired
	private RegistationRepository regrepo;
	
	public void saveAll(Registation reg)
	{
		regrepo.save(reg);
	}
	
	public void update_User(Registation reg)
	{
		Optional<Registation> findUserById=regrepo.findById(reg.getId());
		if(findUserById.isPresent())
		{
			regrepo.save(reg);
		}
	}
	
	public void delete_User(Integer User_id)
	{
		Optional<Registation> findUserById=regrepo.findById(User_id);
		if(findUserById.isPresent())
		{
			regrepo.deleteById(User_id);
		}
	}

	public List<Registation> login(String email, String password) {
		return regrepo.findByEmailAndPassword(email, password);
	}
}
