package array;

import function.Function;

public class Reverse {
    public static void main(String[] args) {
        String[] word = {"a", "b", "c"};
        int[] scores = {1, 1, 5};
        String total = Function.concatenateLists(word, scores);
        System.out.println(total);

    }
}
