package com.cg.emp;

public class Booking {
	private String name;
	private double price;
	
	public Booking() {
	}

	public Booking(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void print()
	{
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
	}
}
