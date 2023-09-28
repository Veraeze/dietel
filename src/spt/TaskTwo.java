package spt;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        double average = 1;
        for (int count = 1; count <= 10; count++){
            System.out.println("Enter score: ");
            int score = input.nextInt();
            sum += score;
            number += 1;
            average = (double) (sum) / number;
        }
        System.out.printf("The average of the scores is %.2f", average);
    }
}
