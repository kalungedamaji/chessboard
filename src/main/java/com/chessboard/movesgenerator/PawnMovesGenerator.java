package com.chessboard.movesgenerator;

import com.chessboard.board.Board;
import com.chessboard.common.Position;

import java.util.ArrayList;
import java.util.List;

public class PawnMovesGenerator  extends MovesGeneratorImpl{
    public PawnMovesGenerator(Board board) {
        super(board);
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {

        List<Position> possibleMovesList = new ArrayList();
         validateAndAddToList(possibleMovesList,getUpMoveFunction().nextMove(position));
        return possibleMovesList;
    }
}
