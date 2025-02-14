package com.banktransactionsystem;

// custom exception class
class InsufficientBalanceException extends Exception {
    private String message;

    // constructor
    public InsufficientBalanceException(String message) {
        this.message = message;
    }
    // override the toString() method to return the message
    @Override
    public String toString() {
        return message;
    }
}
//bankaccount class
public class BankAccount {
    private double balance;
    //  constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    // method to withdraw an amount
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("insufficient balance.");
        }
        balance -= amount;
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        try {
            // withdrawal
            double amountToWithdraw = 1200.0;
            account.withdraw(amountToWithdraw);
            System.out.println("withdrawal successful, new balance: " + account.getBalance());
        }
        // catch and display insufficient balance message
        catch (InsufficientBalanceException e) {
            System.out.println(e);
        }
        // catch and display invalid amount message
        catch (IllegalArgumentException e) {
            System.out.println("invalid amount!");
        } catch (Exception e) {
            System.out.println("an unexpected error occurred: " + e.getMessage());
        }
        // testing a valid withdrawal
        try {
            double validWithdrawal = 500.0;
            account.withdraw(validWithdrawal);
            System.out.println("withdrawal successful, new balance: " + account.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        } catch (IllegalArgumentException e) {
            System.out.println("invalid amount!");
        }
    }
}

