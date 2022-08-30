package com.lti.airlines.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.airlines.model.*;
import java.util.*;

@Repository
public interface SeatRepository extends JpaRepository<Seat,Integer> {

	public List<Seat> findAllByFlightIdAndStatus(Integer flight_id, Integer sataus);
	
	public Seat findSeatByFlightIdAndSeatNo(Integer flight_id, String seat_no);
	
}

