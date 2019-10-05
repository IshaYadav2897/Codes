package com.cg.emp;

public class Hotel extends Booking {
	private double roomNo;
	
	public Hotel() {
	}

	public Hotel(String name, double price, double roomNo) {
		super(name, price);
		this.roomNo = roomNo;
	}

	public double getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(double roomNo) {
		this.roomNo = roomNo;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Room No.: " + roomNo);
	}
	
	
	
	
}
