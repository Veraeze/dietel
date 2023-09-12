package cls;

import java.util.Scanner;

public class Twice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter number: ");
        int x = input.nextInt();

        System.out.println("enter number: ");
        int y = input.nextInt();

        int sum = x + y;
        int twice = 2 * sum;

        System.out.print(twice);
    }
}
