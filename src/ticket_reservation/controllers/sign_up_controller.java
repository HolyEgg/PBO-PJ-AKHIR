/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticket_reservation.controllers;

import ticket_reservation.models.user;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import ticket_reservation.views.screen.register_screen;
/**
 *
 * @author Lenovo
 */
public class sign_up_controller {
    Statement statement;
    private user model;
    private register_screen view;
    public sign_up_controller (user model, register_screen view){
        this.model = model;
        this.view = view;
    }
    
    public void register(String text, String text2, String text3, int number){
        model.setUsername(text);
        model.setPassword(text2);
        model.setNama(text3);
        model.setnoHp( number);
        
        try{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticket_reservation", "root", "");
        String sql = " insert into user(id, username, password, nama, no_hp)" + " values (?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = connection.prepareStatement(sql);
            preparedStmt.setInt (1, 0);
            preparedStmt.setString (2, model.GetUsername());
            preparedStmt.setString   (3, model.GetPassword());
            preparedStmt.setString (4, model.GetNama());
            preparedStmt.setInt    (5, model.GetNoHp());
            preparedStmt.execute();
            connection.close();
            view.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(sign_up_controller.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }
    
}
