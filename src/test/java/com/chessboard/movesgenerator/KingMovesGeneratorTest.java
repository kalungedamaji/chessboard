package com.chessboard.movesgenerator;

import com.chessboard.board.Board;
import com.chessboard.common.ChessUtil;
import com.chessboard.common.Position;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KingMovesGeneratorTest {

    @Test
    public void getAllPossibleMovesTest() {
        Board board = new Board(8, 8);
        KingMovesGenerator kingMovesGenerator = new KingMovesGenerator(board);
        Position position = new Position(4, 5);
        String expectedPosition = "D6, E6, E5, E4, D4, C4, C5, C6";

        List<Position> actualPositionList = kingMovesGenerator.getPossibleMoves(position);

        assertEquals(expectedPosition, ChessUtil.getPositionListAsString(actualPositionList));
    }

}