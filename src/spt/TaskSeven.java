package spt;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
//        int number = 0;
        for (int count = 1; count < 10; ) {
            System.out.println("Enter score: ");
            int score = input.nextInt();
            if (score >= 1 && score <= 100) {
//                number += 1;
                sum += score;
                count++;
            } else System.out.println("please enter a valid score");
        }
        System.out.printf("The sum of valid scores is %d", sum);
    }
}

