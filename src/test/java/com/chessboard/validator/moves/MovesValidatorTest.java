package com.chessboard.validator.moves;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class MovesValidatorTest {

    @Mock
    private Position  position;
    @Mock
    private Board  board;

    private MovesValidator  movesValidator= new MovesValidator(position, board) {
        @Override
        public boolean validateMove(Position nextPosition) {
            return false;
        }
    };

     @Test
    public void getPositionInstanceTest(){

        Position expectedPosition= movesValidator.getPosition();

         assertTrue(expectedPosition==position);
    }

    @Test
    public void getBoardInstanceTest(){

      Board expectedBoard=  movesValidator.getBoard();
        assertTrue( expectedBoard==board);

    }

}