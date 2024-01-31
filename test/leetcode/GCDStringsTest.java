package leetcode;

import function.Function;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDStringsTest {

    @Test
    void add() {
        int[] input = {2, 3, 5, 6, 7, 2,1};
        int[] output = {5, 11, 9,1};
        assertArrayEquals(output, Function.addTwoElements(input));
    }

    @Test
    void add2(){
        int[] input = {-3, 4, 5, 1, 2,3,-1, 4};
        int[] output = {1, 6, 5, 3};
        assertArrayEquals(output, Function.addTwoElements(input));
    }
}