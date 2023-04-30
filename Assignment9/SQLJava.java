
import java.sql.*;
 
public class SQLJava 
{
    public static void main(String arg[])
    {
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/JavaPrj",
                "root", "Harsh@2111");
 
            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database
 
            System.out.println("Connection established to MySQL Database.");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed to MySQL Database.");
                }
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    } // function ends
}