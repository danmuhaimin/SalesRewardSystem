/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author tengk
 */
public class DBConnection {
    public static Connection createConnection()
 {
     Connection con = null;
     String driver = "org.apache.derby.jdbc.ClientDriver";
     String connectionString = "jdbc:derby://localhost:1527/SalesRewardSystemDB;create=true;user=app;password=app"; //Derby URL and followed by the database name
     //String username = "app"; //Derby username
     //String password = "app"; //Derby password
     try 
     {
         try 
         {
            Class.forName(driver); //loading driver 
         } 
         catch (ClassNotFoundException e)
         {
            e.printStackTrace();
         } 
         con = DriverManager.getConnection(connectionString); //attempting to connect to database
         System.out.println("Printing connection object "+con);
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
     return con; 
 }
}
