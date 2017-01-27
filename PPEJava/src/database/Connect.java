package database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {

    public static ResultSet bConnect(String mQuery) {
        ResultSet r = null ;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/m2ljava";
            String user = "root";
            String pass = "";

            java.sql.Connection c = DriverManager.getConnection(url, user, pass);
            System.out.println("OK");
            r = Query(mQuery, c);
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return r;
    }
    private static ResultSet Query (String Query, java.sql.Connection c) throws SQLException{
        Queries q = new Queries("select", "users");
        Statement s = c.createStatement();
        return s.executeQuery(q.getMQuery());
    }
    
}