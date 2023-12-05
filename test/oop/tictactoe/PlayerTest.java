package oop.tictactoe;

import oop.tictactoe.exceptions.CellTaken;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    Player player;
    ArrayCell[][] arrayCells;
    TicTacToe ticTacToe;
    @BeforeEach
    void setPlayer(){
        player = new Player("name");
        ticTacToe = new TicTacToe();
        arrayCells = new ArrayCell[][]{{ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY},
                                        {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY},
                                        {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
    }

    @Test
    public void testThatNameIsCorrect(){
        assertEquals("name", player.getName());
    }

    @Test
    public void testThatAMoveIsMadeWhenFirstPlayerPlaysOnce(){
        assertArrayEquals(arrayCells, ticTacToe.getBoard());
        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("1"));
    }

    @Test
    public void testThatAMoveIsMadeWhenSecondPlayerPlaysOnce(){
        assertArrayEquals(arrayCells, ticTacToe.getBoard());
        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("1"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("5"));

    }

    @Test
    public void testThatAMoveIsMadeWhenFirstPlayerPlaysTwice(){
        assertArrayEquals(arrayCells, ticTacToe.getBoard());
        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("1"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("5"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("9"));
    }

    @Test
    public void testThatAMoveIsMadeWhenSecondPlayerPlaysTwice(){
        assertArrayEquals(arrayCells, ticTacToe.getBoard());
        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("1"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("5"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("9"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.X},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("3"));
    }

    @Test
    public void testThatAMoveIsMadeWhenFirstPlayerPlaysThrice(){
        assertArrayEquals(arrayCells, ticTacToe.getBoard());
        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("1"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("5"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("9"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.X},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("3"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.X},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.O, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("7"));
    }

    @Test
    public void testThatAMoveIsMadeWhenSecondPlayerPlaysThrice(){
        assertArrayEquals(arrayCells, ticTacToe.getBoard());
        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("1"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("5"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("9"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.X},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("3"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.X},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.O, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("7"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.X, ArrayCell.X},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.O, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("2"));
    }

    @Test
    public void testThatAMoveIsMadeWhenFirstPlayerPlays4Times(){
        assertArrayEquals(arrayCells, ticTacToe.getBoard());
        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("1"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("5"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("9"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.X},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("3"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.X},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.O, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("7"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.X, ArrayCell.X},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.O, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("2"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.X, ArrayCell.X},
                {ArrayCell.O, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.O, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("4"));
    }

    @Test
    public void testThatAMoveIsMadeWhenSecondPlayerPlays4Times(){
        assertArrayEquals(arrayCells, ticTacToe.getBoard());
        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("1"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("5"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("9"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.X},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("3"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.X},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.O, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("7"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.X, ArrayCell.X},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.O, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("2"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.X, ArrayCell.X},
                {ArrayCell.O, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.O, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("4"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.X, ArrayCell.X},
                {ArrayCell.O, ArrayCell.X, ArrayCell.X},
                {ArrayCell.O, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("6"));
    }

    @Test
    public void testThatAMoveIsMadeWhenFirstPlayerPlays5Times(){
        assertArrayEquals(arrayCells, ticTacToe.getBoard());
        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("1"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("5"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("9"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.X},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("3"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.X},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.O, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("7"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.X, ArrayCell.X},
                {ArrayCell.EMPTY, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.O, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("2"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.X, ArrayCell.X},
                {ArrayCell.O, ArrayCell.X, ArrayCell.EMPTY},
                {ArrayCell.O, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("4"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.X, ArrayCell.X},
                {ArrayCell.O, ArrayCell.X, ArrayCell.X},
                {ArrayCell.O, ArrayCell.EMPTY, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("6"));

        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.X, ArrayCell.X},
                {ArrayCell.O, ArrayCell.X, ArrayCell.X},
                {ArrayCell.O, ArrayCell.O, ArrayCell.O}};
        assertArrayEquals(arrayCells, player.play("8"));
    }
    @Test
    public void testThatExceptionIsThrown_WhenAPlayerSelectsACellThatHasBeenTaken(){
        assertArrayEquals(arrayCells, ticTacToe.getBoard());
        arrayCells = new ArrayCell[][]{{ArrayCell.O, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY},
                {ArrayCell.EMPTY, ArrayCell.EMPTY, ArrayCell.EMPTY}};
        assertArrayEquals(arrayCells, player.play("1"));
        assertThrows(CellTaken.class, ()-> player.play("1"));
    }
}
