package com.chessboard.strategy.movement;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.movesgenerator.RookMovesGenerator;

import java.util.List;

public class RookMovementStrategy extends MovementStrategy {

    public RookMovementStrategy(Board board) {
        setMovesGenerator(new RookMovesGenerator(board));
    }
    public RookMovementStrategy(){
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        return getRookMovementGenerator().getPossibleMoves(position);
    }

    public RookMovesGenerator getRookMovementGenerator() {
        return (RookMovesGenerator) getMovesGenerator();
    }
}
