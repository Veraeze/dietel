package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxTest {
    @Test
    public void minimumAndMaximumOfSum(){
        int[] numbers = {5, 3, 4, 1, 2};
        int[] result = {10, 14};
        assertArrayEquals(result, MinMax.minMaxSum(numbers));
    }
}