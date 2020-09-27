package com.chessboard.strategy.movement;

import com.chessboard.common.Position;
import com.chessboard.movesgenerator.KingMovesGenerator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class KingMovementStrategyTest {

    @Test
    public void hasGetPossibleMovesMethod() {

        Position inputPosition = new Position(6, 6);
        KingMovementStrategy kingMovementStrategy = Mockito.spy(KingMovementStrategy.class);
        KingMovesGenerator kingMovesGenerator = Mockito.mock(KingMovesGenerator.class);
        kingMovementStrategy.setMovesGenerator(kingMovesGenerator);

        List<Position> actualList = kingMovementStrategy.getPossibleMoves(inputPosition);

        Mockito.verify(kingMovementStrategy).getPossibleMoves(inputPosition);
        assertTrue(actualList instanceof List);
    }

}