package com.chessboard.common;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public  class ValidationFunctionTest {

    @Test
    public void hasNextMoveMethodTest(){
        ValidationFunction<Position>   validationFunction=Mockito.mock(ValidationFunction.class);
        Position  inputPosition=Mockito.mock(Position.class);

        Mockito.when(validationFunction.validate(inputPosition)).thenReturn(true);

        boolean  actualValue =validationFunction.validate(inputPosition);
        assertTrue(actualValue);
        Mockito.verify(validationFunction).validate(inputPosition);


    }
}