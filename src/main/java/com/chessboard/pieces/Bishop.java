package com.chessboard.pieces;

import com.chessboard.board.Board;
import com.chessboard.common.ChessUtil;
import com.chessboard.common.Position;
import com.chessboard.strategy.movement.BishopMovementStrategy;
import com.chessboard.strategy.movement.IMovementStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Bishop extends  Piece {

    private static Logger logger = LoggerFactory.getLogger(Bishop.class);
    private IMovementStrategy movementStrategy;
    public Bishop(Board board) {
        setMovementStrategy(new BishopMovementStrategy(board));
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        logger.debug("getPossibleMoves method called with argument "+ position.toString());
        List<Position> possiblePositionList =getMovementStrategy().getPossibleMoves(position);
        logger.debug("getPossibleMoves returns the possible moves "+ ChessUtil.getPositionListAsString(possiblePositionList));
        return  possiblePositionList;
    }


}
