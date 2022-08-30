package com.lti.airlines.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.airlines.model.TicketDetails;

public interface TicketDetailsRepository extends JpaRepository<TicketDetails, Integer>{

	List<TicketDetails> findAllByUserid(Integer userid);
	
	TicketDetails findByTicketid(Integer ticketid);
}
