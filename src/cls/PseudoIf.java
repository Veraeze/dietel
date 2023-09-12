package cls;
//collect user input
//if the userinput is greater than or equal to 90 and is less than or equal to 100, print A
//if the userinput is greater than or equal to 80 and is less than or equal to 89, print B
//if the userinput is greater than or equal to 70 and is less than or equal to 79, print C
//if the userinput is greater than or equal to 60 and is less than or equal to 69, print D
//if the userinput is less than 60, print F

import java.util.Scanner;

public class PseudoIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a score: ");
        int score = input.nextInt();

        if ((score >= 90) && (score <= 100)) System.out.print("A");
        if ((score >= 80) && (score <= 89)) System.out.print("B");
        if ((score >= 70) && (score <= 79)) System.out.print("C");
        if ((score >= 60) && (score <= 69)) System.out.print("D");
        if (score < 60) System.out.print("F");
    }
}
