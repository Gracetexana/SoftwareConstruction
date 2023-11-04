package homework;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

/**
 * An x,y coordinate.
 */
public class Position {
    /**
     * The x coordinate.
     */
    private int x;

    /**
     * The y coordinate.
     */
    private int y;

    /**
     * Creates a new position.
     *
     * @param x The x coordinate of the new position.
     * @param y The y coordinate of the new position.
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
