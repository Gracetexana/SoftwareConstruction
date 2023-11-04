package session;
/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class MetaDataDemo {
    public static void main(String[] args){
        final String url = "jdbc:mysql://localhost:3306/coffee";
	    final String user = "gracetexana";
	    final String password = "password";

        try{
            Scanner scanner = new Scanner(System.in);
            
            Connection conn = DriverManager.getConnection(url, user, password);

            System.out.println("Enter a SELECT statement for the coffee database.");

            String sql = scanner.nextLine();

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            ResultSetMetaData meta = rs.getMetaData();

            System.out.println("\nThe result set has " + meta.getColumnCount() + " column(s).\n");

            for (int i=1; i<=meta.getColumnCount(); i++){
                System.out.println(meta.getColumnName(i) + ", " + meta.getColumnTypeName(i));
            }

            System.out.println("\nHere are the result set rows:\n");

            while (rs.next()){
                for (int i=1; i<=meta.getColumnCount(); i++){

                    System.out.print(rs.getString(i));
                }

                System.out.println();
            }

            stmt.close();
            conn.close();
            scanner.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
