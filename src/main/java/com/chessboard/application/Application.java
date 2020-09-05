package com.chessboard.application;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.movementstrategy.KingMovementStrategy;
import com.chessboard.movesvalidator.BoundaryValidator;
import com.chessboard.pices.King;

import java.util.List;

public class Application {
    public static void main() {
        Board board = new Board(8, 8);
        Position position = new Position(5, 5);
        BoundaryValidator  boundaryValidator=new BoundaryValidator(position,board);
        KingMovementStrategy kingMovementStrategy = new KingMovementStrategy(position, board, boundaryValidator);
        King king = new King(position, kingMovementStrategy);
        List<Position> possiblemoves = king.getPossibleMoves();
    }


}
