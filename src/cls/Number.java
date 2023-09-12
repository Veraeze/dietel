package cls;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.print("even number");
        }
        if (num % 2 != 0) {
            System.out.print("odd number");
        }
    }
}
