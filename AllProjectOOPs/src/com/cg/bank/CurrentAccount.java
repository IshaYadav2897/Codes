package com.cg.bank;

public class CurrentAccount extends Account{
	private double overdraft = OD_AMOUNT;
	
	public CurrentAccount() {
	}

	public CurrentAccount(String holder) {
		super(holder, INIT_CURR_BAL);
		t = new CurrentTransaction[10];
		t[idx++] = new CurrentTransaction("Cr", MIN_CURR_BAL, balance, overdraft);
	}

	@Override
	public void deposit(double amount) {
		if(overdraft > OD_AMOUNT)
		{
			balance = balance +  overdraft - 10000;
			overdraft = OD_AMOUNT;
			t[idx++] = new CurrentTransaction("Cr", amount, balance, overdraft);
		}
		else
		{
			overdraft += amount;
			t[idx++] = new CurrentTransaction("Cr", amount, balance, overdraft);
		}
	}

	@Override
	public void withdraw(double amount) throws BankException {
		if(amount > overdraft+balance)
		{
			//System.out.println("Insufficient balance in current account");
			throw new BankException("Insufficient balance in current account");

		}
		else if(balance < amount)
		{
			overdraft = overdraft + (balance-amount);
			balance = amount;
		}
		balance = balance - amount;
		t[idx++] = new CurrentTransaction("Dr", amount, balance, overdraft);
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Current Account");
		System.out.println("Overdraft amount: " + overdraft);
	}
	
	
	
	
}
