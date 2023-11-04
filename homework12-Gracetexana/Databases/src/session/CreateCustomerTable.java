package session;
/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateCustomerTable {
    public static void main(String[] args){
        final String url = "jdbc:mysql://localhost:3306/coffee";
	    final String user = "gracetexana";
	    final String password = "password";

        try{
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();

            stmt.execute(
                "DROP TABLE customer"
            );

            stmt.execute(
                "CREATE TABLE customer (" +
                    "customerNumber CHAR(10) NOT NULL PRIMARY KEY, " +
                    "name CHAR(25), " +
                    "address CHAR(25), " +
                    "city CHAR(12), " +
                    "state CHAR(2), " +
                    "zip CHAR(5) " +
                ")"
            );

            stmt.executeUpdate(
                "INSERT INTO customer VALUES (" +
                    "'101', " +
                    "'Downtown Cafe', " +
                    "'17 N. Main Street', " +
                    "'Asheville', " +
                    "'NC', " +
                    "'55515' " +
                ")"
            );

            stmt.executeUpdate(
                "INSERT INTO customer VALUES (" +
                    "'102', " +
                    "'Main Street Grocery', " +
                    "'110 E. Main Street', " +
                    "'Canton', " +
                    "'NC', " +
                    "'55555' " +
                ")"
            );

            stmt.executeUpdate(
                "INSERT INTO customer VALUES (" +
                    "'103', " +
                    "'The Coffee Place', " +
                    "'101 Center Plaza', " +
                    "'Waynesville', " +
                    "'NC', " +
                    "'55516' " +
                ")"
            );

            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
