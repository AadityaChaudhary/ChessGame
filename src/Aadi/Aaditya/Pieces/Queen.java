package Aadi.Aaditya.Pieces;

import Aadi.Aaditya.utility.Position;

import java.util.ArrayList;

public class Queen extends Piece {
    @Override
    public boolean isMovePossible(int x, int y) {
        int diffX = x - this.pos.getX();
        int diffY = y - this.pos.getY();


        return (Math.abs(diffX) == 0 && Math.abs(diffY) != 0) || (Math.abs(diffX) != 0 && Math.abs(diffY) == 0) || (Math.abs(diffX) == Math.abs(diffY));
    }

    @Override
    public ArrayList<Position> getPath(int x, int y) {
        ArrayList<Position> positions = new ArrayList<Position>();

        int i = this.pos.getY();
        int j = this.pos.getX();

        while(i != y || j != x) {

            i = (i<y) ? i+1 :(i>y)? i-1: i;
            j = (j<x) ? j+1 : (j>x)? j-1: j;
            positions.add(new Position(j,i));
        }
        return positions;
    }
    public Queen(int x, int y, boolean white) {
        this.pos = new Position(x,y);
        this.isWhite = white;
        this.pointScore = 0; //TODO figure out actual pointscores
    }

    @Override
    public String toString() {
        return ((isWhite)? "W":"B") + "-Q";
    }
}
