package session;
/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CoffeeMinPrice {
    public static void main(String[] args){
        double minPrice;
        int coffeeCount = 0;

        final String url = "jdbc:mysql://localhost:3306/coffee";
	    final String user = "gracetexana";
	    final String password = "password";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the minimum price.");
        minPrice = scanner.nextDouble();

        try{
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();

            ResultSet result = stmt.executeQuery(
                "SELECT * " + 
                "FROM coffee " +
                "WHERE price >= " + minPrice +
                "AND LOWER(description) LIKE '%decaf%'"
            );

            while (result.next()){
                System.out.printf(
                    "%25s %10s %8.2f\n",
                    result.getString("description"),
                    result.getString("prodnum"),
                    result.getDouble("price")
                );

                coffeeCount++;
            }

            System.out.println(
                coffeeCount + " coffees found."
            );

            conn.close();
            scanner.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
