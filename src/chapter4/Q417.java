package chapter4;

import java.util.Scanner;

public class Q417 {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);


        int mileage;
        int gallon;
        int totalMileage = 0;
        int totalGallon = 0;
        int counter = 1;
        double milespergallonsused = 0;
        double average;

        System.out.print("Enter a mileage (or -1 to quit): ");
        mileage = input.nextInt();
        System.out.print("Enter the gallons of fuel used: ");
        gallon = input.nextInt();
        average = (double) mileage / gallon;
        System.out.printf("The miles per gallons used for this trip is: %.2f", average);
        System.out.println();


        while (mileage != -1 && gallon != -1)
        {
            totalMileage = totalMileage + mileage;
            totalGallon = totalGallon + gallon;
            counter = counter + 1;
            System.out.print("Enter a mileage (or -1 to quit): ");
            mileage = input.nextInt();

            System.out.print("Enter the gallons of fuel used: ");
            gallon = input.nextInt();
            average = (double) mileage / gallon;
            System.out.printf("The miles per gallons used for this trip is: %.2f", average);
            System.out.println();
        }
        if (counter != 0)
        {
            milespergallonsused = (double) totalMileage/totalGallon;

            System.out.printf("The combined miles per gallons used for all the trips is: %.2f", milespergallonsused);
        }
    }
}
