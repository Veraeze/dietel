package cls;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter value: ");
        int number = input.nextInt();
        int remain = number % 10;
        int sum = remain + number;
        System.out.print(sum);
    }
}
