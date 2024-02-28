package oop.practice;

public class Printer {
    public void print(String text){
        System.out.print(text);
    }

    public void newline() {
        System.out.println();
    }

    public void printTotal(TotalAmount amount){
        System.out.printf("Total: %s", amount);
    }
}
