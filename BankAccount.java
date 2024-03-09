package com.Abstraction;

public abstract class BankAccount {

	String accountNumber;
	String accountHolderName;
	double balance;
	
	public BankAccount(String accountNumber , String accountHolderName , double balance)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = 0.0;
	}
	
	public abstract String getAccountNumber();
	
	public abstract String getAccountHolderName();
		
	public abstract double getbalance();
	
	public abstract double deposite(double amount);
	
	public abstract double withdraw(double amount);
	
}
