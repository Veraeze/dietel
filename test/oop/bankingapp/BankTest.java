package oop.bankingapp;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void testThatBankCanCreateAccount(){
        Bank fidelity = new Bank("Bank name");
        Account newAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        assertEquals(1, fidelity.getNumberOfAccounts());
        assertEquals("1", newAccount.getAccountNumber());
    }

    @Test
    public void testThatBankCanCreateMoreThanOneAccount(){
        Bank fidelity = new Bank("Bank name");
        Account firstAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        Account secondAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        assertEquals(2, fidelity.getNumberOfAccounts());
        assertEquals("1", firstAccount.getAccountNumber());
        assertEquals("2", secondAccount.getAccountNumber());

    }

//    @Test
//    public void testThatBankCanFindAndDepositIntoAccount(){
//        Bank fidelity = new Bank("Fidelity Bank");
//        Account firstAccount = fidelity.createAccountFor("Vera", "eze", "1234");
//        assertEquals(1, fidelity.getNumberOfAccounts());
//        assertEquals("1", firstAccount.getAccountNumber());
//        fidelity.deposit(BigDecimal.valueOf(1_000));
//        assertEquals(1_000, firstAccount.checkBalance("1234"));
//    }

    @Test
    public void testThatBankCanFindAccount(){
        Bank fidelity = new Bank("Bank name");
        Account firstAccount = fidelity.createAccountFor("1", "Vera eze", "1234");
        Account secondAccount = fidelity.createAccountFor("2", "Vera eze", "1234");
        assertEquals(firstAccount, fidelity.findAccount("1"));
        assertEquals(secondAccount, fidelity.findAccount("2"));
    }

}
