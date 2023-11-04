package homework.geometry;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class Point {
    private double abscissa;
    private double ordinate;

    /**
     * create a point with abscissa (x-value) and ordinate (y-value)
     * @param abscissa
     * @param ordinate
     */
    public Point(double abscissa, double ordinate){
        this.abscissa = abscissa;
        this.ordinate = ordinate;
    }

    /**
     * returns the x-value of the point
     * @return x-value of the point
     */
    public double getAbscissa(){
        return abscissa;
    }

    /**
     * returns y-value of the point
     * @return y-value of the point
     */
    public double getOrdinate(){
        return ordinate;
    }
}
