package session;
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
    }

    public double getSideLength(){
        return sideLength;
    }

    public void setSideLength(double newSideLength){
        sideLength = newSideLength;
    }

    // @Override
    public double getArea(){
        return (Math.sqrt(3.0)/4) * sideLength * sideLength;
    }

    // @Override
    public double getPerimeter(){
        return 3 * sideLength;
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
        return "Triangle" +
            "\n" + position +
            "\nSide Length: " + sideLength + "\n";
    }
}
