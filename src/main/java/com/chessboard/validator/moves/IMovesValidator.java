package com.chessboard.validator.moves;


import com.chessboard.common.Position;

public interface IMovesValidator {
    public boolean validateMove(Position nextPosition);
}
