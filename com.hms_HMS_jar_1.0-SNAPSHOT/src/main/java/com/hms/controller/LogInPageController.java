/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.controller;

import com.hms.view.LogInPage;
import com.hms.model.User;
import com.hms.model.UserService;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class LogInPageController { 
     private final LogInPage LogInPage;
//    private Component logInPage;
    public LogInPageController(LogInPage loginPage, UserService userService) {
        this.LogInPage = loginPage;
        // Ensure that the getLoginButton() and getCancelButton() return JButton types
        JButton LoginButton1 = LogInPage.getLoginButton();  // Cast to JButton
        JButton CancelButton1 = LogInPage.getCancelButton();
        
        // Add action listeners for the buttons
       LoginButton1.addActionListener(e -> handleLogin());
        CancelButton1.addActionListener(e -> handleCancel());
    }
        
        
        
//        // Set up action listeners for login and cancel buttons
        
//                this.LogInPage.getLoginButton().addActionListener(e -> handleLogin());
//                this.LogInPage.getCancelButton().addActionListener(e -> handleCancel());
//            }

          
    

    
    

    /**
     * Handle login logic when the login button is clicked.
     */
   

    private void handleLogin() {
        String username = LogInPage.getUsername();
        String password = LogInPage.getPassword();
        
        System.out.println("Attempting to login with Username: " + username);
        // Validate credentials via UserService (could be database interaction or API)
        User user = UserService.authenticate(username, password);
        if (user != null) {
            Component logInPage = null;
            // Successful login
             System.out.println("Login successful for user: " + username);
            JOptionPane.showMessageDialog(logInPage, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Redirect to the dashboard or another page
            // e.g., new DashboardPage(user).setVisible(true);
        } else {
            // Failed login
            System.out.println("Login failed: Invalid credentials for user: " + username);
            JOptionPane.showMessageDialog(LogInPage, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }
/**
     * Handle cancel logic when the cancel button is clicked.
     */
     private void handleCancel() {
        // Close the login page or perform any other necessary cleanup
       LogInPage.dispose();
    }

        }         
