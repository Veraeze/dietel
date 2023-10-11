package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapTest {

    @Test
    void swap() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] value = {3, 2, 1, 4, 5};
        int[] result = Function.swap(numbers, 0, 2);
        assertArrayEquals(value, result);
    }
}