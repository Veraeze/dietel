package cls;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int number = input.nextInt();

                int square = number * number;

                System.out.printf("The square of %d is %d", number, square);

    }
}
