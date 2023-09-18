package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsFactorialTest {
    @Test
    public void testForTheFactorialOfAnInteger(){
        int result = Function.factorialOf(5);
        assertEquals(120, result);
    }

}