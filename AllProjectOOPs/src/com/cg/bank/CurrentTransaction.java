package com.cg.bank;

public class CurrentTransaction extends Transaction{
	private double overDraft;
	
	public CurrentTransaction() {
	}

	public CurrentTransaction(String type, double amount, double balance, double overDraft) {
		super(type, amount, balance);
		this.overDraft = overDraft;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Overdraft value is: " + overDraft);
	}
	
	
	
}
