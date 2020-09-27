package com.chessboard.strategy.movement;

import com.chessboard.common.Position;
import com.chessboard.movesgenerator.KingMovesGenerator;
import com.chessboard.movesgenerator.PawnMovesGenerator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PawnMovementStrategyTest {

    @Test
    public void hasGetPossibleMovesMethod() {

        Position inputPosition = new Position(6, 6);
        PawnMovementStrategy pawnMovementStrategy = Mockito.spy(PawnMovementStrategy.class);
        PawnMovesGenerator pawnMovesGenerator = Mockito.mock(PawnMovesGenerator.class);
        pawnMovementStrategy.setMovesGenerator(pawnMovesGenerator);

        List<Position> actualList = pawnMovementStrategy.getPossibleMoves(inputPosition);

        Mockito.verify(pawnMovementStrategy).getPossibleMoves(inputPosition);
        assertTrue(actualList instanceof List);
    }

}