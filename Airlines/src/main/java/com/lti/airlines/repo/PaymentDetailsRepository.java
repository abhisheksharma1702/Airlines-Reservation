package com.lti.airlines.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.airlines.model.PaymentDetails;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails, Integer> {
	
}
