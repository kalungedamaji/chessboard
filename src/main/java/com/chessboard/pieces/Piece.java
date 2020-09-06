package com.chessboard.pieces;

import com.chessboard.common.Position;
import com.chessboard.strategy.movement.MovementStrategy;

public abstract class Piece implements  IPiece {
    private Position  position;
    private MovementStrategy  movementStrategy;

    public Piece(Position  position,MovementStrategy  movementStrategy){
        this.position=position;
        this.movementStrategy=movementStrategy;
    }
    public Position getPosition() {
        return position;
    }

    public MovementStrategy getMovementStrategy() {
        return movementStrategy;
    }


}
