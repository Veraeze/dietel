package oop;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    public void createTimeTest() {
        Time time = new Time(1, 0, 0);
        assertEquals(1, time.getHour());
        assertEquals(0, time.getMinute());
        assertEquals(0, time.getSecond());
    }

    @Test
    public void createTimeWithInvalidHourTest() {
        assertThrows(IllegalArgumentException.class, ()->new Time(25, 0, 0));
    }
    @Test
    public void createTimeWithInvalidMinuteTest() {
        assertThrows(IllegalArgumentException.class, ()->new Time(2, 68, 0));
    }
    @Test
    public void createTimeWithInvalidSecondTest() {
        assertThrows(IllegalArgumentException.class, ()->new Time(2, 12, 70));
    }

    public static void main(String... args) {
        Time time;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hour");
        try {
            //code that may misbehave
            int hour = scanner.nextInt();
            time = new Time(hour, 32, 23);
            System.out.println("hour is " + time.getHour());
        }
        catch (InputMismatchException exception){
            //what to do if the specified error happens
            System.out.println("wrong data type, try again!");
            main();
        }
        catch (IllegalArgumentException ex) {
            //what to do if the specified error happens
            System.out.println("try again! hour is invalid");
            main();
        }
    }
}
