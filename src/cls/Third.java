package cls;

import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter number: ");
        int x = input.nextInt();

        System.out.println("enter number: ");
        int n = input.nextInt();

        int power = 1;
        while (n > 0) {

            power = power * x;
            n = n - 1;

        }
        System.out.printf("%d", power);

    }
}
