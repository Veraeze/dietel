package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorOfTest {
    @Test
    public void testForTheNumberOfFactorOfAnInteger(){
        int factor = Function.factorOf(10);
        assertEquals(4, factor);
    }

}