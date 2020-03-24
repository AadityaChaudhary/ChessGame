package Aadi.Aaditya.Pieces;

import Aadi.Aaditya.utility.Position;

import java.util.ArrayList;

public class Rook extends Piece {
    @Override
    boolean isMovePossible(int x, int y) {
        int diffX = x - this.pos.getPosX();
        int diffY = y - this.pos.getPosY();


        return (Math.abs(diffX) == 0 && Math.abs(diffY) != 0) || (Math.abs(diffX) != 0 && Math.abs(diffY) == 0);
    }


    @Override
    //will crash if move is not possible
    ArrayList<Position> getPath(int x, int y) {
        ArrayList<Position> positions = new ArrayList<Position>();
        if(x != this.pos.getPosX()) {
            int i = this.pos.getPosX();

            while(i != x) {
                i = (i<x) ? i+1 : i-1;
                positions.add(new Position(i,y));
            }
            return positions;
        } else {
            int i = this.pos.getPosY();

            while(i != y) {
                i = (i<y) ? i+1 : i-1;
                positions.add(new Position(x,i));
            }
            return positions;
        }
    }

    public Rook(Position pos, boolean white) {
        this.pos = pos;
        this.isWhite = white;
        this.pointScore = 0; //TODO figure out actual pointscores
    }
}
