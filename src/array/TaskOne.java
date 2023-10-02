package array;

import java.util.Scanner;

import static function.Function.*;

public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];
        for (int count = 0; count < scores.length; count++){
            System.out.println("Enter score: ");
            scores[count] = input.nextInt();
        }
        int total = sumOf(scores);
        double average = averageOf(scores);
        int minimum = minOf(scores);
        int maximum = maxOf(scores);
        System.out.println("The total is " + total + "\nThe average is " + average + "\nThe minimum is "  + minimum + "\nThe maximum is " + maximum);
    }
}
