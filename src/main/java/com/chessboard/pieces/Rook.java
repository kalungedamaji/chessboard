package com.chessboard.pieces;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.strategy.movement.RookMovementStrategy;

import java.util.List;

public class Rook extends Piece {
    public Rook(Board board) {
        setMovementStrategy( new RookMovementStrategy(board));
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        return getMovementStrategy().getPossibleMoves(position);
    }

}
