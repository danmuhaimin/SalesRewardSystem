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
public class DeleteEmployeeBean {
    private String icNumber;
    private String confirmIcNumber;
    
    public DeleteEmployeeBean(){
        icNumber = null;
        confirmIcNumber = null;
    }
    
    // Getter
    public String getIcNumber() {
        return icNumber;
    }
    public String getConfirmIcNumber() {
        return confirmIcNumber;
    }
    
    // Setter
    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }
    public void setConfirmIcNumber(String confirmIcNumber) {
        this.confirmIcNumber = confirmIcNumber;
    }
    
}
