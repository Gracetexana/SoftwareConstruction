package homework.geometry;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

import java.util.Scanner;

public class TestCircle {
    /**
     * asks user for the x- and y-values of the center of the circle, the radius of the circle, and the x- and y-values of a point
     * calls Circle method display() to display information about the circle and point
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // center
        System.out.println("Enter the x-value of the center of your circle.");
        double centerX = scanner.nextDouble();
        System.out.println("Now enter the y-value of the center of your circle.");
        double centerY = scanner.nextDouble();

        Point center = new Point(centerX, centerY);

        // circle
        System.out.println("Enter the radius of your circle.");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(center, radius);

        // point
        System.out.println("Now enter the x-value of your point.");
        double pointX = scanner.nextDouble();
        System.out.println("Finally, enter the y-value of your point.");
        double pointY = scanner.nextDouble();
        System.out.println();

        Point point = new Point(pointX, pointY);

        circle.display(point);
        System.out.println();
    }
}
