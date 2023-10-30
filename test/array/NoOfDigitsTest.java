package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoOfDigitsTest {

    @Test
public void noOfDigits(){
        int trial = NoOfDigits.noOfDigits(new String[]{"ABCjj!!21F0", "13CPZ", "A1L"});
        assertEquals(6, trial);
    }
}