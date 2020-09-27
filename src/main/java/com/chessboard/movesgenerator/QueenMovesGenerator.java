package com.chessboard.movesgenerator;

import com.chessboard.board.Board;
import com.chessboard.common.Position;

import java.util.ArrayList;
import java.util.List;

public class QueenMovesGenerator extends MovesGeneratorImpl {

    public QueenMovesGenerator(Board board) {
        super(board);
    }

    public List<Position> getPossibleMoves(Position position) {
        List<Position> possibleMovesList = new ArrayList<>();
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getUpMoveFunction()));
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getNorthEastMoveFunction()));
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getRightMoveFunction()));
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getSouthEastMoveFunction()));
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getDownMoveFunction()));
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getSouthWestMoveFunction()));
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getLeftMoveFunction()));
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getNorthWestMoveFunction()));
        return possibleMovesList;

    }
}
