package oop.bankingapp;

import oop.bankingapp.exceptions.InsufficientFunds;
import oop.bankingapp.exceptions.InvalidAmount;
import oop.bankingapp.exceptions.WrongPin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account account;
    @BeforeEach
    void setAccount(){
        account = new Account("1234979705", "Vera Eze", "0000");
    }

    @Test
    public void testThatAccountExists(){
        assertNotNull(account);
    }
    @Test
    public void  deposit1k_balanceIs1kTest(){
        account.deposit(BigDecimal.valueOf(1000));
        assertEquals(1000, account.checkBalance("0000"));
    }
    @Test
    public void  deposit2k_balanceIs3kTest(){
        account.deposit(BigDecimal.valueOf(1000));
        account.deposit(BigDecimal.valueOf(2000));
        assertEquals(3000, account.checkBalance("0000"));
    }

    @Test
    public void testWithdraw1k_balanceShouldBe2k(){
        account.deposit(BigDecimal.valueOf(1000));
        account.deposit(BigDecimal.valueOf(2000));
        assertEquals(3000, account.checkBalance("0000"));
        account.withdraw(BigDecimal.valueOf(1000), "0000");
        assertEquals(2000, account.checkBalance("0000"));
    }

    @Test
    public void  wrongPinCheckBalance_throwsExceptionTest(){
        assertThrows(WrongPin.class, () -> account.checkBalance("00001"));
    }
    @Test
    public void testWithdrawWithWrongPin_throwsExceptionTest(){
        assertThrows(WrongPin.class, () -> account.withdraw(BigDecimal.valueOf(2000), "0987"));
    }

    @Test
    public void withdrawMoreThanBalance_throwsExceptionTest(){
        account.deposit(BigDecimal.valueOf(1000));
        assertEquals(1000, account.checkBalance("0000"));
        assertThrows(InsufficientFunds.class, () ->account.withdraw(BigDecimal.valueOf(1500), "0000"));
    }
    @Test
    public void withdrawInvalidAmount_throwsExceptionTest(){
        assertThrows(InvalidAmount.class, () ->account.withdraw(BigDecimal.valueOf(-1000), "0000"));
    }

    @Test
    public void depositInvalidAmount_throwsExceptionTest(){
        assertThrows(InvalidAmount.class, () ->account.deposit(BigDecimal.valueOf(-1000)));
    }
}
