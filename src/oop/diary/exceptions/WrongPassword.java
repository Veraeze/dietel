package oop.diary.exceptions;

public class WrongPassword extends RuntimeException {
    public WrongPassword(String message) {
        super(message);
    }
}
