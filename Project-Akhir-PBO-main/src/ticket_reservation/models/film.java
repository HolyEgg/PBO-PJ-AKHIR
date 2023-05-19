/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticket_reservation.models;

/**
 *
 * @author Lenovo
 */
public class film {
    private int id;
    private String nama;
    private String poster;
    
    public void setIdFilm(String nama){
     this.id = id;   
    }  
    
    public void setNamaFilm(String nama){
     this.nama = nama;   
    }    
    public void setPosterFilm(String poster){
    this.poster = poster;
    }
    
    public int getIdFilm(String poster){
    return id;
    }
    
    public String getNamaFilm(String nama){
    return nama;
    }
    
    public String getPosterFilm(String poster){
    return poster;
    }
}
