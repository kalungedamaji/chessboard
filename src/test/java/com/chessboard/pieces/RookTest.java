package com.chessboard.pieces;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.strategy.movement.IMovementStrategy;
import com.chessboard.strategy.movement.QueenMovementStrategy;
import com.chessboard.strategy.movement.RookMovementStrategy;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RookTest {

    @Test
    public void getPossibleMovesTest() {
        IMovementStrategy iMovementStrategy = Mockito.mock(RookMovementStrategy.class);
        IPiece iPiece = new Rook(new Board(8, 8));
        iPiece.setMovementStrategy(iMovementStrategy);
        Position position = new Position(4, 4);
        List<Position> expectedPositionList = Arrays.asList(
                new Position(5, 4), new Position(6, 4), new Position(7, 4),
                new Position(3, 4), new Position(2, 4), new Position(1, 4), new Position(0, 4),
                new Position(4, 3), new Position(4, 2 ), new Position(4, 1), new Position(4, 0),
                new Position(4, 5), new Position(4, 6 ), new Position(4, 7));


        Mockito.when(iMovementStrategy.getPossibleMoves(position)).thenReturn(expectedPositionList);

        List<Position> actualPositionList = iPiece.getPossibleMoves(position);


        Mockito.verify(iMovementStrategy).getPossibleMoves(position);

        assertEquals(expectedPositionList, actualPositionList);


    }

}