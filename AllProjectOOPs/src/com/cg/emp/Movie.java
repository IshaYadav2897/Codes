package com.cg.emp;

public class Movie extends Booking {
	private double seatNo;
	
	public Movie() {
	}

	public Movie(String name, double price, double seatNo) {
		super(name, price);
		this.seatNo = seatNo;
	}

	public double getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(double seatNo) {
		this.seatNo = seatNo;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Seat No.: " + seatNo);
	}
	
	
	
}
