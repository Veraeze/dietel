package tdd;

public class Account {

    private int balance;

    public void setBalance(int balance){
        this.balance = balance;

    }


    public void deposit(int amount) {

        balance = balance + amount;


    }

    public void withdrawal(int money){

        balance = balance - money;

    }



    public int checkBalance() {
        return balance;
    }
}