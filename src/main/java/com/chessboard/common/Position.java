package com.chessboard.common;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getColumn() {
        return x;
    }

    public int getRow() {
        return y;
    }

    @Override
    public String toString() {
        char str=  (char)64;
        return ""+(char)(str+ getColumn())+""+ getRow();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (x != position.x) return false;
        return y == position.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
