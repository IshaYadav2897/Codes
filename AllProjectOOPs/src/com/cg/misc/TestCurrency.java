package com.cg.misc;


public class TestCurrency {
	public static void main(String[] args) {
		Currency c1 = new Currency();
		c1.convert("USD", "INR", 840);
		c1.print();
	}
}

