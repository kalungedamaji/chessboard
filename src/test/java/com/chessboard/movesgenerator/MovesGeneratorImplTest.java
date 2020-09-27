package com.chessboard.movesgenerator;

import com.chessboard.board.Board;
import com.chessboard.common.ChessUtil;
import com.chessboard.common.Position;
import com.chessboard.validator.moves.boundary.BoundaryValidator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MovesGeneratorImplTest {

    private static MovesGeneratorImpl movesGenerator;

    @BeforeAll
    public static void beforeEachTestCase() {

        Board board = new Board(8, 8);

        movesGenerator = new MovesGeneratorImpl(board) {
            @Override
            public List<Position> getPossibleMoves(Position position) {
                return null;
            }

            @Override
            public BoundaryValidator getBoundaryValidator() {
                return board.getBoundaryValidator();
            }
        };
    }

    @Test
    public void upMoveTest() {
        Position position = new Position(5, 5);
        Position expectedUpPosition = new Position(5, 6);

        Position actualUpPosition = movesGenerator.getUpMoveFunction().nextMove(position);

        assertEquals(expectedUpPosition, actualUpPosition);

    }

    @Test
    public void downMoveTest() {
        Position position = new Position(5, 5);
        Position expectedDownPosition = new Position(5, 4);

        Position actualDownPosition = movesGenerator.getDownMoveFunction().nextMove(position);

        assertEquals(expectedDownPosition, actualDownPosition);

    }

    @Test
    public void leftMoveTest() {
        Position position = new Position(5, 5);
        Position expectedLeftPosition = new Position(4, 5);

        Position actualLeftPosition = movesGenerator.getLeftMoveFunction().nextMove(position);

        assertEquals(expectedLeftPosition, actualLeftPosition);

    }

    @Test
    public void rightMoveTest() {
        Position position = new Position(5, 5);
        Position expectedRightPosition = new Position(6, 5);

        Position actualRightPosition = movesGenerator.getRightMoveFunction().nextMove(position);

        assertEquals(expectedRightPosition, actualRightPosition);

    }


    @Test
    public void northEastMoveTest() {
        Position position = new Position(5, 5);
        Position expectedNorthEastPosition = new Position(6, 6);

        Position actualNorthEastPosition = movesGenerator.getNorthEastMoveFunction().nextMove(position);

        assertEquals(expectedNorthEastPosition, actualNorthEastPosition);

    }


    @Test
    public void northWestMoveTest() {
        Position position = new Position(5, 5);
        Position expectedNorthWestPosition = new Position(4, 6);

        Position actualNorthWestPosition = movesGenerator.getNorthWestMoveFunction().nextMove(position);

        assertEquals(expectedNorthWestPosition, actualNorthWestPosition);

    }

    @Test
    public void southEastMoveTest() {
        Position position = new Position(5, 5);
        Position expectedSouthEastPosition = new Position(6, 4);

        Position actualSouthEastPosition = movesGenerator.getSouthEastMoveFunction().nextMove(position);

        assertEquals(expectedSouthEastPosition, actualSouthEastPosition);

    }


    @Test
    public void southWestMoveTest() {
        Position position = new Position(5, 5);
        Position expectedSouthWestPosition = new Position(4, 4);

        Position actualSouthWestPosition = movesGenerator.getSouthWestMoveFunction().nextMove(position);

        assertEquals(expectedSouthWestPosition, actualSouthWestPosition);

    }

    @Test
    public void validPositionAddToListTest() {
        List<Position> positionList = new ArrayList();
        Position expectedPosition = new Position(5, 5);

        movesGenerator.validateAndAddToList(positionList, expectedPosition);
        Position actualPosition = positionList.get(0);

        assertEquals(expectedPosition, actualPosition);

    }


    @Test
    public void InValidPositionAddToListTest() {
        List<Position> positionList = new ArrayList();
        Position expectedPosition = new Position(9, 5);

        movesGenerator.validateAndAddToList(positionList, expectedPosition);

        assertTrue(positionList.isEmpty());

    }

    @Test
    public void getAllMovesTillBoundaryForHorizontalRightTest() {
        Position position = new Position(5, 4);
        String expectedPosition = "F4, G4, H4";

        List<Position> actualPossiblePositionList = movesGenerator.getAllMovesTillBoundary(position, movesGenerator.getRightMoveFunction());

        assertEquals(expectedPosition, ChessUtil.getPositionListAsString(actualPossiblePositionList));
    }

    @Test
    public void getAllMovesTillBoundaryForNorthEastTest() {
        Position position = new Position(4, 4);
        String expectedPosition = "E5, F6, G7, H8";

        List<Position> actualPossiblePositionList = movesGenerator.getAllMovesTillBoundary(position, movesGenerator.getNorthEastMoveFunction());

        assertEquals(expectedPosition, ChessUtil.getPositionListAsString(actualPossiblePositionList));
    }


}