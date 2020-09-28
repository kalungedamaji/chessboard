package com.chessboard.strategy.movement;

import com.chessboard.board.Board;
import com.chessboard.common.ChessUtil;
import com.chessboard.common.Position;
import com.chessboard.movesgenerator.KingMovesGenerator;
import com.chessboard.movesgenerator.MovesGeneratorImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class KingMovementStrategy extends MovementStrategy {
    private static Logger logger = LoggerFactory.getLogger(KingMovementStrategy.class);

    public KingMovementStrategy(Board board) {
        setMovesGenerator(new KingMovesGenerator(board));
    }

    public  KingMovementStrategy(){

    }

    public List<Position> getPossibleMoves(Position position) {
        logger.debug("getPossibleMoves method called with argument "+ position.toString());
        List<Position> possiblePositionList=getMovesGenerator().getPossibleMoves(position);
        logger.debug("getPossibleMoves returns the possible moves "+ ChessUtil.getPositionListAsString(possiblePositionList));
        return possiblePositionList;
    }


}
