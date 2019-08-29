package com.cg.misc;


public interface CurrencyInterface {
	void convert(String source, String target, double amount);
	
	String currency[] = {"USD", "INR", "EUR", "AED", "AUD", "NZD"};
	double arr[] = {72, 1, 84, 20, 52, 48};
	
}



