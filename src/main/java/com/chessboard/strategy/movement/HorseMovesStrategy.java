package com.chessboard.strategy.movement;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.movesgenerator.HorseMovesGenerator;

import java.util.List;

public class HorseMovesStrategy extends MovementStrategy {
    public HorseMovesStrategy(Board board) {
        setMovesGenerator(new HorseMovesGenerator(board));
    }
    public  HorseMovesStrategy(){

    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        return getMovesGenerator().getPossibleMoves(position);
    }


}
