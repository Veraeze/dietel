package oop.practice;

public class ItemFormat {
    private final Money price;
    private final String description;
    public ItemFormat(String description, Money price) {
        this.price = price;
        this.description = description;
    }

    public void print(Printer printer) {
        printer.print(description);
        printer.print(" ");
        price.print(printer);
        printer.newline();
    }
}
