package com.chessboard.movementstrategy;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.movesvalidator.MovesValidator;

public abstract class MovementStrategy  implements  ImovementStrategy{
    private Position  position;
    private Board  board;
    private MovesValidator movesValidator;

    public MovesValidator getMovesValidator(){
        return  movesValidator;
    }

    public Board getBoard() {
        return board;
    }

    public Position getPosition() {
        return position;
    }

    public MovementStrategy(Position  position, Board  board, MovesValidator movesValidator){
        this.position=position;
        this.board=board;
        this.movesValidator=movesValidator;
    }

}
