package com.chessboard.piecesfactory;

import com.chessboard.board.Board;
import com.chessboard.common.PieceEnum;
import com.chessboard.pieces.Bishop;
import com.chessboard.pieces.Horse;
import com.chessboard.pieces.IPiece;
import com.chessboard.pieces.King;
import com.chessboard.pieces.Pawn;
import com.chessboard.pieces.Queen;
import com.chessboard.pieces.Rook;

public class PieceFactory {

    public static IPiece getPiece(PieceEnum pieceEnum, Board board) {
        if(pieceEnum != null) {
            switch (pieceEnum) {
                case KING:
                    return new King(board);
                case QUEEN:
                    return new Queen(board);
                case HORSE:
                    return new Horse(board);
                case ROOK:
                    return new Rook(board);
                case BISHOP:
                    return new Bishop(board);
                case PAWN:
                    return new Pawn(board);
            }
        }
        return null;

    }
}

