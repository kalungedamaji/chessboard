package com.chessboard.validator.moves;

import com.chessboard.common.Position;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class IMovesValidatorTest {


    @Test
    public void hasValidMoveMethod() {
        Position inputPosition = new Position(6, 6);
        IMovesValidator iMovesValidator = Mockito.mock(IMovesValidator.class);

        iMovesValidator.validateMove(inputPosition);

        Mockito.verify(iMovesValidator).validateMove(inputPosition);
    }

}