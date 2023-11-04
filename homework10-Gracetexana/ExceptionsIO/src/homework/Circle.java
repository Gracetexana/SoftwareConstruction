package homework;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

/**
 * A circle shape.
 */
public class Circle extends Shape {
    /**
     * The radius of the circle.
     */
    private double radius;

    /**
     * Creates a new circle.
     *
     * @param pos The position of the top left corner.
     * @param fillColor The fill color.
     * @param lineColor The outline color.
     * @param radius The radius of the circle.
     */
    public Circle(Position pos, String fillColor, String lineColor,
                  double radius) {
        super(pos, fillColor, lineColor, "circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws CustomException{
        if (newRadius < 0){
            throw new CustomException("Radius cannot be negative!");
        } else{
            radius = newRadius;
        }
    }

    /**
     * Computes and returns the area of the circle.
     *
     * @return Returns the area of the circle.
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    /**
     * Computes and returns the perimeter of the circle.
     *
     * @return Returns the perimeter of the circle.
     */
    @Override
    public double perimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString(){
        return super.toString() + " with radius " + radius;
    }
}
