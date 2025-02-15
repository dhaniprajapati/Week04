package com.junit;

public class BankAccount {
    private double balance;

    // constructor to initialize the account
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    // method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    // method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("insufficient funds");
        }
    }
    // method to get the current balance
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        // create a bank account object
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("current balance: " + account.getBalance());
    }
}
