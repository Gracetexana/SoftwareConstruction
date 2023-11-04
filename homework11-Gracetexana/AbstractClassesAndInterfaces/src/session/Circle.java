package session;
/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class Circle extends Shape{
    double radius;

    public Circle(Position position, String fillColor, String lineColor, double radius) {
        super(position, fillColor, lineColor);
        //TODO Auto-generated constructor stub

        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    // @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    // @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }

    @Override
    public boolean equals(Object other){
        if (other instanceof Circle){
            Circle otherCirc = (Circle) other;

            if (this.position.equals(otherCirc.position) &&
            this.radius == otherCirc.radius){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "Circle" +
            "\n" + position +
            "\nRadius: " + radius + "\n";
    }
    
}
