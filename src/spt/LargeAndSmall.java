package spt;

import java.util.Scanner;

public class LargeAndSmall {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int largest = number;
        int smallest = number;
        int count = 0;

        while (number != 0) {

            count++;
            if (number > largest){largest = number;}
            if (number < smallest) {smallest = number;}

            System.out.println("Enter a number: ");
            number = input.nextInt();

        }

        System.out.printf("The largest number is %d%n", largest);
        System.out.printf("The smallest number is %d%n", smallest);

    }

}