package spt;

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        int count = 1;
        String userScores = "";

            for (count = 1; count <= 3; count++) {
                System.out.println("Enter score: ");
                int score = input.nextInt();
                userScores += score+ " ";
            }
            number++;

        System.out.println(userScores);
    }
}
