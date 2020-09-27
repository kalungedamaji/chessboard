package com.chessboard.movesgenerator;

import com.chessboard.common.Position;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IMovesGeneratorTest {


    @Test
    public void hasGetPossibleMovesMethod() {

        Position inputPosition = new Position(6, 6);
        IMovesGenerator iMovesGenerator = Mockito.mock(IMovesGenerator.class);
        List<Position> expectedList = new ArrayList<>();
        Mockito.when(iMovesGenerator.getPossibleMoves(inputPosition)).thenReturn(expectedList);

        List<Position> actualList = iMovesGenerator.getPossibleMoves(inputPosition);

        Mockito.verify(iMovesGenerator).getPossibleMoves(inputPosition);
        assertTrue(actualList instanceof List);
    }

}