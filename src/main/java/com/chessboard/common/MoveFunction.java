package com.chessboard.common;

@FunctionalInterface
public interface MoveFunction<Position> {
    Position nextMove(Position position);
}
