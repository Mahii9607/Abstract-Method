package com.Abstraction;

public class SavingAccount extends BankAccount {

    private double interestRate;
    
    public SavingAccount(String accountNumber, String accountHolderName, double interestRate) {
        super(accountNumber, accountHolderName, 0.0); 
        this.interestRate = interestRate;
    }

    // Implementing abstract methods
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getAccountHolderName() {
        return accountHolderName;
    }

    @Override
    public double getbalance() {
        return balance;
    }

    @Override
    public double deposite(double amount) {
        balance += amount;
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
        return balance;
    }

    
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public static void main(String[] args) {
        
        SavingAccount account = new SavingAccount("00360", "Nikam Mahesh", 0.05);

        // Deposit 
        account.deposite(1000);

        // Withdraw
        account.withdraw(500);

        // Display 
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getbalance());
        System.out.println("Interest Rate: " + account.getInterestRate());
    }
}
