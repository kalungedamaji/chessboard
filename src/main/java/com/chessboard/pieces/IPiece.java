package com.chessboard.pieces;

import com.chessboard.common.Position;
import com.chessboard.strategy.movement.IMovementStrategy;

import java.util.List;

public interface IPiece {
    public List<Position> getPossibleMoves(Position  position);
    public void setMovementStrategy(IMovementStrategy movementStrategy);
}
