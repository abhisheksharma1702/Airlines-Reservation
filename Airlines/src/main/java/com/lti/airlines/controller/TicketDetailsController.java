package com.lti.airlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airlines.model.TicketDetails;
import com.lti.airlines.service.TicketDetailsService;

@RestController
public class TicketDetailsController {

	@Autowired
	TicketDetailsService tds;
	
	@PostMapping("/ticket")
	public int add(@RequestBody TicketDetails td)
	{
		tds.saveAll(td);
		return td.getTicketid();
	}
	
	@PutMapping("/cancelticket/{Id}")
	public void cancelTicket(@PathVariable Integer Id, @RequestBody List<TicketDetails> t)
	{
		tds.cancelTicket(Id);
	}
	
	@PutMapping("/confirmTicket/{Id}")
	public void confirmTicket(@PathVariable Integer Id, @RequestBody Integer s)
	{
		tds.confirmTicket(Id);
	}
	
	@GetMapping("/findTicketsForUser/{id}")
	public List<TicketDetails> findForUser(@PathVariable Integer id){
		return tds.allticket(id);
	}
}
