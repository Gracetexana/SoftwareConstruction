package homework;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

/**
 * A rectangle shape.
 */
public class Rectangle extends Shape {
    /**
     * The width of the rectangle.
     */
    private double width;

    /**
     * The height of the rectangle.
     */
    private double height;


    /**
     * Creates a new rectangle.
     *
     * @param pos The position of the top left corner.
     * @param fillColor The fill color.
     * @param lineColor The outline color.
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public Rectangle(Position pos, String fillColor, String lineColor,
                     double width, double height) {
        super(pos, fillColor, lineColor, "rectangle");
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double newWidth) throws CustomException{
        if (newWidth < 0){
            throw new CustomException("Width cannot be negative!");
        } else{
            width = newWidth;
        }
    }

    public void setHeight(double newHeight) throws CustomException{
        if (newHeight < 0){
            throw new CustomException("Height cannot be negative!");
        } else{
            height = newHeight;
        }
    }

    /**
     * Computes and returns the area of the rectangle.
     *
     * @return Returns the area of the rectangle.
     */
    @Override
    public double area() {
        return width * height;
    }

    /**
     * Computes and returns the perimeter of the rectangle.
     *
     * @return Returns the perimeter of the rectangle.
     */
    @Override
    public double perimeter() {
        return width*2 + height*2;
    }

    @Override
    public String toString(){
        return super.toString() + " with height " + height + " and width " + width;
    }
}
