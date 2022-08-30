package com.lti.airlines.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.airlines.model.Registation;

public interface RegistationRepository extends JpaRepository<Registation,Integer> {
	
	 List<Registation> findByEmailAndPassword(String email, String password);
}
