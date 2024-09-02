/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author luisv
 */
public abstract class AtaqueArco implements IEstrategia{
    public void atacar(){
        recargar();
        apuntar();
        disparar();
        guardar();    
    }

    abstract void recargar();
    abstract void apuntar();
    abstract void disparar();
    abstract void guardar();
}
