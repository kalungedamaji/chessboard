package com.chessboard.board;

import com.chessboard.validator.moves.boundary.BoundaryValidator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    private Board board = new Board(8, 8);

    @Test
    public void getNumberOfColumnTest() {
        assertEquals(8, board.getNumberOfColumn());
    }

    @Test
    public void getNumberOfRowsTest() {
        assertEquals(8, board.getNumberOfRows());
    }


    @Test
    public void getBoundaryValidatorTest() {
        BoundaryValidator boundaryValidator = Mockito.mock(BoundaryValidator.class);
        Board board1 = Mockito.spy(board);
        board1.setBoundaryValidator(boundaryValidator);

        assertEquals(boundaryValidator, board1.getBoundaryValidator());
        Mockito.verify(board1).setBoundaryValidator(boundaryValidator);


    }

}