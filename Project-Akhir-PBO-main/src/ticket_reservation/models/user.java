/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticket_reservation.models;

/**
 *
 * @author Lenovo
 */
public class user {
    private String username;
    private String password;
    private String nama;
    private int noHp;
    
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }public void setNama(String nama){
        this.nama = nama;
    }public void setnoHp(int noHp){
        this.noHp = noHp;
    }
    
    public String GetUsername(){
        return username;
    }
    public String GetPassword(){
        return password;
    }
    public String GetNama(){
        return nama;
    }
    public int GetNoHp(){
        return noHp;
    }
    
}
