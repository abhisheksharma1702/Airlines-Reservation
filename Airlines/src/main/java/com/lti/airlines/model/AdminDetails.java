package com.lti.airlines.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_Details")
public class AdminDetails {
	
	@Id
	private String userid;
	private String password;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AdminDetails(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	public AdminDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
}
