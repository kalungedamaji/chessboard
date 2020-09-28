package com.chessboard.pieces;

import com.chessboard.board.Board;
import com.chessboard.common.ChessUtil;
import com.chessboard.common.Position;
import com.chessboard.strategy.movement.RookMovementStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Rook extends Piece {
    private static Logger logger = LoggerFactory.getLogger(Rook.class);
    public Rook(Board board) {
        setMovementStrategy( new RookMovementStrategy(board));
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        logger.debug("getPossibleMoves method called with argument "+ position.toString());
        List<Position> possiblePositionList =getMovementStrategy().getPossibleMoves(position);
        logger.debug("getPossibleMoves returns the possible moves "+ ChessUtil.getPositionListAsString(possiblePositionList));
        return  possiblePositionList;
    }

}
