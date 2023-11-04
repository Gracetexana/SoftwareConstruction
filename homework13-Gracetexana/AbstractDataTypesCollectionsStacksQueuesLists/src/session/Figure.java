/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package session;
/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

public interface Figure {
    Position getPosition();
    void setPosition(Position position);
    String getFillColor();
    String getLineColor();
    double getArea();
    double getPerimeter();
    void scale(double factor);
}
