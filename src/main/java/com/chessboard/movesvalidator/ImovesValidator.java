package com.chessboard.movesvalidator;


import com.chessboard.common.Position;

import java.util.Optional;

public interface ImovesValidator {
    public Optional<Boolean> valiadateMove(Position nextPosition);
}
