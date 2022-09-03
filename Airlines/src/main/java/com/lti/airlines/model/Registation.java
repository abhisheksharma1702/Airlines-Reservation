package com.lti.airlines.model;
import javax.persistence.*;

@Entity
@Table(name="User_Registation1")
public class Registation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Registation_ID")
	private int id;
	private String title;
	private String firstName;
	private String lastName;
	@Column(unique=true) 
	private String email;
	private String password;
	private String dob;
	private String phoneNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Registation(String title, String firstName, String lastName, String email, String password, String dob,
			String phoneNumber) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
	}
	public Registation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
