package com.chessboard.board;

import com.chessboard.validator.moves.boundary.BoundaryValidator;

public class Board {
    private  int board [][];
    private int numberOfRows;
    private int numberOfColumn;
    private BoundaryValidator  boundaryValidator;
    public  Board(int numberOfRows,int numberOfColumn){
        board=new int [numberOfRows][numberOfColumn];
        this.numberOfRows=numberOfRows;
        this.numberOfColumn=numberOfColumn;
        boundaryValidator= new BoundaryValidator(this);
    }

    public BoundaryValidator getBoundaryValidator() {
        return boundaryValidator;
    }

    public void setBoundaryValidator(BoundaryValidator boundaryValidator) {
        this.boundaryValidator = boundaryValidator;
    }

    public int getNumberOfColumn() {
        return numberOfColumn;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }
}
