package com.chessboard.common;

import java.util.List;
import java.util.stream.Collectors;

public class ChessUtil {

    public static String getPositionListAsString(List<Position> positionList) {
        return positionList.stream()
                           .map(position -> position.toString())
                           .collect(Collectors.joining(", "));
    }
}
