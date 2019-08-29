package com.cg.cc;

public class TestConverter {
	public static void main(String[] args) {
		INR i = new INR();
		USD u = new USD();
		
		System.out.println(CurrencyConverter.convert(i, u, 100));
		System.out.println(CurrencyConverter.convert(u, i, 100));

	}
}
