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
public class ResetPasswordBean implements java.io.Serializable{
    
    private String username;
    private String icNumber;
    private String newPassword;
    private String confirmNewPassword;
    
    public ResetPasswordBean(){
        username = null;
        icNumber = null;
        newPassword = null;
        confirmNewPassword = null;
    }
    
    // Getter
    public String getUsername() {
        return username;
    }
    public String getIcNumber() {
        return icNumber;
    }
    public String getNewPassword() {
        return newPassword;
    }
    public String getConfirmNewPassword() {
        return confirmNewPassword;
    }
    
    
    // Setter
    public void setUsername(String username) {
        this.username = username;
    }
    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
    public void setConfirmNewPassword(String confirmNewPassword) {
        this.confirmNewPassword = confirmNewPassword;
    }
    
}
