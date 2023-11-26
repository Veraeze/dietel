package oop.bankingapp;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {
    private int totalNumberOfAccount;
    private String name;
    ArrayList<Account> accounts;


    public Bank(String bankName) {
        this.name = bankName;
        accounts = new ArrayList<>();
    }

    public Account createAccountFor(String firstName, String lastName, String pin) {
        totalNumberOfAccount++;
        String accountName = generateAccountName(firstName, lastName);
        String accountNumber = generateAccountNumber();
        Account account = new Account(accountName, accountNumber, pin);
        accounts.add(account);
        return account;
    }

    private String generateAccountName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public String generateAccountNumber() {
        return totalNumberOfAccount+"";
    }

    public int getNumberOfAccounts() {
        return totalNumberOfAccount;
    }

    public Account findAccount(String accountNumber) {
        for (Account account: accounts){
            if(account.getAccountNumber().equals(accountNumber)) return account;
        }
        return null;
    }

    public void deposit(String accountNumber, BigDecimal amount) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }
}
