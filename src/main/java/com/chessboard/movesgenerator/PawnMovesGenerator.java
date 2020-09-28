package com.chessboard.movesgenerator;

import com.chessboard.board.Board;
import com.chessboard.common.ChessUtil;
import com.chessboard.common.Position;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class PawnMovesGenerator  extends MovesGeneratorImpl{

    private static Logger logger = LoggerFactory.getLogger(PawnMovesGenerator.class);

    public PawnMovesGenerator(Board board) {
        super(board);
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        logger.debug("getPossibleMoves method called with argument "+ position.toString());
        List<Position> possibleMovesList = new ArrayList();
         validateAndAddToList(possibleMovesList,getUpMoveFunction().nextMove(position));
        logger.debug("getPossibleMoves returns the possible moves "+ ChessUtil.getPositionListAsString(possibleMovesList));
        return possibleMovesList;
    }
}
