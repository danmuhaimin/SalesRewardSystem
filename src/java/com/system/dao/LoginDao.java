/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.dao;

import com.system.bean.LoginBean;
import com.system.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tengk
 */
public class LoginDao {
    public String authenticateUser(LoginBean loginBean) throws SQLException {
        String username = loginBean.getUsername();
        String password = loginBean.getPassword();
        
        try {
            Connection conn = DBConnection.createConnection();
            //String query = "SELECT USERNAME, PASSWORD FROM ACCOUNT";
            PreparedStatement pstmt = conn.prepareCall("SELECT USERNAME, PASSWORD FROM ACCOUNT");
            ResultSet rs = pstmt.executeQuery(); //mcm list
            
            while(rs.next()) {
                String usernameDB = rs.getString("username");
                String passwordDB = rs.getString("password");
                
                if(username.equals(usernameDB) && password.equals(passwordDB)) {
                    return "SUCCESS";
                } 
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return "FAILED";
    }  
}
