/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author luisv
 */
public class Memento {
    
    private Juego estado;
    
    public Memento(Juego estado){
        this.estado = estado;
    }
    
    public Juego getEstado(){
        return estado;  
    }
}
