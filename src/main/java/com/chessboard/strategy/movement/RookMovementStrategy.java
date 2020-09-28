package com.chessboard.strategy.movement;

import com.chessboard.board.Board;
import com.chessboard.common.ChessUtil;
import com.chessboard.common.Position;
import com.chessboard.movesgenerator.RookMovesGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class RookMovementStrategy extends MovementStrategy {
    private static Logger logger = LoggerFactory.getLogger(RookMovementStrategy.class);
    public RookMovementStrategy(Board board) {
        setMovesGenerator(new RookMovesGenerator(board));
    }
    public RookMovementStrategy(){
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        logger.debug("getPossibleMoves method called with argument "+ position.toString());
        List<Position> possiblePositionList=getMovesGenerator().getPossibleMoves(position);
        logger.debug("getPossibleMoves returns the possible moves "+ ChessUtil.getPositionListAsString(possiblePositionList));
        return possiblePositionList;
    }

}
