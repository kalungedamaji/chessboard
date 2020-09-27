package com.chessboard.strategy.movement;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.movesgenerator.PawnMovesGenerator;

import java.util.List;

public class PawnMovementStrategy extends MovementStrategy {
    public PawnMovementStrategy(Board board) {
        setMovesGenerator(new PawnMovesGenerator(board));
    }
    public PawnMovementStrategy(){

    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        return getMovesGenerator().getPossibleMoves(position);
    }

}
