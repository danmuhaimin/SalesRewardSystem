/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.dao;

import com.system.model.Employee;
import com.system.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author tengk
 */
public class EmployeeDao {
    public Employee retrieveEmployee(String username){
        Employee employee = null;
        try {
            Connection conn = DBConnection.createConnection();
            //String query = "SELECT USERNAME, PASSWORD FROM ACCOUNT";
            PreparedStatement pstmt = conn.prepareStatement("SELECT ICNUMBER, NAME FROM EMPLOYEE WHERE USERNAME = ?");
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery(); 
            
            while(rs.next()) {
                String icNumber = rs.getString("ICNUMBER");
                String name = rs.getString("NAME");
                employee = new Employee(name, username, icNumber); 
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return employee;
    }
}
