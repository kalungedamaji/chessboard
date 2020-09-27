package com.chessboard.movesgenerator;

import com.chessboard.board.Board;
import com.chessboard.common.Position;

import java.util.ArrayList;
import java.util.List;

public class KingMovesGenerator extends MovesGeneratorImpl {

    public KingMovesGenerator(Board board) {
        super(board);
    }

    public List<Position> getPossibleMoves(Position position) {
        List<Position> possibleMovesList = new ArrayList();

        validateAndAddToList(possibleMovesList, getUpMoveFunction().nextMove(position));
        validateAndAddToList(possibleMovesList,  getNorthEastMoveFunction().nextMove(position));
        validateAndAddToList(possibleMovesList, getRightMoveFunction().nextMove(position));
        validateAndAddToList(possibleMovesList,  getSouthEastMoveFunction().nextMove(position));
        validateAndAddToList(possibleMovesList, getDownMoveFunction().nextMove(position));
        validateAndAddToList(possibleMovesList,  getSouthWestMoveFunction().nextMove(position));
        validateAndAddToList(possibleMovesList, getLeftMoveFunction().nextMove(position));
        validateAndAddToList(possibleMovesList,  getNorthWestMoveFunction().nextMove(position));


        return possibleMovesList;
    }


}
