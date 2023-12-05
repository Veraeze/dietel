package oop.tictactoe;

import java.util.Arrays;

public class TicTacToe {
    private ArrayCell[][] board;

    public TicTacToe(){
        board = new ArrayCell[3][3];
        for (ArrayCell[] cell: board){
            Arrays.fill(cell, ArrayCell.EMPTY);
        }
    }
    public ArrayCell[][] getBoard() {
        return board;
    }
}
