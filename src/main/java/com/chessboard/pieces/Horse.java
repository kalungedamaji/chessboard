package com.chessboard.pieces;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.strategy.movement.HorseMovesStrategy;

import java.util.List;

public class Horse extends  Piece {
    public Horse(Board board) {
        setMovementStrategy(new HorseMovesStrategy(board));
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        return getMovementStrategy().getPossibleMoves(position);
    }

}

