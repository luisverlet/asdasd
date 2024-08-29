/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author luisv
 */
public class Originator {
    
        private Juego estado;

	public void setEstado(Juego estado) {
		this.estado = estado;
	}

	public Juego getEstado() {
		return estado;
	}

	public Memento guardar() {
		return new Memento(estado);
	}

	public void restaurar(Memento m) {
		this.estado = m.getEstado();
	}
    
}
