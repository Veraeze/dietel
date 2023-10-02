package array;

import function.Function;

public class Reverse {
    public static void main(String[] args) {
        int[] scores = {1, 1, 1, 1, 2};
        int total = Function.doWhileSum(scores);
        System.out.println(total);

    }
}
