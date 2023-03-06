/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.dao;

import com.system.bean.DeleteEmployeeBean;
import com.system.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tengk
 */
public class DeleteEmployeeDao {
        public String deleteStatus(DeleteEmployeeBean deleteEmployeeBean) throws SQLException {
        String icNumber = deleteEmployeeBean.getIcNumber();
        String confirmIcNumber = deleteEmployeeBean.getConfirmIcNumber();
        
        if(!confirmIcNumber.equals(icNumber)) {
            return "FAILED";
        }
        
        try {
            Connection conn = DBConnection.createConnection();
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM EMPLOYEE");
            ResultSet rs = pstmt.executeQuery(); //mcm list
            
            while(rs.next()) {
                String icNumberDB = rs.getString("ICNUMBER");
                String usernameDB = rs.getString("USERNAME");
                
                if(icNumber.equals(icNumberDB)) {
                    pstmt = conn.prepareStatement("DELETE FROM ACCOUNT WHERE USERNAME = ?");
                    pstmt.setString(1, usernameDB);
                    pstmt.executeUpdate();
                    
                    pstmt = conn.prepareStatement("DELETE FROM COMMISSION WHERE ICNUMBER = ?");
                    pstmt.setString(1, icNumber);
                    pstmt.executeUpdate();

                    pstmt = conn.prepareStatement("DELETE FROM EMPLOYEE WHERE ICNUMBER = ?");
                    pstmt.setString(1, icNumber);
                    pstmt.executeUpdate();
                    
                    pstmt = conn.prepareStatement("DELETE FROM SALES WHERE ICNUMBER = ?");
                    pstmt.setString(1, icNumber);
                    pstmt.executeUpdate();
                    
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
