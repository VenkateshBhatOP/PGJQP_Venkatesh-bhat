package com.chapter2.exercise1;

public class Rooms {
	private int RoomNo;
	private String bedSize;
	private double price;
	public Rooms() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rooms(int roomNo, String bedSize, double price) {
		super();
		RoomNo = roomNo;
		this.bedSize = bedSize;
		this.price = price;
	}
	public int getRoomNo() {
		return RoomNo;
	}
	public void setRoomNo(int roomNo) {
		RoomNo = roomNo;
	}
	public String getBedSize() {
		return bedSize;
	}
	public void setBedSize(String bedSize) {
		this.bedSize = bedSize;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
