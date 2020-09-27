package com.chessboard.pieces;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.strategy.movement.IMovementStrategy;
import com.chessboard.strategy.movement.QueenMovementStrategy;

import java.util.List;

public class Queen extends Piece {


    public Queen(Board board) {
        setMovementStrategy(new QueenMovementStrategy(board));
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        return getMovementStrategy().getPossibleMoves(position);
    }


}
