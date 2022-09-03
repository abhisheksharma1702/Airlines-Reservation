package com.lti.airlines.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.airlines.model.FlightDetails;

public interface FlightDetailsRepository extends JpaRepository<FlightDetails, Integer> {
	
	List<FlightDetails> findBySourceAndDestination(String source, String destination);
	
	FlightDetails findByFlightId(Integer flightId);
}
