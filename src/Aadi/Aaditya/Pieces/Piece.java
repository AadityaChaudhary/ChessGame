package Aadi.Aaditya.Pieces;

import Aadi.Aaditya.utility.Position;

import java.util.ArrayList;

public abstract class Piece {

    int pointScore;

    public boolean isWhite;

    Position pos;

    abstract public boolean isMovePossible(int x, int y);

    public boolean  isAttackPossible(int x, int y) {
        return isMovePossible(x,y);
    }

    public void setNewPosition(int x, int y) {
        this.pos.setY(y);
        this.pos.setX(x);
    }

    abstract public ArrayList<Position> getPath(int x, int y);

    abstract public String toString();

}
