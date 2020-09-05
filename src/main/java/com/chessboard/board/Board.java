package com.chessboard.board;

import java.lang.reflect.Array;

public class Board {
    private  int board [][];
    private int numberOfRows;
    private int numberOfColumn;
    public  Board(int numberOfRows,int numberOfColumn){
        board=new int [numberOfRows][numberOfColumn];
        this.numberOfRows=numberOfRows;
        this.numberOfColumn=numberOfColumn;
    }

    public int getNumberOfColumn() {
        return numberOfColumn;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }
}
