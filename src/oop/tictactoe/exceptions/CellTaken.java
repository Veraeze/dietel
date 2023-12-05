package oop.tictactoe.exceptions;

public class CellTaken extends RuntimeException {
    public CellTaken(String message) {
        super(message);
    }
}
