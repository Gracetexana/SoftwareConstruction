package session;
/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class Position {
    double x;
    double y;

    public Position(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double newX){
        x = newX;
    }

    public void setY(double newY){
        y = newY;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    @Override
    public boolean equals(Object other){
        if (other instanceof Position){
            Position otherPosition = (Position) other;

            if (this.x == otherPosition.x &&
                this.y == otherPosition.y){
                    return true;
            }
        }

        return false;
    }

    @Override
    public String toString(){
        return "Position: (" + x + ", " + y + ")";
    }
}
