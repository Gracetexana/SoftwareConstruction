package homework;
/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class ShapeMover {
    
    public static void main(String[] args){

        Rectangle rectangle = new Rectangle(new Position(2.555, 3), "red", "orange", 1, 2);
        System.out.println(rectangle);
        moveShape(rectangle, new Position(9, 0));
        scaleFigure(rectangle, 3);
        System.out.println(rectangle);

        Circle circle = new Circle(new Position(5, 10), "blue", "green", 3);
        System.out.println(circle);
        moveShape(circle, new Position(0, 10));
        scaleFigure(circle, 0.5);
        System.out.println(circle);

        Triangle triangle = new Triangle(new Position(3, 7), "black", "grey", 7);
        System.out.println(triangle);
        moveShape(triangle, new Position(5, 5));
        scaleFigure(triangle, 2);
        System.out.println(triangle);
    }
    
    public static void moveShape(Figure figure, Position position){
        figure.setPosition(position);
    }

    public static void scaleFigure(Figure figure, double factor){
        figure.scale(factor);
    }
}
