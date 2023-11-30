package oop.bankingapp;

import oop.bankingapp.exceptions.AccountNotFound;
import oop.bankingapp.exceptions.WrongPin;
import oop.diary.exceptions.CannotBeFound;

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
        Account account = new Account(generateAccountName(firstName, lastName), generateAccountNumber(), pin);
        accounts.add(account);
        totalNumberOfAccount++;
        return account;
    }

    private String generateAccountName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public String generateAccountNumber() {
        return 161199000 + "" +totalNumberOfAccount;
    }

    public int getNumberOfAccounts() {
        return accounts.size();
    }

    public Account findAccount(String accountNumber) {
        for (Account account: accounts){
            if(account.getAccountNumber().equals(accountNumber)) return account;
        }
        throw new AccountNotFound("Account cannot be found");
    }

    public void deposit(String accountNumber, BigDecimal amount) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdraw(String accountNumber, BigDecimal amount, String pin) {
        Account account = findAccount(accountNumber);
        account.withdraw(amount, pin);
    }

    public void transfer(String senderAccountNumber, String recieverAccountNumber, BigDecimal amount, String pin) {
        Account senderAccount = findAccount(senderAccountNumber);
        Account recieverAccount = findAccount(recieverAccountNumber);
        senderAccount.withdraw(amount, pin);
        recieverAccount.deposit(amount);
    }
    public BigDecimal checkBalance(String accountNumber, String pin){
        Account account = findAccount(accountNumber);
        return account.checkBalance(pin);
    }


    public void closeAccountFor(String accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        account.validate(pin);
        accounts.remove(account);
    }
}
