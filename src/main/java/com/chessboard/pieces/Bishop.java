package com.chessboard.pieces;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.strategy.movement.BishopMovementStrategy;
import com.chessboard.strategy.movement.IMovementStrategy;

import java.util.List;

public class Bishop extends  Piece {
    private IMovementStrategy movementStrategy;
    public Bishop(Board board) {
        setMovementStrategy(new BishopMovementStrategy(board));
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        return getMovementStrategy().getPossibleMoves(position);
    }


}
