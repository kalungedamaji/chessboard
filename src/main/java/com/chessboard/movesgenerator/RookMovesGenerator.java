package com.chessboard.movesgenerator;

import com.chessboard.board.Board;
import com.chessboard.common.ChessUtil;
import com.chessboard.common.Position;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class RookMovesGenerator extends MovesGeneratorImpl {
    private static Logger logger = LoggerFactory.getLogger(RookMovesGenerator.class);
    public RookMovesGenerator(Board board) {
        super(board);
    }

    public List<Position> getPossibleMoves(Position position) {
        logger.debug("getPossibleMoves method called with argument "+ position.toString());

        List<Position> possibleMovesList = new ArrayList<>();
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getUpMoveFunction()));
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getRightMoveFunction()));
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getDownMoveFunction()));
        possibleMovesList.addAll(getAllMovesTillBoundary(position, getLeftMoveFunction()));
        logger.debug("getPossibleMoves returns the possible moves "+ ChessUtil.getPositionListAsString(possibleMovesList));
        return possibleMovesList;
    }


}
