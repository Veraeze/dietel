package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopiesTest {
    @Test
    public void testForCopiesBetween0And4(){
        int copy = Function.copies(3);
        assertEquals(2000, copy);
    }
    @Test
    public void testForCopiesBetween5And9(){
        int copy = Function.copies(7);
        assertEquals(1800, copy);
    }
    @Test
    public void testForCopiesBetween10And29(){
        int copy = Function.copies(20);
        assertEquals(1600, copy);
    }
    @Test
    public void testForCopiesBetween30And49(){
        int copy = Function.copies(39);
        assertEquals(1500, copy);
    }
    @Test
    public void testForCopiesBetween50And99(){
        int copy = Function.copies(82);
        assertEquals(1300, copy);
    }
    @Test
    public void testForCopiesBetween100And199(){
        int copy = Function.copies(145);
        assertEquals(1200, copy);
    }
    @Test
    public void testForCopiesBetween200And499(){
        int copy = Function.copies(328 );
        assertEquals(1100, copy);
    }
    @Test
    public void testForCopiesGreaterThan499(){
        int copy = Function.copies(891);
        assertEquals(1000, copy);
    }
}