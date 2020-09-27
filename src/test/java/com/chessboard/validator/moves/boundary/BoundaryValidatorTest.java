package com.chessboard.validator.moves.boundary;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoundaryValidatorTest {
    private Board  board= new Board(8,8);

    @Test
    public void moveIsWithinBoundaryTest(){
        Position move= new Position(5,5);

       boolean validMove=board.getBoundaryValidator().validateMove(move);

        assertTrue(validMove);

    }

    @Test
    public void moveIsOutsideOfBoundaryTest(){
        Position move= new Position(5,9);

        boolean inValidMove=board.getBoundaryValidator().validateMove(move);

        assertFalse(inValidMove);
    }

}