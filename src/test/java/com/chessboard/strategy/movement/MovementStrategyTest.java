package com.chessboard.strategy.movement;

import com.chessboard.common.Position;
import com.chessboard.movesgenerator.IMovesGenerator;
import com.chessboard.movesgenerator.MovesGeneratorImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MovementStrategyTest {


    @Test
    public void hasGetPossibleMovesMethod() {

        Position inputPosition = new Position(6, 6);
        MovementStrategy iMovesGenerator = Mockito.mock(MovementStrategy.class);
        List<Position> expectedList = new ArrayList<>();
        Mockito.when(iMovesGenerator.getPossibleMoves(inputPosition)).thenReturn(expectedList);

        List<Position> actualList = iMovesGenerator.getPossibleMoves(inputPosition);

        Mockito.verify(iMovesGenerator).getPossibleMoves(inputPosition);
        assertTrue(actualList instanceof List);
    }

    @Test
    public void setterAndGetterOfMovementStratrgyMethod() {

        Position inputPosition = new Position(6, 6);
        MovementStrategy iMovesGenerator = Mockito.spy(MovementStrategy.class);
        MovesGeneratorImpl  movesGenerator=Mockito.mock(MovesGeneratorImpl.class);

        iMovesGenerator.setMovesGenerator(movesGenerator);
        IMovesGenerator  actualMovesGenerator=iMovesGenerator.getMovesGenerator();

        Mockito.verify(iMovesGenerator).setMovesGenerator(movesGenerator);
        assertEquals(movesGenerator,actualMovesGenerator);
    }


}