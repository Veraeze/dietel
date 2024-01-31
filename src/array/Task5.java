package array;

import function.Function;
import function.TaskWed;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,8,99};
        StringBuilder result = new StringBuilder();
        for (int line = 0; line < array.length; line++){
            result.append(array[line]);
        }
        int value = Integer.parseInt(String.valueOf(result)) + 1;
        String[] answer = String.valueOf(value).split("");
        System.out.println(Arrays.toString(answer));
    }
}
