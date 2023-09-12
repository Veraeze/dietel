package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    @Test
    public void testiftheACturnson() {

        AirConditioner lg = new AirConditioner();
        lg.toggle();

        lg.toggle();

        assertTrue(!lg.checkIsOn());
    }

    @Test
    public void testiftheACturnsoff() {

        AirConditioner lg = new AirConditioner();
        lg.toggle();

        lg.toggle();

        assertFalse(lg.checkIsOn());
    }

    @Test
    public void increaseTemperatureTest() {

        AirConditioner lg = new AirConditioner();
        lg.toggle();

        lg.increaseTemperature();


        assertEquals(17 , lg.checkTemperature());
    }

    @Test
    public void decreaseTemperatureTest() {

        AirConditioner lg = new AirConditioner();
        lg.toggle();

        for (int temperature = 16; temperature < 19; temperature++) {

            lg.increaseTemperature();

        }

        lg.decreaseTemperature();

        assertEquals(18, lg.checkTemperature());
    }

    @Test
    public void beyondTemperatureTest() {
        AirConditioner lg = new AirConditioner();
        lg.toggle();

        for (int temperature = 16; temperature <= 30; temperature++) {

            lg.increaseTemperature();

        }
        assertEquals(30 , lg.checkTemperature());
    }

    @Test
    public void belowTemperatureTest() {

        AirConditioner lg = new AirConditioner();
        lg.toggle();

        lg.decreaseTemperature();

        assertEquals(16, lg.checkTemperature());
    }
}