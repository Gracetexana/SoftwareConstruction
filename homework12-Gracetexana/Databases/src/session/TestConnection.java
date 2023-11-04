package session;
/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

// Needed for JDBC classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestConnection
{
    public static void main(String[] args)
    {
        // Database connection
        final String url = "jdbc:mysql://localhost:3306/";
        final String user = "gracetexana";
        final String password = "password";

        String query = "SELECT VERSION()";

        Connection con;
        Statement st;
        ResultSet rs;

        try
        {
            // Create a connection to the database.
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {

                System.out.println(rs.getString(1));
            }

            close(con,rs,st);

        }
        catch(Exception ex)
        {
            System.out.println("ERROR: " + ex.getMessage());
        }

    }

    // You need to close all what you reserved
    private static void close(Connection connect, ResultSet resultSet, Statement statement) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
