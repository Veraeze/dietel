package oop.practice;

public class Item {
    private final String description;
    private final Money price;

    public Item(String description, Money price) {
        this.description = description;
        this.price = price;
    }

    public void print(Printer printer){
        new ItemFormat(description, price).print(printer);
    }
}
