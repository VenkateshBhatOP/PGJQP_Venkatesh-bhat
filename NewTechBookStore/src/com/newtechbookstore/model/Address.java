package com.newtechbookstore.model;

import java.io.Serializable;

public class Address implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String address;
	private int addressId;

	public Address() {
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	
}
