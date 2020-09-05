package com.chessboard.pices;

import com.chessboard.common.Position;
import com.chessboard.movementstrategy.MovementStrategy;

public abstract class Piece {
    private Position  position;
    private MovementStrategy  movementStrategy;

    public Piece(Position  position,MovementStrategy  movementStrategy){
        this.position=position;
        this.movementStrategy=movementStrategy;
    }
    public Position getPosition() {
        return position;
    }

    public MovementStrategy getmovementStrategy() {
        return movementStrategy;
    }


}
