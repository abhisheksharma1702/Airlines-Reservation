package com.lti.airlines.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pds2")
public class PassangerDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	private String seatNumber;
	private String name;
	private String gender;
	private int age;
	private int ticketid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public PassangerDetails(String seatNumber, String name, String gender, int age, int ticketid) {
		super();
		this.seatNumber = seatNumber;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.ticketid = ticketid;
	}
	public PassangerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
