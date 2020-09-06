package com.chessboard.piecesfactory;

import com.chessboard.board.Board;
import com.chessboard.common.PieceEnum;
import com.chessboard.common.Position;
import com.chessboard.strategy.movement.KingMovementStrategy;
import com.chessboard.validator.moves.boundary.BoundaryValidator;
import com.chessboard.pieces.IPiece;
import com.chessboard.pieces.King;

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

