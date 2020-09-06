package com.chessboard.validator.moves;


import com.chessboard.common.Position;

public interface ImovesValidator {
    public boolean validateMove(Position nextPosition);
}
