/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author User
 */
public class User {
  private String username;
    private String password;
    private String role;
    
    // Constructor
    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
        }
          String show() {
        String output = "Username: " + this.username + "<br>" + "Password " + this.password ;
        return output;
    }
    
    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
/**
     * Utility method to check if the password matches.
     * This method can be expanded to include encryption checks.
     * 
     * @param password the password to check
     * @return true if the passwords match, false otherwise
     */
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    
    }
     @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
