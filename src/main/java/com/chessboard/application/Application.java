package com.chessboard.application;

import com.chessboard.board.Board;
import com.chessboard.common.ChessUtil;
import com.chessboard.common.PieceEnum;
import com.chessboard.common.Position;
import com.chessboard.pieces.IPiece;
import com.chessboard.piecesfactory.PieceFactory;
import com.chessboard.strategy.movement.KingMovementStrategy;

import java.util.List;
import java.util.Scanner;

public class Application {


    public static void main(String args[]) {


        String yesNo = "Y";

        while (yesNo.equalsIgnoreCase("Y")) {
            Board board = new Board(8, 8);


            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter chess piece and position ");

            String userName = myObj.nextLine();
            try {
                String[] pieceAndPosition = userName.trim().toUpperCase().split("\\s+");
                String pieceStr = pieceAndPosition[0];
                String positionStr = pieceAndPosition[1];

                int x = Integer.valueOf((char) (positionStr.charAt(0) - 64));
                int y = Integer.valueOf(positionStr.substring(1, 2));
                Position position = new Position(x, y);

                PieceEnum piece = PieceEnum.valueOf(pieceStr.trim());
                IPiece iPiece = PieceFactory.getPiece(piece, board);
                List<Position> possibleMoves = iPiece.getPossibleMoves(position);
                iPiece.setMovementStrategy(new KingMovementStrategy(board));
                System.out.println(" Possible movements for " + piece.getPieceName() + " from position " + position.toString() + " \n");
                System.out.print(ChessUtil.getPositionListAsString(possibleMoves));


                Scanner myObj1 = new Scanner(System.in);
                System.out.println(" \n \n Do you want to try another piece?  press Y/y to continue otherwise any  key to exit");
                yesNo = myObj1.nextLine();


            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                System.out.println(" \n \n  Please enter valid format for e.g. King D5 ");
            }


        }

    }


}
