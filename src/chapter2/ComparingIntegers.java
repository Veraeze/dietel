package chapter2;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        int integer = input.nextInt();
        int square = (int) Math.pow(integer, 2);

        if (integer > 100){
            System.out.printf("%d and its square,%d are greater than 100", integer, square);
        }
        else if (integer == 100){
            System.out.printf("%d is equal to 100 and its square, %d is greater than 100", integer, square);
        }
        else if (integer < 100 && square < 100){
            System.out.printf("%d and its square,%d are less than 100", integer, square);
        }
        else if (integer < 100 && square > 100){
            System.out.printf("%d is less than 100 and its square, %d is greater than 100", integer, square);
        }
    }
}
