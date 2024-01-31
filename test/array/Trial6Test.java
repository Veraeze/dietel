package array;

import org.junit.Test;

import static array.Trial6.occur;
import static org.junit.jupiter.api.Assertions.*;

public class Trial6Test {
    @Test
    public void mostOccurrence(){
        assertEquals(5, occur(new int[]{3, 4, 5, 5}));
    }

    @Test
    public void mostOccurrence1(){
        assertEquals(1, occur(new int[]{2, 1,1,1, 1, 2, 2}));
    }


}