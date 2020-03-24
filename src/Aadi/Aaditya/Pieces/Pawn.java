package Aadi.Aaditya.Pieces;

import Aadi.Aaditya.utility.Position;

import java.util.ArrayList;

public class Pawn extends Piece {
    @Override
    boolean isMovePossible(int x, int y) {
        if(this.isWhite) {
            int diffX = x - this.pos.getPosX();
            int diffY = y - this.pos.getPosY();

            return Math.abs(diffX) == 0 && diffY == 1;

        } else {
            int diffX = x - this.pos.getPosX();
            int diffY = y - this.pos.getPosY();

            return Math.abs(diffX) == 0 && diffY == -1;
        }
    }

    @Override
    boolean isAttackPossible(int x, int y) {
        if(this.isWhite) {
            int diffX = x - this.pos.getPosX();
            int diffY = y - this.pos.getPosY();

            return Math.abs(diffX) == 1 && diffY == 1;

        } else {
            int diffX = x - this.pos.getPosX();
            int diffY = y - this.pos.getPosY();

            return Math.abs(diffX) == 1 && diffY == -1;
        }
    }

    //literally just returns the given target, as pawns only move one piece at a time anyway
    //make sure to
    @Override
    ArrayList<Position> getPath(int x, int y) {
        ArrayList<Position> list = new ArrayList<Position>();
        list.add(new Position(x,y));
        return list;
    }

    public Pawn(Position pos, boolean white) {
        this.pos = pos;
        this.isWhite = white;
        this.pointScore = 0; //TODO figure out actual pointscores
    }
}
