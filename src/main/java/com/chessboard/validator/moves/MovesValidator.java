package com.chessboard.validator.moves;

import com.chessboard.board.Board;
import com.chessboard.common.Position;

public abstract class MovesValidator implements IMovesValidator {
    private Position position;
    private    Board  board;

    public MovesValidator(Position position, Board board){
        this.position=position;
        this.board= board;
    }

    public Board getBoard() {
        return board;
    }

    public Position getPosition() {
        return position;
    }


}
