/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisv
 */
public class AgenteBasico extends AtaqueArco{

    @Override
    void recargar() {
        try {
            System.out.println("Agente recarga Arco...");
            Thread.sleep(1000);
            System.out.println("1 Flecha en el arco");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void apuntar() {
        System.out.println("Agente apunta Arco...");    
    }

    @Override
    void disparar() {
        System.out.println("Agente dispara Arco..."); 
    }

    @Override
    void guardar() {
        System.out.println("Agente guarda Arco en el inventario.");
    }
    
}
