package oop.tictactoe.exceptions;

public class InvalidSelection extends RuntimeException {
    public InvalidSelection(String message) {
        super(message);
    }
}
