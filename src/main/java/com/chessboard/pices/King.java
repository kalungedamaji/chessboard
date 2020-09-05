package com.chessboard.pices;


import com.chessboard.common.Position;
import com.chessboard.movementstrategy.MovementStrategy;

import java.util.List;

public class King extends Piece {

    public King(Position position, MovementStrategy movementStrategy) {
        super(position, movementStrategy);
    }

    public List<Position> getPossibleMoves(){
         return  getmovementStrategy().getPossibleMoves();
    }
}
