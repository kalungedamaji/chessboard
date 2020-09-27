package com.chessboard.common;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class MoveTwiceFunctionTest {
    @Test
    public void hasNextMoveMethodTest(){

        MoveTwiceFunction<MoveFunction,Position>   moveTwiceFunction=Mockito.mock(MoveTwiceFunction.class);
        MoveFunction<Position>   moveFunction=Mockito.mock(MoveFunction.class);
        Position  inputPosition=Mockito.mock(Position.class);
        Position  returnPosition=Mockito.mock(Position.class);

        Mockito.when(moveTwiceFunction.move(inputPosition,moveFunction)).thenReturn(returnPosition);

        Position  actualReturnPosition =moveTwiceFunction.move(inputPosition,moveFunction);
        assertEquals(returnPosition,actualReturnPosition);
        Mockito.verify(moveTwiceFunction).move(inputPosition,moveFunction);


    }
}