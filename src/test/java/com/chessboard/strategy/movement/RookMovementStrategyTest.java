package com.chessboard.strategy.movement;

import com.chessboard.common.Position;
import com.chessboard.movesgenerator.KingMovesGenerator;
import com.chessboard.movesgenerator.RookMovesGenerator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RookMovementStrategyTest {

    @Test
    public void hasGetPossibleMovesMethod() {

        Position inputPosition = new Position(6, 6);
        RookMovementStrategy rookMovementStrategy = Mockito.spy(RookMovementStrategy.class);
        RookMovesGenerator rookMovesGenerator = Mockito.mock(RookMovesGenerator.class);
        rookMovementStrategy.setMovesGenerator(rookMovesGenerator);

        List<Position> actualList = rookMovementStrategy.getPossibleMoves(inputPosition);

        Mockito.verify(rookMovementStrategy).getPossibleMoves(inputPosition);
        assertTrue(actualList instanceof List);
    }


}