package com.chessboard.pieces;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.strategy.movement.IMovementStrategy;
import com.chessboard.strategy.movement.KingMovementStrategy;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KingTest {

    @Test
    public void getPossibleMovesTest() {
        IMovementStrategy iMovementStrategy = Mockito.mock(KingMovementStrategy.class);
        King king = new King(new Board(8, 8));
        king.setMovementStrategy(iMovementStrategy);
        Position position = new Position(4, 4);
        List<Position> expectedPositionList = Arrays.asList(new Position(5, 4),
                new Position(3, 4), new Position(4, 3),
                new Position(4, 5), new Position(5, 5),
                new Position(5, 3), new Position( 3, 5), new Position(3, 3 ));

         Mockito.when(iMovementStrategy.getPossibleMoves(position)).thenReturn(expectedPositionList);

        List<Position> actualPositionList = king.getPossibleMoves(position);


        Mockito.verify(iMovementStrategy).getPossibleMoves(position);

        assertEquals(expectedPositionList, actualPositionList);


    }

}