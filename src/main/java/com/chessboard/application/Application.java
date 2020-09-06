package com.chessboard.application;

import com.chessboard.board.Board;
import com.chessboard.common.PieceEnum;
import com.chessboard.common.Position;
import com.chessboard.pieces.IPiece;
import com.chessboard.piecesfactory.Piecesfactory;

import java.util.List;

public class Application {
    public static void main(String args[]) {
        Board board = new Board(8, 8);
        Position position = new Position(5, 5);
         PieceEnum piece= PieceEnum.KING;
        IPiece  iPiece=Piecesfactory.getPiece(piece,position,board);
        List<Position> possiblemoves = iPiece.getPossibleMoves();
        System.out.println(" Possible movements for "+piece.getPieceName()+" from position "+ position.toString() +" \n");
          for(Position  position1  :possiblemoves){
               System.out.print(position1.toString());
          }
    }


}
