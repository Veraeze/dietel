package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void depositTest() {

        Account input = new Account();

        input.deposit(5000);

        input.checkBalance();
        assertEquals(5000 , input.checkBalance());


    }


    @Test
    public void depositTwo(){
        // given

        Account veraAccount = new Account();

        //when

        veraAccount.deposit(2000);

        //check

        assertEquals(2000 , veraAccount.checkBalance());

        //when

        veraAccount.deposit(5000);

        //check

        assertEquals(7000 , veraAccount.checkBalance());

    }



    @Test

    public  void withdrawalTest() {

        Account account = new Account();

        account.setBalance(2500);

        assertEquals(2500 , account.checkBalance());

        account.withdrawal(1000);

        assertEquals(1500 , account.checkBalance());


    }

    @Test
    public void withdrawalTwo() {

        Account scan = new Account();

        scan.setBalance(2500);

        int removeMoney = scan.checkBalance();
        assertEquals(2500 , removeMoney);

        scan.withdrawal(3500);

        assertEquals(2500 , removeMoney);



    }


}