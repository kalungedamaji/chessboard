package com.chessboard.pieces;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.strategy.movement.IMovementStrategy;
import com.chessboard.strategy.movement.KingMovementStrategy;
import com.chessboard.strategy.movement.PawnMovementStrategy;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PawnTest {

    @Test
    public void getPossibleMovesTest() {
        IMovementStrategy iMovementStrategy = Mockito.mock(PawnMovementStrategy.class);
        Pawn pawn = new Pawn(new Board(8, 8));
        pawn.setMovementStrategy(iMovementStrategy);
        Position position = new Position(4, 4);
        List<Position> expectedPositionList = Arrays.asList(
                new Position(4,5));

        Mockito.when(iMovementStrategy.getPossibleMoves(position)).thenReturn(expectedPositionList);

        List<Position> actualPositionList = pawn.getPossibleMoves(position);


        Mockito.verify(iMovementStrategy).getPossibleMoves(position);

        assertEquals(expectedPositionList, actualPositionList);


    }

}