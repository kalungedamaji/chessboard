package com.chessboard.pieces;

import com.chessboard.strategy.movement.IMovementStrategy;

public abstract class Piece implements IPiece {
    private IMovementStrategy movementStrategy;

    public void setMovementStrategy(IMovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public IMovementStrategy getMovementStrategy() {
        return movementStrategy;
    }
}




