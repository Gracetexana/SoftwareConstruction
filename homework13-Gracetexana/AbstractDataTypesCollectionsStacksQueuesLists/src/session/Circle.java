/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

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
        super.type = "Circle";
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }

    /**
     * changes radius such that area = factor x area
     * @param factor the ratio of the old circle's area to the new circle's area
     */
    public void scale(double factor){
        radius *= Math.sqrt(factor);
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
        return super.toString() +
            "Radius: " + formatDouble(radius)  + "\nArea: " + formatDouble(getArea()) + "\nPerimeter: " + formatDouble(getPerimeter()) + "\n"; // I recognize it would be easier to just fixe Shape's toString to include area and perimeter, but the homework said to delete them so I am just doing this
    }
    
}
