package cls;

public class AccountsTest {
    public static void main(String[] args) {
        Accounts veraAccount = new Accounts();
        veraAccount.setBalance(5000);
        veraAccount.checkBalance();
        veraAccount.deposit(2000);
        veraAccount.withdraw(3000);
        System.out.printf("The balance is $%d", veraAccount.checkBalance());
    }
}
