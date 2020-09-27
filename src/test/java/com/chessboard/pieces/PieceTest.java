package com.chessboard.pieces;

import com.chessboard.common.Position;
import com.chessboard.strategy.movement.IMovementStrategy;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @Test
    public void setAndGetMovementStrategyTest(){
        IMovementStrategy iMovementStrategy  = Mockito.mock(IMovementStrategy.class);
        Piece  piece=new Piece() {
            @Override
            public List<Position> getPossibleMoves(Position position) {
                return null;
            }
        };

        piece.setMovementStrategy(iMovementStrategy);

        IMovementStrategy expectedIMovementStrategy =piece.getMovementStrategy();
         assertEquals(expectedIMovementStrategy,iMovementStrategy);
         //TO-DO  setter verification
    }

}