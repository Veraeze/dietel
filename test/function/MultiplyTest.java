package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {
    @Test
    public  void  testThatTwoNumbersCanMultiply(){
        int value = Function.multiply(7,7);
        assertEquals(49, value);
    }

}