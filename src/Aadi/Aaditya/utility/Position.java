package Aadi.Aaditya.utility;

public class Position {
    private int posX;
    private int posY;

    public Position(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    public int getX() {
        return posX;
    }

    public int getY() {
        return posY;
    }

    public void setX(int posX) {
        this.posX = posX;
    }

    public void setY(int posY) {
        this.posY = posY;
    }
}
