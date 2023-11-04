package activities.session09;

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class ShapeMover {
    
    public static void main(String[] args){
        Shape shape = new Shape(new Position(0, 0), "purple", "white");
        System.out.println(shape);
        moveShape(shape, new Position(4, 8));
        System.out.println(shape);

        Rectangle rectangle = new Rectangle(new Position(2, 3), "red", "orange", 1, 2);
        System.out.println(rectangle);
        moveShape(rectangle, new Position(9, 0));
        System.out.println(rectangle);

        Circle circle = new Circle(new Position(5, 10), "blue", "green", 3);
        System.out.println(circle);
        moveShape(circle, new Position(0, 10));
        System.out.println(circle);

        Triangle triangle = new Triangle(new Position(3, 7), "black", "grey", 7);
        System.out.println(triangle);
        moveShape(triangle, new Position(5, 5));
        System.out.println(triangle);
    }
    
    public static void moveShape(Shape shape, Position position){
        shape.setPosition(position);
    }
}
