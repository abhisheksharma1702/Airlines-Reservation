package com.lti.airlines.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="tds6")
public class TicketDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JoinColumn(name="ticketid")
	private int ticketid;
	private int no_of_pasanger;
	private String type_of_ticket;
	private String date_of_booking;
	private String status;
	private int flightId;
	private String ticket_amount;
	private int userid;
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getNo_of_pasanger() {
		return no_of_pasanger;
	}
	public void setNo_of_pasanger(int no_of_pasanger) {
		this.no_of_pasanger = no_of_pasanger;
	}
	public String getType_of_ticket() {
		return type_of_ticket;
	}
	public void setType_of_ticket(String type_of_ticket) {
		this.type_of_ticket = type_of_ticket;
	}
	public String getDate_of_booking() {
		return date_of_booking;
	}
	public void setDate_of_booking(String date_of_booking) {
		this.date_of_booking = date_of_booking;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flight_id) {
		this.flightId = flight_id;
	}
	public String getTicket_amount() {
		return ticket_amount;
	}
	public void setTicket_amount(String ticket_amount) {
		this.ticket_amount = ticket_amount;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int user_id) {
		this.userid = user_id;
	}
	public TicketDetails(int no_of_pasanger, String type_of_ticket, String date_of_booking, String status,
			int flight_id, String ticket_amount, int user_id) {
		super();
		this.no_of_pasanger = no_of_pasanger;
		this.type_of_ticket = type_of_ticket;
		this.date_of_booking = date_of_booking;
		this.status = status;
		this.flightId = flight_id;
		this.ticket_amount = ticket_amount;
		this.userid = user_id;
	}
	public TicketDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
}
