package oop.bankingapp;

import java.math.BigDecimal;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu(){
        print("""
                ============================
                        Raver Bank
                ============================
                press 1 -> Create  Account
                press 2 -> Deposit
                press 3 -> Withdraw
                press 4 -> Transfer
                press 5 -> Check Balance
                press 6 -> Close Account
                press 0 -> Exit
                """);
        String select = input(String.class);
        switch (select){
            case "1" -> createAccount();
            case "2" -> deposit();
            case "3" -> withdraw();
            case "4" -> transfer();
            case "5" -> checkBalance();
            case "6" -> closeAccount();
            case "0" -> exitApp();
            default -> {
                print("Invalid selection! select between 1-6 to perform transaction or 0 to exit");
                mainMenu();
            }
        }
    }

    private static void closeAccount() {
        print("What is your account number");
        String accountNumber = input(String.class);
        accountNumber = validateAccountNumber(accountNumber);

        print("Enter your pin");
        String pin = input(String.class);

        try {
            bank.closeAccountFor(accountNumber, pin);
            print("Account successfully closed");
            mainMenu();
        }
        catch (Exception exception){
            print(exception.getMessage());
            mainMenu();
        }
    }

    private static void checkBalance() {
        print("What is your account number");
        String accountNumber = input(String.class);
        accountNumber = validateAccountNumber(accountNumber);

        print("Enter your pin");
        String pin = input(String.class);

        try {
            bank.checkBalance(accountNumber, pin);
            System.out.println(bank.findAccount(accountNumber));
            mainMenu();
        }
        catch (Exception exception){
            print(exception.getMessage());
            mainMenu();
        }
    }

    private static void transfer() {
        print("Enter your account number");
        String sender = input(String.class);
        sender = validateAccountNumber(sender);

        print("Enter beneficiary's account number");
        String beneficiary = input(String.class);
        beneficiary = validateAccountNumber(beneficiary);

        print("How much do you want to transfer");
        String amount = input(String.class);
        BigDecimal convertedAmount = BigDecimal.valueOf(Integer.parseInt(validateAmount(amount, "transfer")));

        print("Enter your pin");
        String pin = input(String.class);

        try {
            bank.transfer(sender, beneficiary, convertedAmount, pin);
            System.out.println(bank.findAccount(sender));
            System.out.println(bank.findAccount(beneficiary));
            mainMenu();
        }
        catch (Exception exception){
            print(exception.getMessage());
            mainMenu();
        }

    }

    private static void withdraw() {
        print("What is your account number");
        String accountNumber = input(String.class);
        accountNumber = validateAccountNumber(accountNumber);

        print("How much do you want to withdraw");
        String amount = input(String.class);
        BigDecimal convertedAmount = BigDecimal.valueOf(Integer.parseInt(validateAmount(amount, "withdraw")));

        print("Enter your pin");
        String pin = input(String.class);


        try {
            bank.withdraw(accountNumber, convertedAmount, pin);
            System.out.println(bank.findAccount(accountNumber));
            mainMenu();
        }
        catch (Exception exception){
            print(exception.getMessage());
            mainMenu();
        }
    }

    private static void exitApp() {
        print("Thank you for banking with us, see you next time.");
        System.exit(0);
    }

    private static void deposit() {
        print("What is your account number");
        String accountNumber = input(String.class);
        accountNumber = validateAccountNumber(accountNumber);

        print("How much do you want to deposit");
        String amount = input(String.class);

        BigDecimal convertedAmount = BigDecimal.valueOf(Integer.parseInt(validateAmount(amount, "deposit")));

        try {
            bank.deposit(accountNumber, convertedAmount);
            System.out.println(bank.findAccount(accountNumber));
            mainMenu();
        }
        catch (Exception exception){
            print(exception.getMessage());
            mainMenu();
        }
    }

    static Bank bank = new Bank("Raver Bank");
    private static void createAccount() {
        print("Enter your first name");
        String firstName = input(String.class);
        firstName = validateName(firstName, "first");

        print("Enter your last name");
        String lastName = input(String.class);
        lastName = validateName(lastName, "last");

        print("Create your pin");
        String pin = input(String.class);
        pin = validatePin(pin);

        Account account = bank.createAccountFor(firstName, lastName, pin);
        print("Account has been created successfully");
        print("Account number: " + account.getAccountNumber());
        mainMenu();
    }


    private static <T> T input(Class<T> value){
        Scanner scanner = new Scanner(System.in);
        T element = null;

        if (value.equals(String.class)){
            element = value.cast(scanner.nextLine());
        }
        else if (value.equals(Integer.class)){
            element = value.cast(scanner.nextInt());
        }
        else if (value.equals(Double.class)){
            element = value.cast(scanner.nextDouble());
        }
        else if (value.equals(Long.class)){
            element = value.cast(scanner.nextLong());
        }
        else if (value.equals(BigDecimal.class)){
            element = value.cast(scanner.nextBigDecimal());
        }
        return element;
    }

    private static void print(String message){
        System.out.println(message);
    }

    private static String validateAccountNumber(String accountNumber){
        while (!accountNumber.matches("\\d+") || accountNumber.matches("[a-z]+") || (accountNumber.length() != 10)){
            System.out.println("Error! account number must consist of only numbers and length of 10");
            print("\nWhat is your account number");
            accountNumber = input(String.class);
        }
        return accountNumber;
    }
    private static String validateName(String name, String position){
        while (name.matches("\\d+") || !name.matches("[a-zA-Z]+")){
            print("error! name must consist of letters only");
            print("\nEnter your " + position + " name");
            name = input(String.class);
        }
        return name;
    }
    private static String validatePin(String pin){
        while (!pin.matches("\\d+") || pin.matches("[a-z]+") || (pin.length() != 4)){
            System.out.println("Error! pin must consist of numbers only and the length of pin must be 4");
            print("\nEnter your pin");
            pin = input(String.class);
        }
        return pin;
    }
    private static String validateAmount(String amount, String action){
        while (!amount.matches("\\d+") || amount.matches("[a-z]+")){
            print("error! please enter a valid amount");
            print("\nHow much do you want to " + action);
            amount = input(String.class);
        }
        return amount;
    }
}
