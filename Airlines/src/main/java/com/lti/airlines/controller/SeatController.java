package com.lti.airlines.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;


import com.lti.airlines.model.Seat;
import com.lti.airlines.service.SeatService;

@RestController
public class SeatController {

	@Autowired
	SeatService seatService;
	
	@GetMapping("/getAvailableSeatByFlight_id/{flight_id}")
	public List<Seat> getAvailableSeatByFlightId(@PathVariable int flight_id)
	{
		return seatService.getAvailableSeatByFlightId(flight_id);
	}
	
	@DeleteMapping("deleteSeat/{id}")
	public void delete(@PathVariable Integer id){
		seatService.delete(id);
	}
	
	@PostMapping("/addSeat")
	public Seat addSeat(@RequestBody Seat s)
	{
		return seatService.addSeat(s);	
	}
	
	
	@PutMapping("/bookSeat/{id}/{seat}")
	public void bookSeat(@PathVariable Integer id, @PathVariable String seat, @RequestBody String  string)
	{
		seatService.bookSeat(id, seat);
	}
	
	@GetMapping("/allSeats")
	public List<Seat> listView()
	{
		return seatService.listSeat();
	}
}

