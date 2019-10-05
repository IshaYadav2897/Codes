package com.cg.stock;

public class Stock implements Exchange {

	@Override
	public void view() {
		System.out.println("Stock view");
	}

	@Override
	public void get() {
		System.out.println("Get Stock");
	}

	@Override
	public void set() {
		System.out.println("Set Stock");
	}

}
