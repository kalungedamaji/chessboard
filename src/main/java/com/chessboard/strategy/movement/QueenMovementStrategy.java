package com.chessboard.strategy.movement;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.movesgenerator.QueenMovesGenerator;

import java.util.List;

public class QueenMovementStrategy extends MovementStrategy {
    public QueenMovementStrategy(Board board) {
        setMovesGenerator(new QueenMovesGenerator(board));
    }

    public QueenMovementStrategy(){

    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        return getMovesGenerator().getPossibleMoves(position);
    }


}
