/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;

/**
 *
 * @author luisv
 */
public class Caretaker {
    
    private ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento m) {
            mementos.add(m);
    }

    public Memento getMemento(int index) {
            return mementos.get(index);
    }
    
}
