package com.chessboard.movesgenerator;

import com.chessboard.board.Board;
import com.chessboard.common.ChessUtil;
import com.chessboard.common.Position;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class KingMovesGenerator extends MovesGeneratorImpl {


    private static Logger logger = LoggerFactory.getLogger(KingMovesGenerator.class);
    public KingMovesGenerator(Board board) {
        super(board);
    }

    public List<Position> getPossibleMoves(Position position) {
        logger.debug("getPossibleMoves method called with argument "+ position.toString());
        List<Position> possibleMovesList = new ArrayList();

        validateAndAddToList(possibleMovesList, getUpMoveFunction().nextMove(position));
        validateAndAddToList(possibleMovesList,  getNorthEastMoveFunction().nextMove(position));
        validateAndAddToList(possibleMovesList, getRightMoveFunction().nextMove(position));
        validateAndAddToList(possibleMovesList,  getSouthEastMoveFunction().nextMove(position));
        validateAndAddToList(possibleMovesList, getDownMoveFunction().nextMove(position));
        validateAndAddToList(possibleMovesList,  getSouthWestMoveFunction().nextMove(position));
        validateAndAddToList(possibleMovesList, getLeftMoveFunction().nextMove(position));
        validateAndAddToList(possibleMovesList,  getNorthWestMoveFunction().nextMove(position));

        logger.debug("getPossibleMoves returns the possible moves "+ ChessUtil.getPositionListAsString(possibleMovesList));
        return possibleMovesList;
    }


}
