package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSquareTest {
    @Test
    public void ifIntegerIsASquare(){
        boolean number = Function.isSquare(25);
        assertTrue(number);
    }

    @Test
    public void ifIntegerIsNotASquare(){
        boolean number = Function.isSquare(12);
        assertFalse(number);
    }

}