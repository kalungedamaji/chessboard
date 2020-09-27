package com.chessboard.strategy.movement;

import com.chessboard.common.Position;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IMovementStrategyTest {
    @Test
    public void hasGetPossibleMovesMethod() {

        Position inputPosition = new Position(6, 6);
        IMovementStrategy iMovementStrategy = Mockito.mock(IMovementStrategy.class);
        List<Position> expectedList = new ArrayList<>();
        Mockito.when(iMovementStrategy.getPossibleMoves(inputPosition)).thenReturn(expectedList);

        List<Position> actualList = iMovementStrategy.getPossibleMoves(inputPosition);

        Mockito.verify(iMovementStrategy).getPossibleMoves(inputPosition);
        assertTrue(actualList instanceof List);
    }

}