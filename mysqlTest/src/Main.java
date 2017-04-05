/**
 * Created by Shlomi Alon on 05/04/2017.
 */
import java.sql.*;
public class Main {

    public static void getQuery(String query, String databases, String user, String pass) {
        String useDatabase = "jdbc:mysql://localhost:3306/" + databases;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(useDatabase, user, pass)) {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                int numOfColumns = rs.getMetaData().getColumnCount();
                while (rs.next()) {
                    for (int col = 1; col <= numOfColumns; col++) {
                        System.out.print(rs.getString(col) + "\t" + "|" + "\t");
                    }
                    System.out.println();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String query = "SELECT * FROM products";
        getQuery(query,"northwind","root","shlomi2249");
    }
}

