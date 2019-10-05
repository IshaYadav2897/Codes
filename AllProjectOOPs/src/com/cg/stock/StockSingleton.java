package com.cg.stock;

public final class StockSingleton {
	
	//private constructor is used because it can not be instantiated
	private StockSingleton() {
	}
	
	private static Stock stock;
	
	public static Stock getStock()
	{
		if(stock == null)
			stock = new Stock();
		
		return stock;
	}
}
