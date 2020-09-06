package com.chessboard.pieces;


import com.chessboard.common.Position;
import com.chessboard.strategy.movement.MovementStrategy;

import java.util.List;

public class King extends Piece {

    public King(Position position, MovementStrategy movementStrategy) {
        super(position, movementStrategy);
    }

    public List<Position> getPossibleMoves(){
         return  getMovementStrategy().getPossibleMoves();
    }
}
