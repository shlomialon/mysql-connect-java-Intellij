/**
 * Created by Shlomi Alon on 05/04/2017.
 */
import java.sql.*;
public class Main{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "insert - User", "insert - Password")){
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM products");
                int numOfColumns = rs.getMetaData().getColumnCount();
                while (rs.next()){
                    for (int col = 1; col <= numOfColumns; col++){
                        System.out.print(rs.getString(col) + "\t" + "|" + "\t");
                    }
                    System.out.println();
                }
            }} catch (Exception ex){ex.printStackTrace();}
    }
}

