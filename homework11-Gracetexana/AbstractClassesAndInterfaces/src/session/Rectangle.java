package session;
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
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    // @Override
    public double getArea(){
        return height * width;
    }

    // @Override
    public double getPerimeter(){
        return 2 * (height + width);
    }

    public void setHeight(double newHeight){
        height = newHeight;
    }

    public void setWidth(double newWidth){
        width = newWidth;
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
        return "Rectangle" +
            "\n" + position +
            "\nHeight: " + height +
            "\nWidth: " + width + "\n";
    }
}
