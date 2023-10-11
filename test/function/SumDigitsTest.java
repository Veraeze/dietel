package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDigitsTest {
    @Test
    public void sumOfThreeDigits(){
        int digit = Function.sumDigits(234);
        assertEquals(9, digit);
    }

    @Test
    public void secondDigitZero(){
        int digit = Function.sumDigits(304);
        assertEquals(7, digit);
    }

    @Test
    public void thirdDigitZero(){
        int digit = Function.sumDigits(230);
        assertEquals(5, digit);
    }

    @Test
    public void sumOfFourDigits(){
        int digit = Function.sumDigits(2341);
        assertEquals(10, digit);
    }



}