package com.chessboard.movesgenerator;

import com.chessboard.board.Board;
import com.chessboard.common.Position;

import java.util.ArrayList;
import java.util.List;

public class BishopMovesGenerator extends  MovesGeneratorImpl{
    public BishopMovesGenerator(Board board) {
        super(board);
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        List<Position> possibleMovesList = new ArrayList<>();
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getNorthEastMoveFunction()));
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getSouthEastMoveFunction()));
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getSouthWestMoveFunction()));
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getNorthWestMoveFunction()));

        return possibleMovesList;
    }
}
