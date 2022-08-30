package com.lti.airlines.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.airlines.model.PassangerDetails;

public interface PassangerDetailsRepository extends JpaRepository<PassangerDetails, Integer>{
	
}
