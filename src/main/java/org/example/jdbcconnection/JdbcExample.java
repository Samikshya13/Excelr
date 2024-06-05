package org.example.jdbcconnection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class JdbcExample {
    public static void main(String[] args)
    {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String url = "jdbc:mysql://localhost:3306/";
        
        final String username = "root";
        final String password = "root";
        
        try{
            Class.forName(JDBC_DRIVER);
            DriverManager Drivermanager = null;
            Connection connection = Drivermanager.getConnection(url, username, password);
        }
    }
}
