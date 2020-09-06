package com.chessboard.piecesfactory;

import com.chessboard.board.Board;
import com.chessboard.common.PieceEnum;
import com.chessboard.common.Position;
import com.chessboard.movementstrategy.KingMovementStrategy;
import com.chessboard.movesvalidator.BoundaryValidator;
import com.chessboard.pices.IPiece;
import com.chessboard.pices.King;

public class Piecesfactory {

    private Piecesfactory(){

    }

    public static IPiece getPiece(Enum pieceEnum, Position position, Board board) {
        if (PieceEnum.KING == pieceEnum) {
            BoundaryValidator boundaryValidator = new BoundaryValidator(position, board);
            KingMovementStrategy kingMovementStrategy = new KingMovementStrategy(position, board, boundaryValidator);
            King king = new King(position, kingMovementStrategy);
            return king;
        }
        return null;
    }
}

