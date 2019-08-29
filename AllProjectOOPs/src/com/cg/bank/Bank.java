package com.cg.bank;

//interface is used to provide the interface between the two parties 
//eg. bank would not like to show all account details to the third party

public interface Bank {
	//declared methods
	void deposit(double amount);
	void withdraw(double amount) throws BankException;
	
	void summary();
	void statement();
	
	//constants
	double MIN_SAV_BAL = 1000;
	double INIT_CURR_BAL = 5000;
	double MIN_CURR_BAL = 0;
	double OD_AMOUNT = 10000;
	int INIT_ACNT_NO = 1001;
}
