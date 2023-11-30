package oop.bankingapp;

import oop.bankingapp.exceptions.AccountNotFound;
import oop.bankingapp.exceptions.InsufficientFunds;
import oop.bankingapp.exceptions.InvalidAmount;
import oop.bankingapp.exceptions.WrongPin;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    @Test
    public void testThatBankCanCreateAccount(){
        Bank fidelity = new Bank("Bank name");
        Account newAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        assertEquals(1, fidelity.getNumberOfAccounts());
        assertEquals("1611990000", newAccount.getAccountNumber());
    }

    @Test
    public void testThatBankCanCreateMoreThanOneAccount(){
        Bank fidelity = new Bank("Bank name");

        Account firstAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        Account secondAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        assertEquals(2, fidelity.getNumberOfAccounts());

        assertEquals("1611990000", firstAccount.getAccountNumber());
        assertEquals("1611990001", secondAccount.getAccountNumber());

    }



    @Test
    public void testThatBankCanFindAccount(){
        Bank fidelity = new Bank("Bank name");
        Account firstAccount = fidelity.createAccountFor("1611990000", "Vera eze", "1234");
        Account secondAccount = fidelity.createAccountFor("1611990001", "Vera eze", "1234");
        assertEquals(firstAccount, fidelity.findAccount("1611990000"));
        assertEquals(secondAccount, fidelity.findAccount("1611990001"));
    }

    @Test
    public void testThatExceptionIsThrown_FindAccountThatDoesNotExist(){
        Bank fidelity = new Bank("Fidelity Bank");
        Account firstAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        assertEquals("1611990000", firstAccount.getAccountNumber());
        assertThrows(AccountNotFound.class, ()-> fidelity.findAccount("1611990008"));
    }

    @Test
    public void testThatBankCanDepositIntoAccount(){
        Bank fidelity = new Bank("Fidelity Bank");
        Account firstAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        assertEquals("1611990000", firstAccount.getAccountNumber());
        fidelity.deposit("1611990000", BigDecimal.valueOf(1_000));
        assertEquals(new BigDecimal(1_000), firstAccount.checkBalance("1234"));
    }

    @Test
    public void testThatBankCanDepositIntoMoreThanOneAccount(){
        Bank fidelity = new Bank("Fidelity Bank");

        Account firstAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        assertEquals("1611990000", firstAccount.getAccountNumber());

        Account secondAccount = fidelity.createAccountFor("Susan", "eze", "5678");
        assertEquals("1611990001", secondAccount.getAccountNumber());

        fidelity.deposit("1611990000", BigDecimal.valueOf(1_000));
        fidelity.deposit("1611990001", BigDecimal.valueOf(3_000));

        assertEquals(new BigDecimal(1_000), firstAccount.checkBalance("1234"));
        assertEquals(new BigDecimal(3_000), secondAccount.checkBalance("5678"));
    }

    @Test
    public void testThatExceptionIsThrown_DepositNegativeAmountIntoAccount(){
        Bank fidelity = new Bank("Fidelity Bank");
        Account firstAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        assertEquals("1611990000", firstAccount.getAccountNumber());
        assertThrows(InvalidAmount.class, ()-> fidelity.deposit("1611990000", BigDecimal.valueOf(-1_000)));
    }

    @Test
    public void testThatBankCanWithdrawFromAccount(){
        Bank fidelity = new Bank("Fidelity Bank");

        Account firstAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        assertEquals("1611990000", firstAccount.getAccountNumber());

        fidelity.deposit("1611990000", BigDecimal.valueOf(7_000));
        assertEquals(new BigDecimal(7_000), firstAccount.checkBalance("1234"));

        fidelity.withdraw("1611990000", BigDecimal.valueOf(4_000), "1234");
        assertEquals(new BigDecimal(3_000), firstAccount.checkBalance("1234"));
    }

    @Test
    public void testThatExceptionIsThrown_WithdrawNegativeAmountIntoAccount(){
        Bank fidelity = new Bank("Fidelity Bank");
        Account firstAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        assertEquals("1611990000", firstAccount.getAccountNumber());

        fidelity.deposit("1611990000", BigDecimal.valueOf(7_000));
        assertEquals(new BigDecimal(7_000), firstAccount.checkBalance("1234"));

        assertThrows(InvalidAmount.class, ()-> fidelity.withdraw("1611990000", BigDecimal.valueOf(-1_000), "1234"));
    }

    @Test
    public void testThatExceptionIsThrown_WithdrawWithWrongPin(){
        Bank fidelity = new Bank("Fidelity Bank");
        Account firstAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        assertEquals("1611990000", firstAccount.getAccountNumber());

        fidelity.deposit("1611990000", BigDecimal.valueOf(7_000));
        assertEquals(new BigDecimal(7_000), firstAccount.checkBalance("1234"));

        assertThrows(WrongPin.class, ()-> fidelity.withdraw("1611990000", BigDecimal.valueOf(1_000), "0000"));
    }

    @Test
    public void testThatExceptionIsThrown_WithdrawAmountGreaterThanBalance(){
        Bank fidelity = new Bank("Fidelity Bank");
        Account firstAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        assertEquals("1611990000", firstAccount.getAccountNumber());

        fidelity.deposit("1611990000", BigDecimal.valueOf(7_000));
        assertEquals(new BigDecimal(7_000), firstAccount.checkBalance("1234"));

        assertThrows(InsufficientFunds.class, ()-> fidelity.withdraw("1611990000", BigDecimal.valueOf(9_000), "1234"));
    }

    @Test
    public void testThatBankCanTransferFromOneAccountToAnother(){
        Bank fidelity = new Bank("Bank name");

        Account firstAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        Account secondAccount = fidelity.createAccountFor("Susan", "eze", "5678");
        assertEquals(2, fidelity.getNumberOfAccounts());

        assertEquals("1611990000", firstAccount.getAccountNumber());
        assertEquals("1611990001", secondAccount.getAccountNumber());

        fidelity.deposit("1611990000", BigDecimal.valueOf(6_000));
        fidelity.deposit("1611990001", BigDecimal.valueOf(1_000));

        assertEquals(new BigDecimal(6_000), firstAccount.checkBalance("1234"));
        assertEquals(new BigDecimal(1_000), secondAccount.checkBalance("5678"));

        fidelity.transfer("1611990000", "1611990001", BigDecimal.valueOf(2_000), "1234");

        assertEquals(new BigDecimal(4_000), firstAccount.checkBalance("1234"));
        assertEquals(new BigDecimal(3_000), secondAccount.checkBalance("5678"));
    }

    @Test
    public void testThatExceptionIsThrown_TransferWithWrongPin() {
        Bank fidelity = new Bank("Bank name");

        Account firstAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        Account secondAccount = fidelity.createAccountFor("Susan", "eze", "5678");
        assertEquals(2, fidelity.getNumberOfAccounts());

        assertEquals("1611990000", firstAccount.getAccountNumber());
        assertEquals("1611990001", secondAccount.getAccountNumber());

        fidelity.deposit("1611990000", BigDecimal.valueOf(6_000));
        fidelity.deposit("1611990001", BigDecimal.valueOf(1_000));

        assertEquals(new BigDecimal(6_000), firstAccount.checkBalance("1234"));
        assertEquals(new BigDecimal(1_000), secondAccount.checkBalance("5678"));

        assertThrows(WrongPin.class, ()-> fidelity.transfer("1611990000", "1611990001", BigDecimal.valueOf(2_000), "4367"));
    }
    @Test
    public void testThatBankCanCloseAccount(){
        Bank fidelity = new Bank("Bank name");

        Account newAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        assertEquals(1, fidelity.getNumberOfAccounts());
        assertEquals("1611990000", newAccount.getAccountNumber());

        fidelity.closeAccountFor("1611990000", "1234");
        assertEquals(0, fidelity.getNumberOfAccounts());
    }

    @Test
    public void testThatExceptionIsThrown_CloseAccountWithWrongPin(){
        Bank fidelity = new Bank("Bank name");

        Account newAccount = fidelity.createAccountFor("Vera", "eze", "1234");
        assertEquals(1, fidelity.getNumberOfAccounts());
        assertEquals("1611990000", newAccount.getAccountNumber());

        assertThrows(WrongPin.class, ()-> fidelity.closeAccountFor("1611990000", "1230"));
    }

}
