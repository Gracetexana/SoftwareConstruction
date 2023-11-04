package session;
/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CoffeeMath {
    public static void main(String[] args){
        double 
            lowest = 0, 
            highest = 0, 
            average = 0;

        final String url = "jdbc:mysql://localhost:3306/coffee";
	    final String user = "gracetexana";
	    final String password = "password";

        try{
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(
                "SELECT MIN(price) " +
                "FROM coffee"
            );
            if (rs.next()){
                lowest = rs.getDouble(1);
            }

            rs = stmt.executeQuery(
                "SELECT MAX(price) " +
                "FROM coffee"
            );
            if (rs.next()){
                highest = rs.getDouble(1);
            }

            rs = stmt.executeQuery(
                "SELECT AVG(price) " +
                "FROM coffee"
            );
            if (rs.next()){
                average = rs.getDouble(1);
            }

            System.out.printf(
                "Lowest Price: $%.2f\n", lowest
            );
            System.out.printf(
                "Highest Price: $%.2f\n", highest
            );
            System.out.printf(
                "Average Price: $%.2f\n", average
            );

            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
