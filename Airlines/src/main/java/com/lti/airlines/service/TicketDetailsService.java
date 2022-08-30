package com.lti.airlines.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airlines.model.TicketDetails;
import com.lti.airlines.repo.TicketDetailsRepository;

@Service
public class TicketDetailsService {

	@Autowired
	TicketDetailsRepository tdr;
	
	public void saveAll(TicketDetails td)
	{
		tdr.save(td);
	}
	
	public List<TicketDetails> allticket(Integer id)
	{
		return tdr.findAllByUserid(id);
	}
	
	public void cancelTicket(Integer id)
	{
		if(id!=null) {
		TicketDetails t = tdr.findByTicketid(id);
		t.setStatus("Canceled");
		t.setTicket_amount("0");
		tdr.save(t);
		}
	}
	
	public void confirmTicket(Integer id)
	{
		if(id!=null) {
		TicketDetails t = tdr.findByTicketid(id);
		t.setStatus("Booked");
		tdr.save(t);
		}
	}
}
