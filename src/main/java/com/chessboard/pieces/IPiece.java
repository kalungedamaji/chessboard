package com.chessboard.pieces;

import com.chessboard.common.Position;

import java.util.List;

public interface IPiece {
    public Position getPosition();
    public List<Position> getPossibleMoves();
}
