package com.chessboard.common;

import com.chessboard.pieces.King;

public enum PieceEnum {
    KING("King"),QUEEN("Queen"),BISHOP("Bishop"),HORSE("Horse"),ROOK("Rook"),PAWN("Pawn");
    private String pieceName;
     PieceEnum(String pieceName){
        this.pieceName=pieceName;
    }

    public String getPieceName() {
        return pieceName;
    }

}
