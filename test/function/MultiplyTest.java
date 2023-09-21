package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {
    @Test
    public  void  twoPositiveNumbers(){
        int value = Function.multiply(7,7);
        assertEquals(49, value);
    }

    @Test
    public  void  negativeSecondNumber(){
        int value = Function.multiply(7,-5);
        assertEquals(-35, value);
    }

    @Test
    public  void  negativeFirstNumber(){
        int value = Function.multiply(-4,5);
        assertEquals(-20, value);
    }

    @Test
    public  void  twoNegativeNumber(){
        int value = Function.multiply(-2,-2);
        assertEquals(4, value);
    }

    @Test
    public  void  zeroFirstNumber(){
        int value = Function.multiply(0,9);
        assertEquals(0, value);
    }

    @Test
    public  void  zeroSecondNumber(){
        int value = Function.multiply(-10,0);
        assertEquals(0, value);
    }

    @Test
    public  void  bothNumbersZero(){
        int value = Function.multiply(0,0);
        assertEquals(0, value);
    }

}