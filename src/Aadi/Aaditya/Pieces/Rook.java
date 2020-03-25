package Aadi.Aaditya.Pieces;

import Aadi.Aaditya.utility.Position;

import java.util.ArrayList;

public class Rook extends Piece {
    @Override
    public boolean isMovePossible(int x, int y) {
        int diffX = x - this.pos.getX();
        int diffY = y - this.pos.getY();


        return (Math.abs(diffX) == 0 && Math.abs(diffY) != 0) || (Math.abs(diffX) != 0 && Math.abs(diffY) == 0);
    }


    @Override
    //will crash if move is not possible
    public ArrayList<Position> getPath(int x, int y) {
        ArrayList<Position> positions = new ArrayList<Position>();
        if(x != this.pos.getX()) {
            int i = this.pos.getX();

            while(i != x) {
                i = (i<x) ? i+1 : i-1;
                positions.add(new Position(i,y));
            }
            return positions;
        } else {
            int i = this.pos.getY();

            while(i != y) {
                i = (i<y) ? i+1 : i-1;
                positions.add(new Position(x,i));
            }
            return positions;
        }
    }

    public Rook(int x, int y, boolean white) {
        this.pos = new Position(x,y);
        this.isWhite = white;
        this.pointScore = 0; //TODO figure out actual pointscores
    }

    @Override
    public String toString() {
        return ((isWhite)? "W":"B") + "-R";
    }
}
