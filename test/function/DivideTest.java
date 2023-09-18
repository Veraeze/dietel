package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {
    @Test
    public void testWhenSecondIntegerIsLessThanFirstInteger(){
        double value = Function.divide(10,5);
        assertEquals(2.00, value);
    }

    @Test
    public void testWhenFirstIntegerIsLessThanSecondInteger(){
        double value = Function.divide(7,96);
        assertEquals(0.07, value);
    }

    @Test
    public void testWhenSecondIntegerIsZero(){
        double value = Function.divide(7,0);
        assertEquals(0.00, value);
    }
}