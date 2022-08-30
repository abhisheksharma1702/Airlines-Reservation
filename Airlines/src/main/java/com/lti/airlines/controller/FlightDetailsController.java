package com.lti.airlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airlines.model.FlightDetails;
import com.lti.airlines.service.FlightDetailsService;

@RestController
public class FlightDetailsController {
	
	@Autowired
	private FlightDetailsService flightDetailsService;

	@GetMapping("allFlights/{source}/{destination}")
	public List<FlightDetails> list(@PathVariable String source, @PathVariable String destination){
		return flightDetailsService.getBySourceAndDestination(source, destination);
	}
	
	@GetMapping("allFlights//")
	public List<FlightDetails> allFlightDetails() {
		return flightDetailsService.view();
	}
	
	@PostMapping("addflight")
	public int add(@RequestBody FlightDetails flightDetails) {
		flightDetailsService.save(flightDetails);
		return flightDetails.getFlightId();
	}
	
	@DeleteMapping("deleteFlight/{id}")
	public void delete(@PathVariable Integer id)
	{
		flightDetailsService.deleteFlight(id);
	}
	
}
 