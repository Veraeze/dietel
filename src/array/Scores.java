package array;

import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        int count;
        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];
        for (count = 0; count < 10; count++){
            System.out.println("Enter score: ");
            scores[count] = input.nextInt();
        }
        System.out.print(scores[count] + " ");

        int largest = scores[0];
        for (count = 0; count < 10; count++){
            if (largest < scores[count]){
                largest = scores[count];
            }
        }
        System.out.printf("Largest score is %d", largest);
    }
}
