package homework;
/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class Triangle extends Shape{
    double sideLength;
    
    public Triangle(Position position, String fillColor, String lineColor, double sideLength) {
        super(position, fillColor, lineColor);
        //TODO Auto-generated constructor stub

        this.sideLength = sideLength;
        super.type = "Triangle";
    }

    public double getSideLength(){
        return sideLength;
    }

    public void setSideLength(double newSideLength){
        sideLength = newSideLength;
    }

    public double getArea(){
        return (Math.sqrt(3.0)/4) * sideLength * sideLength;
    }

    public double getPerimeter(){
        return 3 * sideLength;
    }

    /**
     * increases sideLength such that area = factor x area
     * @param factor the ratio of the new triangle's area to the old triangle's area
     */
    public void scale(double factor){
        sideLength *= Math.sqrt(factor);
    }

    @Override
    public boolean equals(Object other){
        if (other instanceof Triangle){
            Triangle otherTri = (Triangle) other;

            if (this.position.equals(otherTri.position) &&
            this.sideLength == otherTri.sideLength){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return super.toString() +
            "Side Length: " + formatDouble(sideLength)  + "\nArea: " + formatDouble(getArea()) + "\nPerimeter: " + formatDouble(getPerimeter()) + "\n"; // I recognize it would be easier to just fixe Shape's toString to include area and perimeter, but the homework said to delete them so I am just doing this
    }
}
