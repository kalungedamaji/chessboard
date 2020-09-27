package com.chessboard.strategy.movement;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.movesgenerator.KingMovesGenerator;

import java.util.List;

public class KingMovementStrategy extends MovementStrategy {

    public KingMovementStrategy(Board board) {
        setMovesGenerator(new KingMovesGenerator(board));
    }

    public  KingMovementStrategy(){

    }

    public List<Position> getPossibleMoves(Position position) {
        return getMovesGenerator().getPossibleMoves(position);
    }


}
