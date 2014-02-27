/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Trung
 */
public class DBConnector {

    public static Connection getConnect() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=book_recommendation";
        String user = "sa";
        String password = "1234567";
        return DriverManager.getConnection(url, user, password);
    }

//    public static void main(String[] args) throws Exception {
//        Connection conn = getConnect();
//        if (conn != null) {
//            System.out.println("Database connection is ok.");
//        }
//        else{
//            System.out.println("Failed to connect to database.");
//        }
//    }
}
