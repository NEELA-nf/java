/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */
public class UserService {

    public static User authenticate(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private List<User> users = new ArrayList<>();
public UserService() {
        // Adding a default admin user for testing purposes
        users.add(new User("admin", "password123", "admin"));
    }
/**
     * Registers a new user.
     * 
     * @param username the username of the new user
     * @param password the password of the new user
     * @param role the role of the new user (admin, doctor, patient, etc.)
     * @return true if registration is successful, false if username already exists
     */
public boolean registerUser(String username, String password, String role) {
        // Check if the username is already taken
        if (getUserByUsername(username) != null) {
            return false;  // Username already exists
        }
        // Create and add the new user
        users.add(new User(username, password, role));
        return true;
    }

/**
     * Authenticates a user based on the provided username and password.
     * 
     * @param username the username of the user
     * @param password the password of the user
     * @return the User object if login is successful, null if login fails
     */
public User login(String username, String password, String authenticate) {
        // Search for the user by username
        User user = getUserByUsername(username);

        // Check if the user exists and if the password matches
        if (user != null && user.checkPassword(password)) {
            return user;  // Successful login
        }
        
        return null;  // Failed login
    
}
/**
     * Fetches a user by their username.
     * 
     * @param username the username of the user
     * @return the User object if found, null if not found
     */
 public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
 /**
     * Fetches all registered users.
     * 
     * @return a list of all users
     */
 public List<User> getAllUsers() {
        return users;
    }
 
   /**
     * Deletes a user based on the username.
     * 
     * @param username the username of the user to delete
     * @return true if the user was deleted, false if no such user exists
     */
 public boolean deleteUser(String username) {
        User user = getUserByUsername(username);

        if (user != null) {
            users.remove(user);
            return true;
        }

        return false;
    }
}
