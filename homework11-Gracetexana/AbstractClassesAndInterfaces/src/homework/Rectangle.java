package homework;
/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class Rectangle extends Shape{
    double height;
    double width;

    public Rectangle(Position position, String fillColor, String lineColor, double height, double width) {
        super(position, fillColor, lineColor);
        //TODO Auto-generated constructor stub

        this.height = height;
        this.width = width;
        super.type = "Rectangle";
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        return height * width;
    }

    public double getPerimeter(){
        return 2 * (height + width);
    }

    public void setHeight(double newHeight){
        height = newHeight;
    }

    public void setWidth(double newWidth){
        width = newWidth;
    }

    /**
     * changes height and width such that area = factor x area AND height and width maintain their proportions to each other
     * @param factor the ratio of the new rectangle's area to the old rectangle's area
     */
    public void scale(double factor){
        width *= Math.sqrt(factor);
        height *= Math.sqrt(factor);
    }

    @Override
    public boolean equals(Object other){
        if (other instanceof Rectangle){
            Rectangle otherRec = (Rectangle) other;

            if (this.position.equals(otherRec.position) &&
            this.height == otherRec.height &&
            this.width == otherRec.width){
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString(){
        return super.toString() +
            "Height: " + formatDouble(height) + "\nWidth: " + formatDouble(width)  + "\nArea: " + formatDouble(getArea()) + "\nPerimeter: " + formatDouble(getPerimeter()) + "\n"; // I recognize it would be easier to just fixe Shape's toString to include area and perimeter, but the homework said to delete them so I am just doing this
    }
}
