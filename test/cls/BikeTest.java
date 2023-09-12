package cls;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    public void testIfTheBikeTurnsOn(){

        Bike honda = new Bike();

        honda.key();
        honda.key();

        assertTrue(honda.key());
    }

    @Test
    public void testIfTheBikeTurnsOff(){

        Bike honda = new Bike();

        honda.key();
        honda.key();

        assertFalse(!honda.key());
    }

    @Test
    public void accelerateTestGearOne() {

        Bike honda = new Bike();
        honda.key();


        honda.accelerate();
        honda.accelerate();
        honda.accelerate();
        assertEquals(3, honda.checkSpeed());

        honda.accelerate();

        assertEquals(4,honda.checkSpeed());
    }

    @Test
    public void accelerateTestGearTwo() {

        Bike honda = new Bike();
        honda.key();

        for (int count = 0; count <=20 ; count=count +1) {

            honda.accelerate();

        }
        assertEquals(21, honda.checkSpeed());

        honda.accelerate();

        assertEquals(23, honda.checkSpeed());
    }

    @Test
    public void accelerateTestGearThree() {

        Bike honda = new Bike();
        honda.key();

        for (int count = 0; count <=20 ; count=count+1) {

            honda.accelerate();

        }
        for (int count = 21; count <= 25 ; count=count+1) {

            honda.accelerate();

        }
        assertEquals(31, honda.checkSpeed());

        honda.accelerate();

        assertEquals(34, honda.checkSpeed());
    }

    @Test
    public void accelerateTestGearFour() {

        Bike honda = new Bike();
        honda.key();

        for (int count = 0; count <=20 ; count=count+1) {

            honda.accelerate();

        }
        for (int count = 21; count <= 25 ; count=count+1) {

            honda.accelerate();

        }
        for (int count = 26; count < 30 ; count=count+1) {

            honda.accelerate();

        }
        assertEquals(43, honda.checkSpeed());

        honda.accelerate();

        assertEquals(47, honda.checkSpeed());
    }

    @Test
    public void decelerateTestGearOne() {

        Bike honda = new Bike();
        honda.key();

        honda.accelerate();
        honda.accelerate();
        honda.accelerate();

        assertEquals(3,honda.checkSpeed());

        honda.decelerate();

        assertEquals(2, honda.checkSpeed());
    }

    @Test
    public void decelerateTestGearTwo() {

        Bike honda = new Bike();
        honda.key();

        for (int count = 0; count <22 ; count=count +1) {

            honda.accelerate();

        }
        assertEquals(23, honda.checkSpeed());

        honda.decelerate();

        assertEquals(21, honda.checkSpeed());
    }

    @Test
    public void decelerateTestGearThree() {

        Bike honda = new Bike();
        honda.key();

        for (int count = 0; count <= 26; count=count +1) {

            honda.accelerate();

        }
        assertEquals(34, honda.checkSpeed());

        honda.decelerate();

        assertEquals(31, honda.checkSpeed());
    }

    @Test
    public void decelerateTestGearFour() {

        Bike honda = new Bike();
        for (int count = 0; count <= 30; count = count+ 1) {

            honda.accelerate();
        }
        assertEquals(47, honda.checkSpeed());

        honda.decelerate();

        assertEquals(43, honda.checkSpeed());
        }

    @Test
    public void changeFromGearOneToGearTwo() {

        Bike honda = new Bike();
        honda.key();

        for (int count = 0; count < 20; count++) {

            honda.accelerate();

        }
        assertEquals(20, honda.checkSpeed());
        assertEquals(1, honda.checkGear());

        honda.accelerate();

        assertEquals(21, honda.checkSpeed());
        assertEquals(2, honda.checkGear());

        honda.decelerate();

        assertEquals(19, honda.checkSpeed());
        assertEquals(1,honda.checkGear());
    }

    @Test
    public void changeFromGearTwoToGearThree() {

        Bike honda = new Bike();
        honda.key();

        for (int count = 0; count <=24; count++) {

            honda.accelerate();

        }
        assertEquals(29, honda.checkSpeed());
        assertEquals(2, honda.checkGear());

        honda.accelerate();

        assertEquals(31, honda.checkSpeed());
        assertEquals(3, honda.checkGear());

        honda.decelerate();

        assertEquals(28, honda.checkSpeed());
        assertEquals(2,honda.checkGear());
    }

    @Test
    public void changeFromGearThreeToGearFour() {

        Bike honda = new Bike();
        honda.key();

        for (int count = 0; count <=28; count++) {

            honda.accelerate();

        }
        assertEquals(40, honda.checkSpeed());
        assertEquals(3, honda.checkGear());

        honda.accelerate();

        assertEquals(43, honda.checkSpeed());
        assertEquals(4, honda.checkGear());

        honda.decelerate();

        assertEquals(39, honda.checkSpeed());
        assertEquals(3,honda.checkGear());
    }
}