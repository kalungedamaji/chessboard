package com.chessboard.strategy.movement;

import com.chessboard.movesgenerator.IMovesGenerator;

public abstract class MovementStrategy implements IMovementStrategy {


    IMovesGenerator movesGenerator;


    public void setMovesGenerator(IMovesGenerator movesGenerator) {
        this.movesGenerator = movesGenerator;
    }

    public IMovesGenerator getMovesGenerator() {
        return movesGenerator;
    }

}
