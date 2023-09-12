package spt;

import java.util.Scanner;

public class Count {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 1;
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;

        while(true) {

            System.out.println("Enter a number(press -3 to quit): ");
            int number = input.nextInt();
            if (number == 0){result1 = result1 + 1;}
            if (number == -3){break;}
            if (number < 0){result2 = result2 + 1;}
            if (number > 0){result3 = result3 + 1;}
            count = count + 1;

        }

        System.out.printf("The number of zeros entered is %d\n", result1);
        System.out.printf("The number of negative numbers entered is %d\n", result2);
        System.out.printf("The number of positive numbers entered is %d\n", result3);

    }
}