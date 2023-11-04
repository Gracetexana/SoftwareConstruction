package homework.geometry;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

import java.text.DecimalFormat;

public class Circle {
    private Point center;
    private double radius;
    private DecimalFormat decimalFormat;

    /**
     * create a circle with specified center and radius
     * decimalFormat is used to clean up values in display method
     * @param center a Point at the center of the circle
     * @param radius the radius of the circle
     */
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
        decimalFormat = new DecimalFormat("#.##");
    }

    /**
     * returns the perimeter of the circle calculated as 2*pi*r
     * @return the perimeter of the circle
     */
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    /**
     * returns the area of the circle calculated as pi*r^2
     * @return the area of the circle
     */
    public double area(){
        return Math.PI * radius * radius;
    }

    /**
     * tests whether a specified point is within the circle by calculating whether the distance between the point and the center of the circle is less than the radius of the circle or not
     * @param other the point to be checked for
     * @return true if the point falls within the circle, false if it does not
     */
    public boolean testAppartenance(Point other){
        double deltaX = other.getAbscissa() - center.getAbscissa();
        double deltaY = other.getOrdinate() - center.getOrdinate();

        double distanceFromCenter = 
            Math.sqrt( 
                Math.pow(deltaX, 2) + 
                Math.pow(deltaY, 2));

        return (distanceFromCenter <= radius);
    }

    /**
     * prints all information about the circle and a specified point
     * @param other the point to be checked for
     */
    public void display(Point other){
        System.out.print(
            "A circle with center (" + 
            center.getAbscissa() + ", " +
            center.getOrdinate() + 
            ") and radius " + radius + 
            " has a perimeter of " + 
            decimalFormat.format(perimeter()) +
            " and an area of " + decimalFormat.format(area()) + ".\n\nThe point (" + 
            other.getAbscissa() + 
            ", " + other.getOrdinate() + ") "
        );

        if (testAppartenance(other)){
            System.out.print("falls within the circle.");
        } else{
            System.out.print("does not fall within the circle.");
        }
    }
}
