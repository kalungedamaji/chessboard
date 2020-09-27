package com.chessboard.common;

@FunctionalInterface
public interface MoveTwiceFunction<MoveFunction,Position> {
        Position move(Position position, MoveFunction moveFunction);
}
