package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsEvenTest {
    @Test
    public void testIfIntegerIsEven(){
        boolean value = Function.isEven(68);
        assertTrue(value);
    }
    @Test
    public void testIfIntegerIsNotEven(){
        boolean value = Function.isEven(33);
        assertFalse(value);
    }

}