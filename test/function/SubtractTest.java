package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractTest {
    @Test
    public void testForPositiveDifferenceIfFirstNumberIsGreaterThanSecondNumber(){
        int value = Function.subtract(7,3);
        assertEquals(4, value);
    }
    @Test
    public void testForPositiveDifferenceIfSecondNumberIsGreaterThanFirstNumber(){
        int value = Function.subtract(2,5);
        assertEquals(3, value);
    }
    @Test
    public void testForPositiveDifferenceIfFirstNumberIsEqualToSecondNumber(){
        int value = Function.subtract(3,3);
        assertEquals(0, value);
    }

}