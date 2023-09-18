package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateTest {
    @Test
    public void testForPercentageLessThan50() {
        int pay = Function.rate(42);
        assertEquals(11720, pay);
    }

    @Test
    public void testForPercentageBetween50And59() {
        int pay = Function.rate(55);
        assertEquals(16000, pay);
    }

    @Test
    public void testForPercentageBetween60And69() {
        int pay = Function.rate(68);
        assertEquals(22000, pay);
    }

    @Test
    public void testForPercentageGreaterThan69() {
        int pay = Function.rate(80);
        assertEquals(45000, pay);
    }

}