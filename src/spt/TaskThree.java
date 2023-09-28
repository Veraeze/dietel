package spt;

import java.util.Scanner;

public class TaskThree {
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
        System.out.printf("The sum is %d",sum);
        System.out.printf("%nThe average is %.2f", average);
    }
}
