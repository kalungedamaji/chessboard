package com.chessboard.pieces;

import com.chessboard.board.Board;
import com.chessboard.common.ChessUtil;
import com.chessboard.common.Position;
import com.chessboard.strategy.movement.HorseMovesStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Horse extends  Piece {
    private static Logger logger = LoggerFactory.getLogger(Horse.class);
    public Horse(Board board) {
        setMovementStrategy(new HorseMovesStrategy(board));
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        logger.debug("getPossibleMoves method called with argument "+ position.toString());
        List<Position> possiblePositionList =getMovementStrategy().getPossibleMoves(position);
        logger.debug("getPossibleMoves returns the possible moves "+ ChessUtil.getPositionListAsString(possiblePositionList));
        return  possiblePositionList;
    }

}

