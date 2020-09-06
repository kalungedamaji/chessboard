package com.chessboard.validator.moves.boundary;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.validator.moves.MovesValidator;

public class BoundaryValidator extends MovesValidator {

    public BoundaryValidator(Position position, Board board) {
        super(position, board);
    }

    public boolean validateMove(Position nextPosition) {
        if ((nextPosition.getX() < getBoard().getNumberOfColumn()) && (nextPosition.getY() < getBoard().getNumberOfRows())
                && ((nextPosition.getX() > 0 ) && (nextPosition.getY() > 0))) {
            return true;
        }
        return false;
    }
}
