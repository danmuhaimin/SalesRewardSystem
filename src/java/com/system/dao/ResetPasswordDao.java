/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.dao;

import com.system.bean.ResetPasswordBean;
import com.system.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author tengk
 */
public class ResetPasswordDao {
    public String validation(ResetPasswordBean resetPasswordBean) {
        String username = resetPasswordBean.getUsername();
        String icNumber = resetPasswordBean.getIcNumber();
        String newPassword = resetPasswordBean.getNewPassword();
        String confirmNewPassword = resetPasswordBean.getConfirmNewPassword();
        
        if(!confirmNewPassword.equals(newPassword)) {
            return "FAILED: Please re-confirm new password";
        }
        
        try {
            Connection conn = DBConnection.createConnection();
            PreparedStatement pstmt = conn.prepareCall("SELECT ICNUMBER, USERNAME FROM EMPLOYEE");
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()) {
                String icNumberDB = rs.getString("ICNUMBER");
                String usernameDB = rs.getString("USERNAME");
                
                if((icNumber.equals(icNumberDB) && (username.equals(usernameDB)) )){
                    
                    String query = "UPDATE ACCOUNT SET PASSWORD = ? WHERE USERNAME = ?";
                    pstmt = conn.prepareStatement(query);
                    pstmt.setString(1, newPassword);
                    pstmt.setString(2, username);
                    pstmt.executeUpdate();
                    return "SUCCESS";
                }
                
            }
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return "FAILED: No such account found";
    }
}
