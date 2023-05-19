/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticket_reservation.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ticket_reservation.models.user;
import ticket_reservation.views.screen.login_screen;
import ticket_reservation.views.screen.dashboard_screen;

/**
 *
 * @author Lenovo
 */
public class login_controller {
    private user model;
    private login_screen view;
    PreparedStatement prepareStatement;
    private ResultSet rs;
    public login_controller (user model, login_screen view){
        this.model = model;
        this.view = view;
    }

    public void login(String text, String text1) {
        
         
            
            try{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticket_reservation", "root", "");
         String sql = "SELECT * FROM `user` WHERE `username` =? AND `password` =? ";
            prepareStatement = connection.prepareStatement(sql);
            
            prepareStatement.setString(1, text);
            prepareStatement.setString(2, text1);
            
            rs = prepareStatement.executeQuery();
            if(rs.next()){
            new dashboard_screen().setVisible(true);
            view.dispose();
            }
             else{
                    JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
                }
            connection.close();
            view.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(sign_up_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
}
