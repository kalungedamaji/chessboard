package com.chessboard.application;

import com.chessboard.board.Board;
import com.chessboard.common.PieceEnum;
import com.chessboard.common.Position;
import com.chessboard.pices.IPiece;
import com.chessboard.piecesfactory.Piecesfactory;

import java.util.List;

public class Application {
    public static void main() {
        Board board = new Board(8, 8);
        Position position = new Position(5, 5);
         PieceEnum piece= PieceEnum.valueOf("King");
        IPiece  iPiece=Piecesfactory.getPiece(piece,position,board);
        List<Position> possiblemoves = iPiece.getPossibleMoves();
    }


}
