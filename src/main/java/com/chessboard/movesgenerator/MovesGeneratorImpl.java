package com.chessboard.movesgenerator;

import com.chessboard.board.Board;
import com.chessboard.common.MoveFunction;
import com.chessboard.common.Position;
import com.chessboard.validator.moves.boundary.BoundaryValidator;

import java.util.ArrayList;
import java.util.List;

public abstract class MovesGeneratorImpl implements IMovesGenerator {

    private Board board;
    private MoveFunction<Position> upMoveFunction = p -> new Position(p.getColumn() , p.getRow()+1);
    private MoveFunction<Position> downMoveFunction = p -> new Position(p.getColumn(), p.getRow()- 1);
    private MoveFunction<Position> rightMoveFunction = p -> new Position(p.getColumn() + 1, p.getRow());
    private MoveFunction<Position> leftMoveFunction = p -> new Position(p.getColumn() - 1, p.getRow());
    private MoveFunction<Position> northEastMoveFunction = p -> new Position(p.getColumn() + 1, p.getRow() + 1);
    private MoveFunction<Position> northWestMoveFunction = p -> new Position(p.getColumn() - 1, p.getRow() + 1);
    private MoveFunction<Position> southEastMoveFunction = p -> new Position(p.getColumn() + 1, p.getRow() - 1);
    private MoveFunction<Position> southWestMoveFunction = p -> new Position(p.getColumn() - 1, p.getRow() - 1);

    public MovesGeneratorImpl(Board board) {
        this.board = board;
    }

    public List<Position> getAllMovesTillBoundary(Position position, MoveFunction<Position> moveFunction) {
        List<Position> positionList = new ArrayList<>();
        Position nextPosition = moveFunction.nextMove(position);
        while (getBoundaryValidator().validateMove(nextPosition)) {
            positionList.add(nextPosition);
            nextPosition = moveFunction.nextMove(nextPosition);
        }

        return positionList;
    }


    public void validateAndAddToList(List positionList,Position nextPosition) {
        if (getBoundaryValidator().validateMove(nextPosition)) {
            positionList.add(nextPosition);
        }
    }


    public Board getBoard() {
        return board;
    }


    public BoundaryValidator getBoundaryValidator() {
        return getBoard().getBoundaryValidator();
    }

    public MoveFunction<Position> getUpMoveFunction() {
        return upMoveFunction;
    }

    public MoveFunction<Position> getDownMoveFunction() {
        return downMoveFunction;
    }

    public MoveFunction<Position> getRightMoveFunction() {
        return rightMoveFunction;
    }

    public MoveFunction<Position> getLeftMoveFunction() {
        return leftMoveFunction;
    }

    public MoveFunction<Position> getNorthEastMoveFunction() {
        return northEastMoveFunction;
    }

    public MoveFunction<Position> getNorthWestMoveFunction() {
        return northWestMoveFunction;
    }

    public MoveFunction<Position> getSouthEastMoveFunction() {
        return southEastMoveFunction;
    }

    public MoveFunction<Position> getSouthWestMoveFunction() {
        return southWestMoveFunction;
    }

}
