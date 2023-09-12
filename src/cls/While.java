package cls;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        while (count < 5) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            sum = sum + number;
            count = count + 1;
        }
        System.out.print(sum);
    }
}