package com.chessboard.pieces;

import com.chessboard.common.Position;
import com.chessboard.strategy.movement.IMovementStrategy;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IPieceTest {

    @Test
    public void hasGetPossibleMovesMethod() {

        Position inputPosition = new Position(6, 6);
        IPiece  iPiece = Mockito.mock(IPiece.class);
        List<Position> expectedList = new ArrayList<>();
        Mockito.when(iPiece.getPossibleMoves(inputPosition)).thenReturn(expectedList);

        List<Position> actualList = iPiece.getPossibleMoves(inputPosition);

        Mockito.verify(iPiece).getPossibleMoves(inputPosition);
        assertTrue(actualList instanceof List);
    }

    @Test
    public void HasSetMovementStrategyMethod(){
        IPiece  iPiece = Mockito.mock(IPiece.class);
        IMovementStrategy  iMovementStrategy  = Mockito.mock(IMovementStrategy.class);

        iPiece.setMovementStrategy(iMovementStrategy);

        Mockito.verify(iPiece).setMovementStrategy(iMovementStrategy);
    }


}