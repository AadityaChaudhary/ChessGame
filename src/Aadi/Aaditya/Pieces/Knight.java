package Aadi.Aaditya.Pieces;

import Aadi.Aaditya.utility.Position;

import java.util.ArrayList;

public class Knight extends Piece {
    @Override
    boolean isMovePossible(int x, int y) {
        int diffX = x - this.pos.getPosX();
        int diffY = y - this.pos.getPosY();

        return (Math.abs(diffX) == 2 && Math.abs(diffY) == 1) || (Math.abs(diffX) == 1 && Math.abs(diffY) == 2);
    }

    @Override
    ArrayList<Position> getPath(int x, int y) {
        ArrayList<Position> list = new ArrayList<Position>();
        list.add(new Position(x,y));
        return list;
    }

    public Knight(Position pos, boolean white) {
        this.pos = pos;
        this.isWhite = white;
        this.pointScore = 0; //TODO figure out actual pointscores
    }
}
