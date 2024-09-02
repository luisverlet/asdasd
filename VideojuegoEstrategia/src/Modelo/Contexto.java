/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author luisv
 */
public class Contexto {
    private IEstrategia estrategia;
    
    public Contexto(IEstrategia estrategia){
        this.estrategia = estrategia;
    }
    
    public void atacar(){
        this.estrategia.atacar();
    }
    
}
