package com.chessboard.movesvalidator;

import com.chessboard.board.Board;
import com.chessboard.common.Position;

import java.util.Optional;

public class BoundaryValidator extends  MovesValidator {

    public BoundaryValidator(Position position , Board  board) {
        super(position, board);
    }

    public Optional<Boolean> valiadateMove( Position  nextPosition) {
          if( (nextPosition.getX()< getBoard().getNumberOfColumn()) && (nextPosition.getY()< getBoard().getNumberOfRows()))){
            return Optional.empty();
          }
        return Optional.empty();
    }
}
