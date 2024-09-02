/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author luisv
 */
public abstract class AtaqueRifle implements IEstrategia{
    public void atacar(){
        recargar();
        apuntar();
        apuntarLaser();
        disparar();
        dispararAutomatico();
        guardar();
        agregarAccesorio();
    }

    abstract void recargar();
    abstract void apuntar();
    abstract void apuntarLaser();
    abstract void disparar();
    abstract void dispararAutomatico();
    abstract void guardar();
    abstract void agregarAccesorio();
}
