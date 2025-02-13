package com.bankingsystem;

import java.util.*;

class BankingSystem {

    // hashmap to store customer accounts (account number -> balance)
    private Map<String, Double> customerAccounts = new HashMap<>();

    // treemap to store customer accounts sorted by balance (ascending order)
    private Map<String, Double> sortedAccountsByBalance = new TreeMap<>((a, b) -> {
        return Double.compare(customerAccounts.get(a), customerAccounts.get(b)); // compare by balance
    });

    // queue to process withdrawal requests (first come, first served)
    private Queue<String> withdrawalQueue = new LinkedList<>();

    // method to add a customer account
    public void addCustomerAccount(String accountNumber, double initialBalance) {
        // add the account to both hashmap and treemap
        customerAccounts.put(accountNumber, initialBalance);
        refreshSortedAccountsByBalance();
    }

    // method to refresh the treemap based on updated account balances
    private void refreshSortedAccountsByBalance() {
        // clear the current TreeMap and add accounts sorted by balance
        sortedAccountsByBalance.clear();
        sortedAccountsByBalance.putAll(customerAccounts);
    }

    // method to process a withdrawal request
    public void processWithdrawal(String accountNumber, double amount) {
        // add the withdrawal request to the queue
        withdrawalQueue.add(accountNumber);

        // process the withdrawal request (first come, first served)
        while (!withdrawalQueue.isEmpty()) {
            String accountToWithdraw = withdrawalQueue.poll(); // get the account from the queue

            // check if the account has enough balance
            double currentBalance = customerAccounts.get(accountToWithdraw);
            if (currentBalance >= amount) {
                // if enough balance, deduct the amount and update the balance
                customerAccounts.put(accountToWithdraw, currentBalance - amount);
                System.out.println("Withdrawal successful! Account: " + accountToWithdraw + " | Amount: " + amount);
            } else {
                // if insufficient balance
                System.out.println("Insufficient balance! Account: " + accountToWithdraw + " | Amount: " + amount);
            }

            // refresh the sorted accounts after withdrawal
            refreshSortedAccountsByBalance();
        }
    }

    // method to display all customer accounts
    public void displayCustomerAccounts() {
        System.out.println("Customer Accounts (Account Number -> Balance):");
        for (Map.Entry<String, Double> entry : customerAccounts.entrySet()) {
            System.out.println("Account: " + entry.getKey() + " | Balance: " + entry.getValue());
        }
    }

    // method to display customers sorted by balance
    public void displaySortedAccountsByBalance() {
        System.out.println("Customer Accounts Sorted by Balance:");
        for (Map.Entry<String, Double> entry : sortedAccountsByBalance.entrySet()) {
            System.out.println("Account: " + entry.getKey() + " | Balance: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // create a banking system instance
        BankingSystem bankingSystem = new BankingSystem();

        // add customer accounts
        bankingSystem.addCustomerAccount("12345", 1000.0);
        bankingSystem.addCustomerAccount("67890", 2000.0);
        bankingSystem.addCustomerAccount("11223", 1500.0);

        // display customer accounts
        bankingSystem.displayCustomerAccounts();

        // display customer accounts sorted by balance
        bankingSystem.displaySortedAccountsByBalance();

        // process withdrawal requests
        bankingSystem.processWithdrawal("12345", 5000.0);
        bankingSystem.processWithdrawal("67890", 2500.0);
        bankingSystem.processWithdrawal("11223", 3000.0);
        // display updated customer accounts after withdrawals
        bankingSystem.displayCustomerAccounts();
        // display updated customer accounts sorted by balance
        bankingSystem.displaySortedAccountsByBalance();
    }
}

