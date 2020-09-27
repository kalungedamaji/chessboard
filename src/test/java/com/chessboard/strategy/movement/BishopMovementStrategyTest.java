package com.chessboard.strategy.movement;

import com.chessboard.common.Position;
import com.chessboard.movesgenerator.BishopMovesGenerator;
import com.chessboard.movesgenerator.KingMovesGenerator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BishopMovementStrategyTest {

    @Test
    public void hasGetPossibleMovesMethod() {

        Position inputPosition = new Position(6, 6);
        BishopMovementStrategy bishopMovementStrategy = Mockito.spy(BishopMovementStrategy.class);
        BishopMovesGenerator bishopMovesGenerator = Mockito.mock(BishopMovesGenerator.class);
        bishopMovementStrategy.setMovesGenerator(bishopMovesGenerator);

        List<Position> actualList = bishopMovementStrategy.getPossibleMoves(inputPosition);

        Mockito.verify(bishopMovementStrategy).getPossibleMoves(inputPosition);
        assertTrue(actualList instanceof List);
    }

}