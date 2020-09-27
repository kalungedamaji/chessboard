package com.chessboard.movesgenerator;

import com.chessboard.common.Position;

import java.util.List;

public interface IMovesGenerator {

    public List<Position> getPossibleMoves(Position position);
}
