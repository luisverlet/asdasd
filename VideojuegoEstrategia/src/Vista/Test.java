/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.AgenteAvanzado;
import Modelo.AgenteBasico;
import Modelo.Contexto;

/**
 *
 * @author luisv
 */
public class Test {
    
    public static void main(String[] args) {
        Contexto contexto = new Contexto(new AgenteAvanzado());
        contexto.atacar();
    }
    
}
