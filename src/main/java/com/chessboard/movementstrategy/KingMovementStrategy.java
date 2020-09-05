package com.chessboard.movementstrategy;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.movesvalidator.MovesValidator;

import java.util.ArrayList;
import java.util.List;

public class KingMovementStrategy  extends  MovementStrategy{
    public KingMovementStrategy(Position position, Board board, MovesValidator  movesValidator) {
        super(position,board, movesValidator);
    }

    public List<Position> getPossibleMoves() {
        List<Position> listOfPossiblePosition =new ArrayList<Position>();
        Position  nextPosition= new Position(6,6);
        if(getMovesValidator().valiadateMove(nextPosition).isPresent()){
            listOfPossiblePosition.add(nextPosition);
        }
        return listOfPossiblePosition;
    }
}
