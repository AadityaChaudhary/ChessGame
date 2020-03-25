package Aadi.Aaditya.utility;

import Aadi.Aaditya.Pieces.*;

import java.util.ArrayList;

public class Board {

    Piece[][] board = new Piece[8][8];

    public Board() {
        board[0][0] = new Rook(0,0,true);
        board[0][1] = new Knight(1,0,true);
        board[0][2] = new Bishop(2,0,true);
        board[0][3] = new Queen(3,0,true);
        board[0][4] = new King(4,0,true);
        board[0][5] = new Bishop(5,0,true);
        board[0][6] = new Knight(6,0,true);
        board[0][7] = new Rook(7,0,true);

        for(int x = 0; x < 8; x++) board[1][x] = new Pawn(x,1,true);

        board[7][0] = new Rook(0,7,false);
        board[7][1] = new Knight(1,7,false);
        board[7][2] = new Bishop(2,7,false);
        board[7][3] = new Queen(3,7,false);
        board[7][4] = new King(4,7,false);
        board[7][5] = new Bishop(5,7,false);
        board[7][6] = new Knight(6,7,false);
        board[7][7] = new Rook(7,7,false);

        for(int x = 0; x < 8; x++) board[6][x] = new Pawn(x,6,false);

    }

    public boolean Move(int x, int y, int fX, int fY, boolean isWhite) {
        if(board[y][x] == null) {
            System.out.println("no piece on selected starting location");
            return false;
        }
        if(board[y][x].isWhite != isWhite) {
            System.out.println("you cant use that piece");
            return false;
        }


        Boolean attacking = false;

        if(board[fY][fX] != null && board[y][x].isWhite != board[fY][fX].isWhite) { //if true, moving
            if(board[y][x].isAttackPossible(fX,fY)) {
                attacking = true;
            } else {
                System.out.println("attack is not valid");
                return false;
            }
        } else { // attacking

            if(board[y][x].isMovePossible(fX,fY)) {
                attacking = false;
            } else {
                System.out.println("move is not valid");
                return false;
            }
        }

        ArrayList<Position> moves = board[y][x].getPath(fX,fY);

        for(Position p : moves) {
            if(board[p.getY()][p.getX()] != null) {
                if(p.getY() == fY && p.getX() == fX) {
                    break;
                }
                System.out.println("there is something on the path");
                return false;
            }
        }

        board[y][x].setNewPosition(fX,fY);
        board[fY][fX] = board[y][x];
        board[y][x] = null;
        return true;

    }

    public void displayBoard() {
        for(int y = 7; y >= 0; y--) {
            System.out.print("|");
            for(int x = 0; x < 8;x++) {
                if(board[y][x] != null) {
                    System.out.print(" "+board[y][x].toString()+" ");
                } else {
                    System.out.print("     ");
                }

                System.out.print("|");
            }
            System.out.println();
            System.out.println("-------------------------------------------------");
        }
    }


}
