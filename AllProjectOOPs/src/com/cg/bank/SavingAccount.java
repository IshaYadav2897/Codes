package com.cg.bank;

public class SavingAccount extends Account{
	
	public SavingAccount() {
	}

	public SavingAccount(String holder) {
		super(holder, MIN_SAV_BAL);
		t = new Transaction[10];
		t[idx++] = new Transaction("Cr", MIN_SAV_BAL, balance);
		
	}

	/*@Override
	public void deposit(double amount) {
		super.deposit(amount);
		
	}*/

	@Override
	public void withdraw(double amount) throws BankException {
		if(amount>balance-MIN_SAV_BAL)
		{
			throw new BankException("Insufficient balance in saving account");
		}
		else
		{
			balance -= amount;
			t[idx++] = new Transaction("Dr", amount, balance);
		}
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Saving Account");
	}

	
	
	
}
