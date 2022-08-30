package com.lti.airlines.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.lti.airlines.model.Seat;
import com.lti.airlines.repo.SeatRepository;

@Service
public class SeatService {

	@Autowired
	SeatRepository seatrepo;
	
	public List<Seat> getAvailableSeatByFlightId(int flight_Id)
	{
		return seatrepo.findAllByFlightIdAndStatus(flight_Id, 0);
	}
	
	public void bookSeat(Integer id, String seat)
	{
		Seat s = seatrepo.findSeatByFlightIdAndSeatNo(id, seat);
		s.setStatus(1);
		save(s);
	}
	
	public void delete(Integer id) {
		seatrepo.deleteById(id);
	}
	
	public Seat getSeatId(int seat_id)
	{
		return seatrepo.findById(seat_id).get();
	}
	
	public List<Seat> listSeat()
	{
		return seatrepo.findAll();
	}
	
	public Seat addSeat(Seat s)
	{
		return seatrepo.save(s);
	}
	
	public void save(Seat s)
	{
		seatrepo.save(s);
	}
}

