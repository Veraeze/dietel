package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPrimeNumberTest {
    @Test
    public void testIfIntegerIsAPrimeNumber() {
        boolean number = Function.isPrimeNumber(5);
        assertTrue(number);
    }
    @Test
    public void testIfIntegerIsNotAPrimeNumber() {
        boolean number = Function.isPrimeNumber(16);
        assertFalse(number);
    }
}