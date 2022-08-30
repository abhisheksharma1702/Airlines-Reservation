package com.lti.airlines.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Seat_details1")
public class Seat {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int seat_id;
	private int flightId;
	private String seatNo; 
	private int status;
	public int getFlightId() {
		return flightId;
	}
	public void setFlight_id(int flightId) {
		this.flightId = flightId;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seat_no) {
		this.seatNo = seat_no;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seat(int flightId, String seat_no,  int status) {
		super();
		this.flightId = flightId;
		this.seatNo = seat_no;
		this.status = status;
	}
	public int getSeat_id() {
		return seat_id;
	}
	public void setSeat_id(int seat_id) {
		this.seat_id = seat_id;
	}
	
	
	
}

