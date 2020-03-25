package Aadi.Aaditya.Pieces;

import Aadi.Aaditya.utility.Position;

import java.util.ArrayList;

public class Knight extends Piece {
    @Override
    public boolean isMovePossible(int x, int y) {
        int diffX = x - this.pos.getX();
        int diffY = y - this.pos.getY();

        return (Math.abs(diffX) == 2 && Math.abs(diffY) == 1) || (Math.abs(diffX) == 1 && Math.abs(diffY) == 2);
    }

    @Override
    public ArrayList<Position> getPath(int x, int y) {
        ArrayList<Position> list = new ArrayList<Position>();
        list.add(new Position(x,y));
        return list;
    }

    public Knight(int x, int y, boolean white) {
        this.pos = new Position(x,y);
        this.isWhite = white;
        this.pointScore = 0; //TODO figure out actual pointscores
    }
    @Override
    public String toString() {
        return ((isWhite)? "W":"B") + "-H";
    }
}
