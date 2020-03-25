package Aadi.Aaditya.Pieces;

import Aadi.Aaditya.utility.Position;

import java.util.ArrayList;

public class Pawn extends Piece {
    @Override
    public boolean isMovePossible(int x, int y) {
        if(this.isWhite) {
            int diffX = x - this.pos.getX();
            int diffY = y - this.pos.getY();

            return Math.abs(diffX) == 0 && diffY == 1;

        } else {
            int diffX = x - this.pos.getX();
            int diffY = y - this.pos.getY();

            return Math.abs(diffX) == 0 && diffY == -1;
        }
    }

    @Override
    public boolean isAttackPossible(int x, int y) {
        if(this.isWhite) {
            int diffX = x - this.pos.getX();
            int diffY = y - this.pos.getY();

            return Math.abs(diffX) == 1 && diffY == 1;

        } else {
            int diffX = x - this.pos.getX();
            int diffY = y - this.pos.getY();

            return Math.abs(diffX) == 1 && diffY == -1;
        }
    }

    //literally just returns the given target, as pawns only move one piece at a time anyway
    //make sure to
    @Override
    public ArrayList<Position> getPath(int x, int y) {
        ArrayList<Position> list = new ArrayList<Position>();
        list.add(new Position(x,y));
        return list;
    }

    public Pawn(int x, int y, boolean white) {
        this.pos = new Position(x,y);
        this.isWhite = white;
        this.pointScore = 0; //TODO figure out actual pointscores
    }
    @Override
    public String toString() {
        return ((isWhite)? "W":"B") + "-P";
    }
}
