/*\

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progpoepart1;

/**
 *
 * @author RC_Student_lab
 */
import static com.mycompany.progpoepart1.loginUser.loginUser;
import javax.swing.JOptionPane;

public class PROGPOEPART1 {

   
    
    public static void main(String[] args) {
        
        registerUser();
        
        loginUser();
    }
    
    public static void registerUser(){
        String name= JOptionPane.showInputDialog(null, "Enter your Name:");
        String surname= JOptionPane.showInputDialog(null, "Enter your Surname:");
        String Username= JOptionPane.showInputDialog(null, "Enter your Username:");
        String password= JOptionPane.showInputDialog(null, "Create a Password:");
        
        if(Username!= null && Username.contains("_") && Username.length() <=5) {
            JOptionPane.showMessageDialog(null, "Username successfully captured");
        } else{
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted. Please ensure that your username contains an underscore and is no more than 5 characters in length");
           
        }
        if(password!= null &&! password.trim().isEmpty()){
            if(password.length()>=8){
                boolean hasUppercase = false;
                boolean hasDigit = false;
                boolean hasSpecialChar = false;
                
                for(Character c: password.toCharArray()){
                    if(Character.isUpperCase(c)){
                        hasUppercase = true;
                    } else if(Character.isDigit(c)){
                        hasDigit = true;
                    } else if(!Character.isLetterOrDigit(c)){
                        hasSpecialChar = true;
                    }
                }
                
                if(hasUppercase && hasDigit && hasSpecialChar){
                    JOptionPane.showMessageDialog(null, "Password successfully captured");
                     
                } else{
                    JOptionPane.showMessageDialog(null, "Password is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character");
                }
            } else {
                JOptionPane.showMessageDialog(null,"Password is too short. It must be atleast 8 characters long");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Password cannot be empty. Please enter a valid password");
        }
        
        JOptionPane.showMessageDialog(null, "Name:"+name+
                "\n" +"Surname:"+ surname +
                "\n" + "Username:" + Username +
                "\n" + "Password:" + password);
            }
    
    
    }
