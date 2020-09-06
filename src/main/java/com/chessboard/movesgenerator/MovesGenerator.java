package com.chessboard.movesgenerator;

import com.chessboard.common.Position;

public abstract class MovesGenerator {

    public Position getNextVerticalUpMove(Position position) {
        return new Position(position.getX(), position.getY() + 1);
    }

    public Position getNextVerticalDownMove(Position position) {
        return new Position(position.getX(), position.getY() - 1);
    }

    public Position getNextHorizontalNextMove(Position position) {
        return new Position(position.getX() + 1, position.getY());
    }

    public Position getNextHorizontalBackMove(Position position) {
        return new Position(position.getX() - 1, position.getY());
    }

    public Position getNextDiagonalNorthEastMove(Position position) {
        return new Position(position.getX() + 1, position.getY() + 1);
    }

    public Position getNextDiagonalNorthWestkMove(Position position) {
        return new Position(position.getX() - 1, position.getY() + 1);
    }

    public Position getNextDiagonalSouthWestMove(Position position) {
        return new Position(position.getX() - 1, position.getY() - 1);
    }

    public Position getNextDiagonalSouthEastMove(Position position) {
        return new Position(position.getX() + 1, position.getY() - 1);
    }
}
