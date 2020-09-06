package com.chessboard.strategy.movement;

import com.chessboard.board.Board;
import com.chessboard.common.Position;
import com.chessboard.movesgenerator.KingMovesGenerator;
import com.chessboard.validator.moves.MovesValidator;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class KingMovementStrategy extends MovementStrategy {
    public KingMovementStrategy(Position position, Board board, MovesValidator movesValidator) {
        super(position, board, movesValidator);
    }

    public List<Position> getPossibleMoves() {
        KingMovesGenerator kingMovesGenerator = new KingMovesGenerator();
        List<Position> listOfPossiblePosition = kingMovesGenerator.getPossibleMoves(getPosition())
                .stream()
                .filter(nextPosition -> getMovesValidator().validateMove(nextPosition))
                .collect(toList());

        return listOfPossiblePosition;
    }
}
