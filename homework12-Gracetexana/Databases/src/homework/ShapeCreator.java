package homework;

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class ShapeCreator {
    public static void main(String[] args){
        final String url = "jdbc:mysql://localhost:3306/shapedb";
	    final String user = "gracetexana";
	    final String password = "password";

        try{
            Connection conn = DriverManager.getConnection(url, user, password);

            createTables(conn);

            populateTables(conn);

            conn.close();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * creates 3 mySQL tables inside of connected database -- one for circles, one for rectangles, and one for triangles
     */
    public static void createTables(Connection conn) throws Exception{

        try{

            Statement stmt = conn.createStatement();

            // circle table
            // drop if necessary
            try {
                stmt.execute(
                    "DROP TABLE circle"
                );
            }
            catch (SQLException e){
                // no error report needed
            }
            // create new table
            try{
                stmt.execute(
                    "CREATE TABLE circle (" +
                        "id INT AUTO_INCREMENT NOT NULL PRIMARY KEY, " +
                        "x DOUBLE, " +
                        "y DOUBLE, " +
                        "lineColor VARCHAR(6), " +
                        "fillColor VARCHAR(6), " +
                        "radius DOUBLE" +
                    ")"
                );
            }
            catch (SQLException e){
                System.out.println(e.getMessage());
            }

            // rectangle table
            // drop if necessary
            try {
                stmt.execute(
                    "DROP TABLE rectangle"
                );
            }
            catch (SQLException e){
                // no error report needed
            }
            // create new table
            try {
                stmt.execute(
                    "CREATE TABLE rectangle (" +
                        "id INT AUTO_INCREMENT NOT NULL PRIMARY KEY, " +
                        "x DOUBLE, " +
                        "y DOUBLE, " +
                        "lineColor VARCHAR(6), " +
                        "fillColor VARCHAR(6), " +
                        "height DOUBLE, " +
                        "width DOUBLE" +
                    ")"
                );
            }
            catch (SQLException e){
                System.out.println(e.getMessage());
            }

            // triangle table
            // drop table if necessary
            try {
                stmt.execute(
                    "DROP TABLE triangle"
                );
            }
            catch (SQLException e){
                // no error report needed
            }
            try {
                stmt.execute(
                    "CREATE TABLE triangle (" +
                        "id INT AUTO_INCREMENT NOT NULL PRIMARY KEY, " +
                        "x DOUBLE, " +
                        "y DOUBLE, " +
                        "lineColor VARCHAR(6), " +
                        "fillColor VARCHAR(6), " +
                        "sideLength DOUBLE" +
                    ")"
                );
            }
            catch (SQLException e){
                System.out.println(e.getMessage());
            }

        stmt.close();

        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void populateTables(Connection conn){

        try {
            Statement stmt = conn.createStatement();

            for (int i=0; i<10; i++){

                // make random circle and add it to circle table
                Circle circle = (Circle) randomShape("circle");
                stmt.executeUpdate(
                    "INSERT INTO circle " + 
                    "(x, y, lineColor, fillColor, radius) " +
                    "VALUES (" +
                        circle.getPosition().getX() + ", " +
                        circle.getPosition().getY() + ", '" +
                        circle.getLineColor() + "', '" +
                        circle.getFillColor() + "', " +
                        circle.getRadius() +
                    ")"
                );

                // make random rectangle and add it to rectangle table
                Rectangle rectangle = (Rectangle) randomShape("rectangle");
                stmt.executeUpdate(
                    "INSERT INTO rectangle " + 
                    "(x, y, lineColor, fillColor, height, width) " +
                    "VALUES (" +
                        rectangle.getPosition().getX() + ", " +
                        rectangle.getPosition().getY() + ", '" +
                        rectangle.getLineColor() + "', '" +
                        rectangle.getFillColor() + "', " +
                        rectangle.getHeight() + ", " +
                        rectangle.getWidth() +
                    ")"
                );

                // make random triangle and add it to triangle table
                Triangle triangle = (Triangle) randomShape("triangle");
                stmt.executeUpdate(
                    "INSERT INTO triangle " + 
                    "(x, y, lineColor, fillColor, sideLength) " +
                    "VALUES (" +
                        triangle.getPosition().getX() + ", " +
                        triangle.getPosition().getY() + ", '" +
                        triangle.getLineColor() + "', '" +
                        triangle.getFillColor() + "', " +
                        triangle.getSideLength() +
                    ")"
                );
            }

            stmt.close();
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
    }

    public static Shape randomShape(String type){
        
        type = type.toLowerCase();
        
        Random random = new Random();
        // randomly generate Shape parameters
        double x = (random.nextInt(200) + 1) / 10.0;
        double y = (random.nextInt(200) + 1) / 10.0;
        Position pos = new Position(x, y);
        String fillColor = ShapeArray.randomColor();
        String lineColor = ShapeArray.randomColor();
        double measurement1 = (random.nextInt(200) + 1) / 10.0;

        // randomly decide which shape to create
        switch (type){
            case "circle":
                return new Circle(pos, fillColor, lineColor, measurement1);
            case "triangle":
                return new Triangle(pos, fillColor, lineColor,  measurement1);
            case "rectangle":
                double measurement2 = (random.nextInt(200) + 1) / 10.0;
                return new Rectangle(pos, fillColor, lineColor,  measurement1,  measurement2);
            default:
                return null;
        }
    }
}
