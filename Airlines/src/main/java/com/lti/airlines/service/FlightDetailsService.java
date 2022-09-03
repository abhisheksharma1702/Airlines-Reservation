package com.lti.airlines.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airlines.model.FlightDetails;
import com.lti.airlines.repo.FlightDetailsRepository;

@Service
public class FlightDetailsService {

	@Autowired
	private FlightDetailsRepository flightDetailsRepository;
	
	public List<FlightDetails> view(){
		return flightDetailsRepository.findAll();
	}
	
	public List<FlightDetails> getBySourceAndDestination(String source, String des) {
		return flightDetailsRepository.findBySourceAndDestination(source, des);
	}

	public void save(FlightDetails flightDetails) {
		flightDetailsRepository.save(flightDetails);
	}
	
	public void deleteFlight(Integer id)
	{
		Optional<FlightDetails> findFlightById=flightDetailsRepository.findById(id);
		if(findFlightById.isPresent())
		{
			flightDetailsRepository.deleteById(id);
		}
	}
	
	public FlightDetails findById(Integer id) {
		return flightDetailsRepository.findByFlightId(id);
	}
	
}

