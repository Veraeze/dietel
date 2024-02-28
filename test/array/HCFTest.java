package array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static array.PrimeFactors.*;

class HCFTest {

    @Test
    public void highestCommonFactorTest(){
        int[] input = {8, 4, 12};
        int[] output = {2, 2};
        assertArrayEquals(output, HCF.returnHCF(input));
    }

    @Test
    public void primeFactorTest(){
        int[] input = {81, 9, 27};
        int[] output = {3, 3};
       assertArrayEquals(output, HCF.returnHCF(input));
    }
}