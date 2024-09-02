/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author luisv
 */
public class AgenteAvanzado extends AtaqueRifle{

    @Override
    void recargar() {
        try {
            System.out.println("Agente recarga Rifle...");
            Thread.sleep(1000);
            System.out.println("1 cartucho en el rifle");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void apuntar() {
        System.out.println("Agente apunta el rifle desde arriba...");
    }

    @Override
    void apuntarLaser() {
        try {
            System.out.println("Agente activa la mira laser...");
            Thread.sleep(1000);
            System.out.println("Apunta desde la mira...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void disparar() {
        try {
            System.out.println("Agente aprieta el gatillo...");
            Thread.sleep(1000);
            System.out.println("Dispara 1 bala");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void dispararAutomatico() {
        try {
            System.out.println("Agente aprieta el gatillo...");
            Thread.sleep(1000);
            System.out.println("Dispara 1 rafaga");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void guardar() {
        System.out.println("Agente guarda el rifle.");
    }
    

    @Override
    void agregarAccesorio() {
        try {
            System.out.println("Agente toma el accesorio...");
            Thread.sleep(1000);
            System.out.println("Acopla accesorio al rifle");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
