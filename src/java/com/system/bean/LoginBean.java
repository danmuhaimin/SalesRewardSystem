/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.bean;

import java.io.Serializable;

/**
 *
 * @author tengk
 */
public class LoginBean implements Serializable{
    private String username;
    private String password;

    //setter
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    //getter
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    } 
}