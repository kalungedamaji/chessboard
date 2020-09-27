package com.chessboard.strategy.movement;

import com.chessboard.common.Position;
import com.chessboard.movesgenerator.KingMovesGenerator;
import com.chessboard.movesgenerator.QueenMovesGenerator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueenMovementStrategyTest {

    @Test
    public void hasGetPossibleMovesMethod() {

        Position inputPosition = new Position(6, 6);
        QueenMovementStrategy queenMovementStrategy = Mockito.spy(QueenMovementStrategy.class);
        QueenMovesGenerator queenMovesGenerator = Mockito.mock(QueenMovesGenerator.class);
        queenMovementStrategy.setMovesGenerator(queenMovesGenerator);

        List<Position> actualList = queenMovementStrategy.getPossibleMoves(inputPosition);

        Mockito.verify(queenMovementStrategy).getPossibleMoves(inputPosition);
        assertTrue(actualList instanceof List);
    }

}