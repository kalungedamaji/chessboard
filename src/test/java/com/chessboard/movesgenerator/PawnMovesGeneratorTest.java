package com.chessboard.movesgenerator;

import com.chessboard.board.Board;
import com.chessboard.common.ChessUtil;
import com.chessboard.common.Position;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PawnMovesGeneratorTest {
    @Test
    public void getAllPossibleMovesTest() {
        Board board = new Board(8, 8);
        PawnMovesGenerator pawnMovesGenerator = new PawnMovesGenerator(board);
        Position position = new Position(4, 4);
        String expectedPosition = "D5";

        List<Position> actualPositionList = pawnMovesGenerator.getPossibleMoves(position);

        assertEquals(expectedPosition, ChessUtil.getPositionListAsString(actualPositionList));
    }


}