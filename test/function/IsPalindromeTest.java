package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {
    @Test
    public void ifIntegerIsPalindrome(){
        boolean number = Function.isPalindrome(12341);
        assertTrue(number);
    }

    @Test
    public void ifIntegerIsNotPalindrome(){
        boolean number = Function.isPalindrome(12345);
        assertFalse(number);
    }

}