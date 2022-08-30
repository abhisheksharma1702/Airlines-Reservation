package com.lti.airlines.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment_details2")
public class PaymentDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int paymentId;
	private String amount;
	private String payment_method;
	private int userId;
	private int ticketid;
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public PaymentDetails(String amount, String payment_method, int userId, int ticketid) {
		super();
		this.amount = amount;
		this.payment_method = payment_method;
		this.userId = userId;
		this.ticketid = ticketid;
	}
	public PaymentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
}
