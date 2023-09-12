package cls;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        int power = 1;
            while (secondNumber > 0) {

                power = power * firstNumber;
                secondNumber = secondNumber - 1;

            }

        System.out.printf("%d", power);

    }

}