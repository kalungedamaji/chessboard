package com.chessboard.strategy.movement;

import com.chessboard.common.Position;

import java.util.List;

public interface IMovementStrategy {

    public List<Position> getPossibleMoves();

}
