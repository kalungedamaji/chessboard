package com.chessboard.pieces;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.strategy.movement.PawnMovementStrategy;

import java.util.List;

public class Pawn extends Piece {
    public Pawn(Board board) {
        setMovementStrategy(new PawnMovementStrategy(board));
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        return getMovementStrategy().getPossibleMoves(position);
    }

}
