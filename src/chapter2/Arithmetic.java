package chapter2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer");
        int first = input.nextInt();

        System.out.println("Enter second integer");
        int second = input.nextInt();

        int firstSquare = (int) Math.pow(first, 2);
        int secondSquare = (int) Math.pow(second, 2);

        int sumOfSquares = firstSquare + secondSquare;
        int differenceOfSquares = firstSquare - secondSquare;

        System.out.printf("Square of first and second integers are %d and %d%n" +
                          "Sum of their squares: %d%n" +
                          "Difference of the squares: %d%n"
                           , firstSquare, secondSquare, sumOfSquares, differenceOfSquares);
    }
}
