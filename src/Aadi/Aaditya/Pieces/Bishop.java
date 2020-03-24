package Aadi.Aaditya.Pieces;

import Aadi.Aaditya.utility.Position;

import java.util.ArrayList;

public class Bishop extends Piece {

    @Override
    boolean isMovePossible(int x, int y) {
        int diffX = x - this.pos.getPosX();
        int diffY = y - this.pos.getPosY();

        return Math.abs(diffX) == Math.abs(diffY);
    }

    @Override
    ArrayList<Position> getPath(int x, int y) {
        ArrayList<Position> positions = new ArrayList<Position>();

        int i = this.pos.getPosY();
        int j = this.pos.getPosX();

        while(i != y || j != x) {
            i = (i<y) ? i+1 : i-1;
            j = (j<x) ? j+1 : j-1;
            positions.add(new Position(j,i));
        }
        return positions;
    }

    public Bishop(Position pos, boolean white) {
        this.pos = pos;
        this.isWhite = white;
        this.pointScore = 0; //TODO figure out actual pointscores
    }
}
