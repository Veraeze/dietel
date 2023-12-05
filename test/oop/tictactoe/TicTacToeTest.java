package oop.tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TicTacToeTest {
    @Test
    public void testThatValueIsEmpty(){
        TicTacToe board = new TicTacToe();
        ArrayCell[][] arrayCells = {{ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY},
                                    {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY},
                                    {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, board.getBoard());

    }
}
