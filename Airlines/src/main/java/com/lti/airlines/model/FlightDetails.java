package com.lti.airlines.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flightDetails2")
public class FlightDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int flightId;
	String source;
	String destination;
	String departure_time;
	String arrival_time;
	String journey_date;
	int available_seats;
	String retruning;
	String cost;
	
	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparture_time() {
		return departure_time;
	}

	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public String getJourney_date() {
		return journey_date;
	}

	public void setJourney_date(String journey_date) {
		this.journey_date = journey_date;
	}

	public int getAvailable_seats() {
		return available_seats;
	}

	public void setAvailable_seats(int available_seats) {
		this.available_seats = available_seats;
	}

	public String isRetruning() {
		return retruning;
	}

	public void setRetruning(String retruning) {
		this.retruning = retruning;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}
	
	public FlightDetails(String source, String destination, String departure_time, String arrival_time,
			String journey_date, int available_seats, String retruning, String cost) {
		super();
		this.source = source;
		this.destination = destination;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.journey_date = journey_date;
		this.available_seats = available_seats;
		this.retruning = retruning;
		this.cost = cost;
	}

	public FlightDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
}
