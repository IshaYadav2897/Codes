package com.cg.bank;
/**
 * This class represents the generalised bank account.
 * @author Isha
 * @version 1.0
 */
public class Account implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;
	
	private Person person;
	
	private static int autogenAcc = 101;
	private static final double MIN_BAL = 1000;
	
	//Fields for transaction statements
	protected Transaction[] t;
	protected int idx;
	
	/**This is the default constructor. Does nothing.*/
	public Account() {
	}

	/**This is parameterised constructor. Sets initial state. */
	public Account(String holder, double balance) {
		this.acntNo = autogenAcc++;
		this.holder = holder;
		this.balance = balance;
		this.person = person;
		t = new Transaction[10];
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getAccountNo() {
		return acntNo;
	}

	public void setAccountNo(double accountNo) {
		this.acntNo = acntNo;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	
	
	/**This is deposit method. Deposits the amount to the bank account*/
	public void deposit(double amount)
	{
		balance += amount;
		t[idx++] = new Transaction("Cr", amount, balance);
	}
	
	/**This is withdraw method. Withdraw the amount from the balance*/
	public void withdraw(double amount) throws BankException
	{
		if(amount>balance-MIN_BAL)
			System.out.println("Insufficient balance");
		else
			balance -= amount;
	}
	
	/**This is summary method. Displays the fields*/
	public void summary()
	{
		//System.out.println(person.toString());
		System.out.println("Account No.: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	@Override
	public void statement()
	{
		for (int i = 0; i < idx; i++) {
			t[i].print();
		}
	}
	
}
