package oop.bankingapp;

import oop.bankingapp.exceptions.InsufficientFunds;
import oop.bankingapp.exceptions.InvalidAmount;
import oop.bankingapp.exceptions.WrongPin;

import java.math.BigDecimal;

public class Account {

    private final String pin;
    private final String number;
    private BigDecimal balance;

    public Account(String name, String accountNumber, String pin){
        number = accountNumber;
        this.pin = pin;
    }


    public void deposit(BigDecimal amount) {
        validate(pin);
        validateInvalidAmount(amount);
        balance = balance.add(amount);
    }

    public BigDecimal checkBalance(String pin) {
        validate(pin);
        return balance;
    }
    private void validate(String pin){
        if (pin != this.pin) throw new WrongPin("Incorrect pin");
    }

    public void withdraw(BigDecimal amount, String pin) {
        validate(pin);
        validateInvalidAmount(amount);
        validateInsufficientFunds(amount);
        balance = balance.subtract(amount);
    }
    private void validateInvalidAmount(BigDecimal amount){
        if (balance == null) balance = BigDecimal.ZERO;
        if (this.balance.compareTo(amount) < 0) throw new InsufficientFunds("Insufficient funds");
    }

    private void validateInsufficientFunds(BigDecimal amount){
        if (amount.compareTo(BigDecimal.ZERO) < 0) throw new InvalidAmount("Invalid amount");
    }

    public String getAccountNumber() {
        return number;
    }
}
