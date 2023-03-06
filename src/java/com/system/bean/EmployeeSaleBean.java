/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.bean;

/**
 *
 * @author tengk
 */
public class EmployeeSaleBean implements java.io.Serializable{
    private String icNumber;
    private double updateSalesAmount;
    
    public EmployeeSaleBean(){
        icNumber = null;
        updateSalesAmount = 0;
    }
    
    // Getter
    public String getIcNumber() {
        return icNumber;
    }
    public double getUpdateSalesAmount() {
        return updateSalesAmount;
    }
    
    // Setter
    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }
    public void setUpdateSalesAmount(double updateSalesAmount) {
        this.updateSalesAmount = updateSalesAmount;
    }
    
}
