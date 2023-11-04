package activities.session09;

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class Shape {
    Position position;
    String fillColor;
    String lineColor;

    public Shape(Position position, String fillColor, String lineColor){
        this.position = position;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
    }

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
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

    public String toString(){
        return "Shape" +
            "\n" + position + "\n";
    }
}
