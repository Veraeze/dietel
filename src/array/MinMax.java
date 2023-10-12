package array;

import function.Function;

public class MinMax {

    public static void main(String[] args) {

        int[] numbers = {5, 3, 4, 1, 2};
        int total = 0;
        int large = Function.largestOf(numbers);
        int small = Function.smallestOf(numbers);
        int totall = MinMax.sumOf(numbers);

        for (int avoid = 0; avoid < numbers.length; avoid++) {
            total = MinMax.sumOf(numbers);
            total = total - numbers[avoid];
            System.out.println(total);
        }

        int minimum = totall - large;
        int maximum = totall - small;
        System.out.printf("The maximum is %d and the minimum is %d", maximum, minimum);
    }

    public static int sumOf(int[] numbers){
        int total = 0;
        for (int index = 0; index < numbers.length; index++){
            total += numbers[index];
        }
        return total;
    }
}
