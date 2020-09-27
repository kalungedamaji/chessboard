package com.chessboard.strategy.movement;

import com.chessboard.common.Position;
import com.chessboard.movesgenerator.HorseMovesGenerator;
import com.chessboard.movesgenerator.KingMovesGenerator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HorseMovesStrategyTest {

    @Test
    public void hasGetPossibleMovesMethod() {

        Position inputPosition = new Position(6, 6);
        HorseMovesStrategy horseMovesStrategy = Mockito.spy(HorseMovesStrategy.class);
        HorseMovesGenerator horseMovesGenerator = Mockito.mock(HorseMovesGenerator.class);
        horseMovesStrategy.setMovesGenerator(horseMovesGenerator);

        List<Position> actualList = horseMovesStrategy.getPossibleMoves(inputPosition);

        Mockito.verify(horseMovesStrategy).getPossibleMoves(inputPosition);
        assertTrue(actualList instanceof List);
    }

}