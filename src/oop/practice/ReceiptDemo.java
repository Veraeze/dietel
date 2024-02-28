package oop.practice;
import java.math.BigDecimal;


public class ReceiptDemo {
    public static void main(String[] args) {
        new ReceiptDemo().run();
    }

    private void run() {
        Receipt receipt = new Receipt(new Printer());

        receipt.add("Brie", new Money(BigDecimal.valueOf(1.95), "GBP"));
        receipt.add("Tiger Bread", new Money(BigDecimal.valueOf(0.95), "GBP"));
        receipt.add("Merlot", new Money(BigDecimal.valueOf(7.95), "GBP"));

        receipt.print();
    }
}
