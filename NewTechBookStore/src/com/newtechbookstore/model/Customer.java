package com.newtechbookstore.model;

import java.io.Serializable;
import java.util.Date;


public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	private String userid;
     private String firstname;
     private String lastname;
     private String gender;
     private Date dob;
     private Address customerAddress;
     private String phone;
     private String email;
     private String password;
     
     
	public Customer() {
		super();
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
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


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public Address getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
     
     
}
