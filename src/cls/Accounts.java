package cls;

public class Accounts {
    private int balance;

    public void setBalance(int balance){
        this.balance = balance;
    }
    public void deposit(int amount){
        balance = balance + amount;
    }
    public void withdraw(int money){
        balance = balance - money;
    }
    public int checkBalance(){
        return balance;
    }
}
