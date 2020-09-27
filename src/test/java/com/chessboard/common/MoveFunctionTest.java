package com.chessboard.common;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.swing.text.Position;

import static org.junit.jupiter.api.Assertions.*;

class MoveFunctionTest {

    @Test
    public void hasNextMoveMethodTest(){
        MoveFunction<Position>   moveFunction=Mockito.mock(MoveFunction.class);
        Position  inputPosition=Mockito.mock(Position.class);
        Position  returnPosition=Mockito.mock(Position.class);

        Mockito.when(moveFunction.nextMove(inputPosition)).thenReturn(returnPosition);

        Position  actualReturnPosition =moveFunction.nextMove(inputPosition);

         assertEquals(returnPosition,actualReturnPosition);
         Mockito.verify(moveFunction).nextMove(inputPosition);


    }

}