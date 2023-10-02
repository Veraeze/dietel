package array;

import function.Function;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int total = 0;
        double average = 0;
        int minimum = 0;
        int maximum = 0;
        for (count = 1; count <= 10; count++) {
            System.out.println("Enter score: ");
            int score = input.nextInt();
            total += score;
            average = (double) (total) / count;
            if (minimum > score) minimum = score;
            maximum = Function.maximumOf(score);
        }

        System.out.println("The total is " + total + "\nThe average is " + average + "\nThe minimum is " + minimum + "\nThe maximum is " + maximum);
    }

}
