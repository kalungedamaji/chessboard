package com.chessboard.pieces;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.strategy.movement.BishopMovementStrategy;
import com.chessboard.strategy.movement.IMovementStrategy;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BishopTest {

    @Test
    public void getPossibleMovesTest() {
        IMovementStrategy iMovementStrategy = Mockito.mock(BishopMovementStrategy.class);
        Bishop bishop = new Bishop(new Board(8, 8));
        bishop.setMovementStrategy(iMovementStrategy);
        Position position = new Position(4, 4);

        List<Position> expectedPositionList = Arrays.asList(new Position(5, 5),
                new Position(6, 6), new Position(7, 7),
                new Position(5, 3), new Position(6, 2),
                new Position(7, 1), new Position(3, 5), new Position(2, 6),
                new Position(1, 7),
                new Position(3, 3), new Position(2, 2), new Position(1, 1), new Position(0, 0));


        Mockito.when(iMovementStrategy.getPossibleMoves(position)).thenReturn(expectedPositionList);

        List<Position> actualPositionList = bishop.getPossibleMoves(position);


        Mockito.verify(iMovementStrategy).getPossibleMoves(position);

        assertEquals(expectedPositionList, actualPositionList);


    }

}