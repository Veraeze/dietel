package cls;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PseudoCode {
    //Declare method
    //call constructor
    //collect user input
    //use for loop to define range of values to scores and assign print statement
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a score: ");
        int score = input.nextInt();

        for (score = 90; score <= 100; score++) {
            System.out.print("A");
        }
        for (score = 80; score <= 89; score++) {
            System.out.print("B");
        }

    }

}
