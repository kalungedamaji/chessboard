package com.chessboard.movementstrategy;

import com.chessboard.common.Position;

import java.util.List;

public interface ImovementStrategy {
    public List<Position> getPossibleMoves();

}
