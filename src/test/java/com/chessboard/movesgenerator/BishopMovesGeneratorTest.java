package com.chessboard.movesgenerator;

import com.chessboard.board.Board;
import com.chessboard.common.ChessUtil;
import com.chessboard.common.Position;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BishopMovesGeneratorTest {


    @Test
    public void getAllPossibleMovesTest() {
        Board board = new Board(8, 8);
        BishopMovesGenerator bishopMovesGenerator = new BishopMovesGenerator(board);
        Position position = new Position(4, 4);
        String expectedPosition = "E5, F6, G7, H8, E3, F2, G1, C3, B2, A1, C5, B6, A7";
        List<Position> actualPositionList = bishopMovesGenerator.getPossibleMoves(position);

        assertEquals(expectedPosition, ChessUtil.getPositionListAsString(actualPositionList));
    }

}