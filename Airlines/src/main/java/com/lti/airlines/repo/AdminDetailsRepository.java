package com.lti.airlines.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.airlines.model.AdminDetails;

public interface AdminDetailsRepository extends JpaRepository<AdminDetails, String> {
	
	List<AdminDetails> findByUseridAndPassword(String userid, String password);
}
