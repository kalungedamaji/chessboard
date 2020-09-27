package com.chessboard.movesgenerator;

import com.chessboard.board.Board;
import com.chessboard.common.MoveFunction;
import com.chessboard.common.Position;
import com.chessboard.common.MoveTwiceFunction;

import java.util.ArrayList;
import java.util.List;

public class HorseMovesGenerator extends MovesGeneratorImpl {
    private static MoveTwiceFunction<MoveFunction<Position>, Position> moveTwiceFunction = (position, moveFunction) ->
            moveFunction.nextMove(moveFunction.nextMove(position));

    public HorseMovesGenerator(Board board) {
        super(board);
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        List<Position> possibleMovesList = new ArrayList<>();

        Position twoUpPosition = moveTwiceFunction.move(position, getUpMoveFunction());
        validateAndAddToList(possibleMovesList, getRightMoveFunction().nextMove(twoUpPosition));

        Position twoRightPosition = moveTwiceFunction.move(position,getRightMoveFunction());
        validateAndAddToList(possibleMovesList, getUpMoveFunction().nextMove(twoRightPosition));
        validateAndAddToList(possibleMovesList, getDownMoveFunction().nextMove(twoRightPosition));

        Position twoDownPosition = moveTwiceFunction.move(position, getDownMoveFunction());
        validateAndAddToList(possibleMovesList, getRightMoveFunction().nextMove(twoDownPosition));
        validateAndAddToList(possibleMovesList, getLeftMoveFunction().nextMove(twoDownPosition));

        Position twoLeftPosition = moveTwiceFunction.move(position, getLeftMoveFunction());
        validateAndAddToList(possibleMovesList, getDownMoveFunction().nextMove(twoLeftPosition));
        validateAndAddToList(possibleMovesList, getUpMoveFunction().nextMove(twoLeftPosition));
        validateAndAddToList(possibleMovesList, getLeftMoveFunction().nextMove(twoUpPosition));

        return possibleMovesList;
    }
}
