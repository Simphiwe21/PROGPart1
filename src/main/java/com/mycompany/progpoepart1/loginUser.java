/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progpoepart1;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class loginUser {
    
    public static void loginUser(Object Username, Object password) {
        boolean isLoggedIn = false;
        
        while(!isLoggedIn) {
            String Username1= JOptionPane.showInputDialog(null, "Enter Username:");
            String password1= JOptionPane.showInputDialog(null, "Enter Password:");
            
            if(Username1 != null && password1 != null && Username1.equals(Username) && password1.equals(password)) {
                JOptionPane.showMessageDialog(null, "Welcome back, it is great to see you again!");
                
                isLoggedIn = true;
                
            } else {
                JOptionPane.showMessageDialog(null, "Username or Password is incorrect, please try again");
            }
        }
}
}
