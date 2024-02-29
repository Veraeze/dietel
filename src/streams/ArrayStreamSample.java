package streams;

import java.util.Arrays;

public class ArrayStreamSample {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        Arrays.stream(nums)
                .map((num) -> num * 2)
                .forEach(System.out::println);

        System.out.println(Arrays.toString(nums));
    }
}
