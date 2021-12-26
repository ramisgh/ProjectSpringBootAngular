package com.sip.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long id;
	@Column(name="first_name")
	public String firstname;
	@Column(name="last_name")
	public String lastname;
	@Column(name="emailID")
	public String emailID;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public Employee(String firstname, String lastname, String emailID) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailID = emailID;
	}
	public Employee() {
		
	
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

}
