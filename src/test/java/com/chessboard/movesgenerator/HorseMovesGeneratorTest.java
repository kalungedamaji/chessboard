package com.chessboard.movesgenerator;

import com.chessboard.board.Board;
import com.chessboard.common.ChessUtil;
import com.chessboard.common.Position;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HorseMovesGeneratorTest {

    @Test
    public void getAllPossibleMovesTest() {
        Board board = new Board(8, 8);
        HorseMovesGenerator horseMovesGenerator = new HorseMovesGenerator(board);
        Position position = new Position(5, 3);
        String expectedPosition = "F5, G4, G2, F1, D1, C2, C4, D5";

        List<Position> actualPositionList = horseMovesGenerator.getPossibleMoves(position);

        assertEquals(expectedPosition, ChessUtil.getPositionListAsString(actualPositionList));
    }

}