package com.cg.bank;

//Account class has one to many relationship with Transaction class
//eg. 1 account can have many transactions

public class Transaction {
	private String type;
	private double amount;
	private double balance;
	
	public Transaction() {
	}

	public Transaction(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}
	
	public void print()
	{
		System.out.println(type + "\t" + amount + "\t" + balance);
	}
	
	
}
