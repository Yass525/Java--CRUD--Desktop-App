
package com.Connection;

import java.sql.DriverManager;


public class Connection {
    
    public static java.sql.Connection getMySqlConnection() throws Exception {
    /* Initialize the driver for the connection of Java and Mysql
        Make Sure to add the mysql-connector-java.jar */   
    String driver = "com.mysql.jdbc.Driver";
    // *** Initialize the Mysql Username and Password
    String user = "root";
    String pass = "1234";
    String url ="jdbc:mysql://localhost:3306/javaDB";

    Class.forName(driver); 
    java.sql.Connection conn = DriverManager.getConnection(url, user,pass);
    return conn;
    }
}
