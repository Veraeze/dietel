package oop;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private static void validate(int hour, int minute, int second) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    private static void validateSecond(int second) {
        boolean secondIsInvalid = second > 59 || second < 0;
        if (secondIsInvalid) throw new IllegalArgumentException("Second is invalid");
    }

    private static void validateMinute(int minute) {
        boolean minuteIsInvalid = minute > 59 || minute < 0;
        if (minuteIsInvalid) throw new IllegalArgumentException("Minute is invalid");
    }

    private static void validateHour(int hour) {
        boolean hourIsInvalid = hour > 23 || hour < 0;
        if (hourIsInvalid) throw new IllegalArgumentException("Hour is invalid");
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
