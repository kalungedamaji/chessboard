package com.chessboard.movesgenerator;

import com.chessboard.common.Position;

import java.util.ArrayList;
import java.util.List;

public class KingMovesGenerator extends MovesGenerator {


    public List<Position> getPossibleMoves(Position position) {
        List<Position> positionList = new ArrayList();

        positionList.add(getNextVerticalUpMove(position));
        positionList.add(getNextVerticalDownMove(position));
        positionList.add(getNextHorizontalNextMove(position));
        positionList.add(getNextHorizontalBackMove(position));

        positionList.add(getNextDiagonalNorthEastMove(position));
        positionList.add(getNextDiagonalNorthWestkMove(position));
        positionList.add(getNextDiagonalSouthEastMove(position));
        positionList.add(getNextDiagonalSouthWestMove(position));

        return positionList;
    }
}
