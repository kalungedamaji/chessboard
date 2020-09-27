package com.chessboard.pieces;


import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.strategy.movement.IMovementStrategy;
import com.chessboard.strategy.movement.KingMovementStrategy;

import java.util.List;

public class King extends Piece {


    public King(Board board) {
        setMovementStrategy(new KingMovementStrategy(board));
    }

    public List<Position> getPossibleMoves(Position position) {
        return getMovementStrategy().getPossibleMoves(position);
    }


}
