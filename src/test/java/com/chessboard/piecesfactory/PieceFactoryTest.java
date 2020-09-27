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
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceFactoryTest {
    private Board board = new Board(8, 8);

    @Test
    public void kingInstanceTest() {

        IPiece iPiece = PieceFactory.getPiece(PieceEnum.KING, board);
        assertTrue(iPiece instanceof King);
    }

    @Test
    public void queenInstanceTest() {

        IPiece iPiece = PieceFactory.getPiece(PieceEnum.QUEEN, board);
        assertTrue(iPiece instanceof Queen);
    }

    @Test
    public void bishopInstanceTest() {

        IPiece iPiece = PieceFactory.getPiece(PieceEnum.BISHOP, board);
        assertTrue(iPiece instanceof Bishop);
    }

    @Test
    public void rookInstanceTest() {

        IPiece iPiece = PieceFactory.getPiece(PieceEnum.ROOK, board);
        assertTrue(iPiece instanceof Rook);
    }


    @Test
    public void pawnInstanceTest() {

        IPiece iPiece = PieceFactory.getPiece(PieceEnum.PAWN, board);
        assertTrue(iPiece instanceof Pawn);
    }


    @Test
    public void horseInstanceTest() {

        IPiece iPiece = PieceFactory.getPiece(PieceEnum.HORSE, board);
        assertTrue(iPiece instanceof Horse);
    }


    @Test
    public void nullInstanceTest() {

        IPiece iPiece = PieceFactory.getPiece(null, board);
        assertTrue(iPiece == null);
    }

}