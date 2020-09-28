package com.chessboard.movesgenerator;

import com.chessboard.board.Board;
import com.chessboard.common.ChessUtil;
import com.chessboard.common.Position;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class BishopMovesGenerator extends  MovesGeneratorImpl{

    private static Logger logger = LoggerFactory.getLogger(BishopMovesGenerator.class);


    public BishopMovesGenerator(Board board) {
        super(board);
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        logger.debug("getPossibleMoves method called with argument "+ position.toString());

        List<Position> possibleMovesList = new ArrayList();
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getNorthEastMoveFunction()));
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getSouthEastMoveFunction()));
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getSouthWestMoveFunction()));
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getNorthWestMoveFunction()));

        logger.debug("getPossibleMoves returns the possible moves "+ ChessUtil.getPositionListAsString(possibleMovesList));
        return possibleMovesList;
    }
}
