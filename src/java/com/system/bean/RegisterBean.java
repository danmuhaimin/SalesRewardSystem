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
public class RegisterBean implements java.io.Serializable{
    
    private String name;
    private String username;
    private String icNumber;
    private String password;
    private String confirmPassword;
    
    public RegisterBean(){
        name = null;
        username = null;
        icNumber = null;
        password = null;
        confirmPassword = null;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
    // Getter
    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }
    public String getIcNumber() {
        return icNumber;
    }
    public String getPassword() {
        return password;
    }
    public String getConfirmPassword() {
        return confirmPassword;
    }
    
    
    
    
}
