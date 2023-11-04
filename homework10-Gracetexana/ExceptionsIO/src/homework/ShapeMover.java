package homework;

/**
 * Utility class that can be used to move or print shapes.
 */
public class ShapeMover {
    /**
     * Prints a shape, moves it to a new position, and then prints it again.
     *
     * @param shape The shape to move and print.
     * @param position The new position to which the shape should me moved.
     */
    public static void moveShape(Shape shape, Position position) {
        System.out.println("BEFORE MOVING");
        printShape(shape);

        shape.move(position);

        System.out.println("AFTER MOVING");
        printShape(shape);
    }

    /**
     * Prints the details about a shape including the class name, position,
     * area, perimeter, fill color, and outline.
     *
     * @param shape The shape to print.
     */
    public static void printShape(Shape shape) {
        System.out.println("Shape: " + shape.getClass());
        System.out.println("  position: " + shape.getPos());
        System.out.println("  area: " + shape.area());
        System.out.println("  perimeter: " + shape.perimeter());
        System.out.println("  fill color: " + shape.getFillColor());
        System.out.println("  outline: " + shape.getLineColor() + "\n");
    }

    /**
     * Tests the move method with various different shapes.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        Shape shape = new Shape(new Position(100, 100), "Red", "Blue", "shape");
        moveShape(shape, new Position(200, 200));

        Rectangle rectangle = new Rectangle(new Position(50, 50), "Brown",
                "Yellow", 100, 50);
        moveShape(rectangle, new Position(25, 75));

        Circle circle = new Circle(new Position(0, 10), "Transparent",
                "Black", 150);
        moveShape(circle, new Position(10, 0));

        Triangle triangle = new Triangle(new Position(-30, -50), "Blue",
                "Orange", 125);
        moveShape(triangle, new Position(-100, -200));
    }
}
