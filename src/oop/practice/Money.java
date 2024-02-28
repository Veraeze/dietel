package oop.practice;

import java.math.BigDecimal;

public class Money {
    private final BigDecimal amount;
    private final String currency;

    public Money(BigDecimal amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public void print(Printer printer) {
        printer.print(currency);
        printer.print(String.valueOf(amount));
    }



}
