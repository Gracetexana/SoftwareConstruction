package homework;
/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public abstract class Shape implements Figure{
    Position position;
    String fillColor;
    String lineColor;
    String type;

    public Shape(Position position, String fillColor, String lineColor){
        this.position = position;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
        this.type = "Shape";
    }

    public Position getPosition(){
        return position;
    }

    public String getFillColor(){
        return fillColor;
    }

    public String getLineColor(){
        return lineColor;
    }

    public String getType(){
        return type;
    }

    public void setPosition(Position newPosition){
        position = newPosition;
    }

    /**
     * moves the shape from current location to a location that is (dx, dy) away
     * @param dx the change in the x position
     * @param dy the change in the y position
     */
    public void move(double dx, double dy){
        position.setX(position.getX() + dx);
        position.setY(position.getY() + dy);
    }

    /**
     * returns d rounded to the nearest tenth
     * @param d the double to be formatted
     * @return d rounded to the nearest tenth
     */
    public double formatDouble(double d){
        d *= 10;
        d = Math.round(d);
        d /= 10.0;
        return d;
    }

    public String toString(){
        return getType() + "\n" 
            + position + "\n";
    }
}
