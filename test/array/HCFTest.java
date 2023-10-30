package array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static array.PrimeFactors.*;

class HCFTest {
    @Test
    public void primeTest(){
        assertEquals(10, PrimeFactors.primeProduct(10));
    }

    @Test
    public void highestCommonFactorTest(){
        int[] result = {2, 5, 5};
        assertArrayEquals(result, PrimeFactors.highestCommonFactors(primeFactors(factorArray(50))));
    }

    @Test
    public void primeFactorTest(){
        int[] result = {2, 5};
       assertArrayEquals(result, PrimeFactors.primeFactors(factorArray(10)));
    }
}