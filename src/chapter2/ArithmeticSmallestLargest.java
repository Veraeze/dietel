package chapter2;

import java.util.Scanner;
import function.Function.*;

import static function.Function.*;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer");
        int first = input.nextInt();

        System.out.println("Enter second integer");
        int second = input.nextInt();

        System.out.println("Enter third integer");
        int third = input.nextInt();

        int[] integers = {first, second, third};
        int sum = sumOf(integers);
        int average = (int) averageOf(integers);
        int product = productOf(integers);
        int largest = maxOf(integers);
        int smallest = minOf(integers);

        System.out.printf("Sum: %d%nAverage: %d%nProduct: %d%nLargest: %d%nSmallest: %d", sum, average, product, largest, smallest);
    }
}
