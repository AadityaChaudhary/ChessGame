package Aadi.Aaditya.Pieces;

import Aadi.Aaditya.utility.Position;

import java.util.ArrayList;

public abstract class Piece {

    int pointScore;

    boolean isWhite;

    Position pos;

    abstract boolean isMovePossible(int x, int y);

    boolean isAttackPossible(int x, int y) {
        return isMovePossible(x,y);
    }

    void setNewPosition(int x, int y) {
        this.pos.setPosY(y);
        this.pos.setPosX(x);
    }

    abstract ArrayList<Position> getPath(int x, int y);


}
