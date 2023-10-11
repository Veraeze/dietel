package array;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean condition = true;

        List<String> productName = new ArrayList<>();
        List<Integer> unitOfProduct = new ArrayList<>();
        List<Double> priceOfProduct = new ArrayList<>();

        System.out.println("What is customer's name ");
        String customerName = input.nextLine();

        do {
            System.out.println("What did the user buy? ");
            String product = input.nextLine();
            if (product.matches("[A-Za-z0-9]+")) {
                productName.add(product);
            } else {
                System.out.println("This product does not exist, please try again!");
                continue;
            }

            System.out.println("How many pieces? ");
            String productUnit = input.nextLine();
            if (productUnit.matches("\\d+")) {
                int productNumber = Integer.parseInt(productUnit);
                unitOfProduct.add(productNumber);
            } else {
                System.out.println("Invalid input, please try again!");
                continue;
            }

            System.out.println("How much per unit? ");
            String productPrice = input.nextLine();
            if (productPrice.matches("\\d+")) {
                double productsPrice = Double.parseDouble(productPrice);
                priceOfProduct.add(productsPrice);
            } else {
                System.out.println("Invalid input, please try again!");
                continue;
            }

            System.out.println("Add more Items? ");
            String value = input.nextLine().toLowerCase();

            if (value.equals("no")) {
                condition = false;
            }

        } while (condition);

        System.out.println("What is your name? ");
        String cashierName = input.nextLine();

        System.out.println("How much discount will he get ");
        int discount = input.nextInt();

        List<Double> productAmount = new ArrayList<>();

//         product amount is the unit of product multiplied y the price of product
        for (int count = 0; count < unitOfProduct.size(); count++) {
            double result = unitOfProduct.get(count) * priceOfProduct.get(count);
            productAmount.add(result);
        }

        double subTotal = 0;
        final double VAT = 17.50;

        for (int item = 0; item < productAmount.size(); item++) {
            subTotal += productAmount.get(item);
        }

        double discount2 = subTotal * ((double) discount / 100);
        double discount3 = subTotal - discount2;
        double vat = (subTotal * VAT) / 100;
        double totalBill = subTotal - discount2 + vat;

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
        String currentDate = date.format(formatDate);


        System.out.printf("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 03293828343
                Date : %s
                Cashier: %s
                Customer Name: %s
                ======================================================
                            ITEM     QTY     PRICE     TOTAL(NGN)
                """, currentDate, cashierName, customerName);

        for (int line = 0; line < productName.size(); line++) {
            System.out.printf("""
                    %17s%6s%11.2f%14.2f
                    """, productName.get(line), unitOfProduct.get(line), priceOfProduct.get(line), productAmount.get(line));
        }
        System.out.printf("""
                ------------------------------------------------------
                                        Sub Total:      %.2f
                                         Discount:      %.2f
                                      VAT @ 17.50:      %.2f
                ======================================================
                                       Bill Total:      %.2f
                ======================================================
                  THIS IS NOT A RECEIPT PLEASE PAY %.2f
                ======================================================
                       """, subTotal, discount3, vat, totalBill, totalBill);

        System.out.println("How much did the customer give to you? ");
        double amount = input.nextDouble();
        double balance = amount - totalBill;

        System.out.printf("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 03293828343
                Date : %s
                Cashier: %s
                Customer Name: %s
                ======================================================
                            ITEM     QTY     PRICE     TOTAL(NGN)
                """, currentDate, cashierName, customerName);

        for (int line = 0; line < productName.size(); line++) {
            System.out.printf("""
                    %17s%6s%11.2f%14.2f
                    """, productName.get(line), unitOfProduct.get(line), priceOfProduct.get(line), productAmount.get(line));
        }
        System.out.printf("""
                ------------------------------------------------------
                                        Sub Total:      %.2f
                                         Discount:      %.2f
                                      VAT @ 17.50:      %.2f
                ======================================================
                                       Bill Total:      %.2f
                                      Amount Paid:      %.2f
                                          Balance:      %.2f
                ======================================================
                  THANK YOU FOR YOUR PATRONAGE
                ======================================================
                       """, subTotal, discount3, vat, totalBill, amount, balance);

    }
}