/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.dao;

import com.system.bean.RegisterBean;
import com.system.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author tengk
 */
public class RegisterDao {
        public String checkDuplicate(RegisterBean registerBean) {
        String name = registerBean.getName();
        String username = registerBean.getUsername();
        String icNumber = registerBean.getIcNumber();
        String password = registerBean.getPassword();
        String confirmPassword = registerBean.getConfirmPassword();
        
        if(username.contains("admin") || username.contains("ADMIN")) {
            return "FAILED : Illegal username";
        } 
        if(!confirmPassword.equals(password)) {
            return "FAILED : Please re-confirm password";
        }
        
        try {
            Connection conn = DBConnection.createConnection();
            PreparedStatement pstmt = conn.prepareCall("SELECT ICNUMBER, USERNAME FROM EMPLOYEE");
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()) {
                String icNumberDB = rs.getString("ICNUMBER");
                String usernameDB = rs.getString("USERNAME");
                
                if(icNumber.equals(icNumberDB)){
                    return "FAILED : IC Number already existed";
                }
                
                else if(username.equals(usernameDB)) {
                    return "FAILED : Username already existed";
                }
            }
            
            String query = "INSERT INTO ACCOUNT VALUES (?, ?)";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.executeUpdate();
            
            query = "INSERT INTO EMPLOYEE VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(query);
                    pstmt.setString(1, icNumber);
                    pstmt.setString(2, name);
                    pstmt.setString(3, username);
                    pstmt.executeUpdate();
                    
            query = "INSERT INTO SALES VALUES (?, ?)"; // initialize sales row 
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, icNumber);
            pstmt.setDouble(2, 0);
            pstmt.executeUpdate();
            
            query = "INSERT INTO COMMISSION VALUES (?, ?)"; // initialize commission row 
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, icNumber);
            pstmt.setDouble(2, 0);
            pstmt.executeUpdate();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return "SUCCESS";
    }
}
