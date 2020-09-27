package com.chessboard.validator.moves.boundary;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.validator.moves.MovesValidator;

public class BoundaryValidator extends MovesValidator {

    public BoundaryValidator(Board board) {
        super(null,board);
    }

    public boolean validateMove(Position nextPosition) {
        if ((nextPosition.getColumn() <= getBoard().getNumberOfColumn()) && (nextPosition.getRow() <= getBoard().getNumberOfRows())
                && ((nextPosition.getColumn() > 0 ) && (nextPosition.getRow() > 0))) {
            return true;
        }
        return false;
    }
}
