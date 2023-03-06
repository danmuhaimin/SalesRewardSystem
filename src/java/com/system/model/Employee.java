/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.model;

/**
 *
 * @author tengk
 */
public class Employee {
    
    private String name;
    private String username;
    private String icNumber;

    // Constructor
    public Employee(){
        name = null;
        username = null;
        icNumber = null;
    }
    public Employee(String name, String username, String icNumber) {
        this.name = name;
        this.username = username;
        this.icNumber = icNumber;
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
}
