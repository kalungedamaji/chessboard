package com.chessboard.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    public void getXTest(){
        Position  position=new Position(5,4);
        assertEquals(5,position.getColumn());
    }

    @Test
    public void getYTest(){
        Position  position=new Position(5,4);
        assertEquals(4,position.getRow());
    }

    @Test
    public void toStringTest(){
        Position  position=new Position(5,4);
        assertEquals("E4",position.toString());
    }

    @Test
    public void equalsMethodReturnsTrue(){
        Position  position1=new Position(5,4);
        Position  position2=new Position(5,4);

        assertTrue(position1.equals(position2));

    }


    @Test
    public void equalsMethodReturnsFalse(){
        Position  position1=new Position(5,4);
        Position  position2=new Position(5,5);

        assertFalse(position1.equals(position2));

    }

    @Test
    public  void hasCodeEqualTest(){
        Position  position1=new Position(5,5);
        Position  position2=new Position(5,5);

        assertEquals(position1.hashCode(),position2.hashCode());
    }

    @Test
    public  void hasCodeNotEqualTest(){
        Position  position1=new Position(5,5);
        Position  position2=new Position(5,4);

        assertNotEquals(position1.hashCode(),position2.hashCode());
    }

}