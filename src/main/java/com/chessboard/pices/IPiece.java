package com.chessboard.pices;

import com.chessboard.common.Position;

import java.util.List;

public interface IPiece {
    public Position getPosition();
    public void setPosition(Position position);
    public List<Position> getPossibleMoves();
}
