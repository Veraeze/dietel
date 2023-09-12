package spt;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        int sum;
        int answer;
        do {

            sum = firstNumber + secondNumber;
            System.out.printf("The sum is %d", sum);
            System.out.println("\n Do you want to perform this operation again? If yes press 1, if no press 0: ");
            answer = input.nextInt();

        }
        while (answer == 1);

    }

}