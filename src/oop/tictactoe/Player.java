package oop.tictactoe;

import oop.tictactoe.exceptions.CellTaken;
import oop.tictactoe.exceptions.InvalidSelection;

public class Player {
    private final String name;
    private boolean player;
    private TicTacToe ticTacToe = new TicTacToe();
    private ArrayCell[][] board = ticTacToe.getBoard();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isPlayer() {
        return player;
    }

    public ArrayCell[][] play(String selection) {
        ArrayCell arrayCell = player ? ArrayCell.X : ArrayCell.O;
        player = !player;
        switch (selection) {
            case "1" -> {
                return cellOne(arrayCell);
            }
            case "2" -> {
                return cellTwo(arrayCell);
            }
            case "3" -> {
                return cellThree(arrayCell);
            }
            case "4" -> {
                return cellFour(arrayCell);
            }
            case "5" -> {
                return cellFive(arrayCell);
            }
            case "6" -> {
                return cellSix(arrayCell);
            }
            case "7" -> {
                return cellSeven(arrayCell);
            }
            case "8" -> {
                return cellEight(arrayCell);
            }
            case "9" -> {
                return cellNine(arrayCell);
            }
            default -> throw new InvalidSelection("Error! select between 1 - 9");
        }
    }

    private ArrayCell[][] cellNine(ArrayCell arrayCell) {
        if (board[2][2] == ArrayCell.EMPTY) board[2][2] = arrayCell;
        else spaceTaken();
        return board;
    }

    private ArrayCell[][] cellEight(ArrayCell arrayCell) {
        if (board[2][1] == ArrayCell.EMPTY) board[2][1] = arrayCell;
        else spaceTaken();
        return board;
    }

    private ArrayCell[][] cellSeven(ArrayCell arrayCell) {
        if (board[2][0] == ArrayCell.EMPTY) board[2][0] = arrayCell;
        else spaceTaken();
        return board;
    }

    private ArrayCell[][] cellSix(ArrayCell arrayCell) {
        if (board[1][2] == ArrayCell.EMPTY) board[1][2] = arrayCell;
        else spaceTaken();
        return board;
    }

    private ArrayCell[][] cellFive(ArrayCell arrayCell) {
        if (board[1][1] == ArrayCell.EMPTY) board[1][1] = arrayCell;
        else spaceTaken();
        return board;
    }

    private ArrayCell[][] cellFour(ArrayCell arrayCell) {
        if (board[1][0] == ArrayCell.EMPTY) board[1][0] = arrayCell;
        else spaceTaken();
        return board;
    }

    private ArrayCell[][] cellThree(ArrayCell arrayCell) {
        if (board[0][2] == ArrayCell.EMPTY) board[0][2] = arrayCell;
        else spaceTaken();
        return board;
    }

    private ArrayCell[][] cellTwo(ArrayCell arrayCell) {
        if (board[0][1] == ArrayCell.EMPTY) board[0][1] = arrayCell;
        else spaceTaken();
        return board;
    }

    private ArrayCell[][] cellOne(ArrayCell arrayCell) {
        if (board[0][0] == ArrayCell.EMPTY) board[0][0] = arrayCell;
        else spaceTaken();
        return board;
    }

    private void spaceTaken() {
        throw new CellTaken("This space has been taken. Try again!");
    }

    public void display() {
        for (ArrayCell[] arrayCells : board) {
            columnDisplay(arrayCells);
            System.out.println("\n");
        }
    }
    private void columnDisplay(ArrayCell[] arrayCells){
        for (int column = 0; column < arrayCells.length; column++) {
            for (int even = 0; even < column; even += 2) System.out.print("|\t\t");
            System.out.printf("%-9s", arrayCells[column]);
        }
    }
}

