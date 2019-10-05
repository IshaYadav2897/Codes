package com.cg.misc;

public class Currency implements CurrencyInterface {


	@Override
	public void convert(String source, String target, double amount) {
		double sourceVal = 0, targetVal = 0;
		for (int i = 0; i < arr.length; i++) {
			if(source.equalsIgnoreCase(currency[i]))
				sourceVal = arr[i];
			else if(target.equalsIgnoreCase(currency[i]))
				targetVal = arr[i];
		}
		System.out.println(amount + " "+ source + " to " + target + " value is: " + (amount * sourceVal)/targetVal);
		
	}

	public void print()
	{
		//System.out.println("Converted Value is: " + (amount * sourceVal)/targetVal);
	}


}
