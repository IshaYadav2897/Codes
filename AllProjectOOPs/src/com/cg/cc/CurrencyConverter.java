package com.cg.cc;

public class CurrencyConverter {
	public static double convert(Currency src, Currency tgt, double amount)
	{
		double rate = src.baseRate()/tgt.baseRate();
		return rate*amount;
	}
}
