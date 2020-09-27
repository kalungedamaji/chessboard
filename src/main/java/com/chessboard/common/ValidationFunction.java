package com.chessboard.common;

@FunctionalInterface
public interface ValidationFunction<Position> {
    boolean validate(Position  position);
}
