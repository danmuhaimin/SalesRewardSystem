/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.dao;

import com.system.bean.EmployeeSaleBean;
import com.system.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tengk
 */
public class UpdateEmployeeSalesDao {
    public String updateStatus(EmployeeSaleBean employeeSaleBean) throws SQLException {
        String icNumber = employeeSaleBean.getIcNumber();
        double updateSalesAmount = employeeSaleBean.getUpdateSalesAmount();
        
        try {
            Connection conn = DBConnection.createConnection();
            PreparedStatement pstmt = conn.prepareStatement("SELECT ICNUMBER FROM SALES");
            ResultSet rs = pstmt.executeQuery(); //mcm list
            
            while(rs.next()) {
                String icNumberDB = rs.getString("ICNUMBER");
                
                if(icNumber.equals(icNumberDB)) {
                    pstmt = conn.prepareStatement("UPDATE SALES SET SALESAMOUNT = ? WHERE ICNUMBER = ?");
                    pstmt.setDouble(1, updateSalesAmount);
                    pstmt.setString(2, icNumber);
                    pstmt.executeUpdate();
                    
                    double commission = updateSalesAmount * 0.15;
                    pstmt = conn.prepareStatement("UPDATE COMMISSION SET COMMISIONAMOUNT = ? WHERE ICNUMBER = ?");
                    pstmt.setDouble(1, commission);
                    pstmt.setString(2, icNumber);
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
