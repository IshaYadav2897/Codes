package com.cg.bank;

//final class is used because we would not like it to be inherited
public final class AccountFactory {
	
	//private constructor is used because we do not want it to be instantiated.
	private AccountFactory() {
	}
	
	//static method is used because we do not want the class to be instantiated
	//therefore we can access this static method directly using class name.
	
	public static Bank OpenAccount(String holder, String type)
	{
		Bank b = null;
		if(type.equalsIgnoreCase("Saving"))
			b = new SavingAccount(holder);
		else 
			b = new CurrentAccount(holder);
		return b;
	}
	
	
}
