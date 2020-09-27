package com.chessboard.pieces;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.strategy.movement.HorseMovesStrategy;
import com.chessboard.strategy.movement.IMovementStrategy;
import com.chessboard.strategy.movement.KingMovementStrategy;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {

    @Test
    public void getPossibleMovesTest() {
        IMovementStrategy iMovementStrategy = Mockito.mock(HorseMovesStrategy.class);
        Horse  horse = new Horse(new Board(8, 8));
        horse.setMovementStrategy(iMovementStrategy);
        Position position = new Position(4, 4);
        List<Position> expectedPositionList = Arrays.asList(new Position(6, 5),
                new Position( 6, 3), new Position( 2, 5),
                new Position(2, 3), new Position(5, 2),
                new Position(3, 2), new Position( 5, 6 ), new Position(3, 6 ));

        Mockito.when(iMovementStrategy.getPossibleMoves(position)).thenReturn(expectedPositionList);

        List<Position> actualPositionList = horse.getPossibleMoves(position);


        Mockito.verify(iMovementStrategy).getPossibleMoves(position);

        assertEquals(expectedPositionList, actualPositionList);


    }

}