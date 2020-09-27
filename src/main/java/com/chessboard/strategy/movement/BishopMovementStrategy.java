package com.chessboard.strategy.movement;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.movesgenerator.BishopMovesGenerator;

import java.util.List;

public class BishopMovementStrategy extends MovementStrategy {

    public BishopMovementStrategy(){
        
    }
    public BishopMovementStrategy(Board board) {
        setMovesGenerator(new BishopMovesGenerator(board));
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        return getMovesGenerator().getPossibleMoves(position);

    }

}
