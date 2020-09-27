package com.chessboard.movesgenerator;

import com.chessboard.board.Board;
import com.chessboard.common.ChessUtil;
import com.chessboard.common.Position;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueenMovesGeneratorTest {

    @Test
    public void getAllPossibleMovesTest() {
        Board board = new Board(8, 8);
        QueenMovesGenerator queenMovesGenerator = new QueenMovesGenerator(board);
        Position position = new Position(4, 4);
        String expectedPosition = "D5, D6, D7, D8, E5, F6, G7, H8, E4, F4, G4, H4, E3, F2, G1, D3, D2, D1, C3, B2, A1, C4, B4, A4, C5, B6, A7";

        List<Position> actualPositionList = queenMovesGenerator.getPossibleMoves(position);

        assertEquals(expectedPosition, ChessUtil.getPositionListAsString(actualPositionList));
    }


}