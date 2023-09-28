package spt;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int count = 1; count <= 10; count++){
            System.out.println("Enter score: ");
            int score = input.nextInt();
            sum += score;
        }
        System.out.printf("The sum of the scores is %d", sum);
    }
}
