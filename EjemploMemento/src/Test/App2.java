package Test;

import Modelo.Caretaker;
import Modelo.Juego;
import Modelo.Originator;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        String nombreJuego = "Crash Bandicoot";
        
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        Scanner scanner = new Scanner(System.in);
        String opcion = "";
        
        while (true) {
            System.out.print("Ingresa el checkpoint actual (o escribe 'salir' para terminar): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("salir")) {
                break;
            }
            
            int checkpoint;
            try {
                checkpoint = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingresa un número.");
                continue;
            }

            // Crear una nueva instancia de Juego
            Juego juego = new Juego();
            juego.setNombre(nombreJuego);
            juego.setCheckpoint(checkpoint);
            originator.setEstado(juego);

            System.out.print("¿Deseas guardar el estado actual? (si/no): ");
            opcion = scanner.nextLine();

            if (opcion.equalsIgnoreCase("si")) {
                caretaker.addMemento(originator.guardar());
                System.out.println("Estado guardado.");
            } else {
                System.out.println("Estado no guardado.");
            }
        }
        
        System.out.print("¿Deseas restaurar un estado anterior? (si/no): ");
        opcion = scanner.nextLine();

        if (opcion.equalsIgnoreCase("si")) {
            System.out.print("Ingresa la posición del estado que deseas restaurar: ");
            int posicion;
            try {
                posicion = Integer.parseInt(scanner.nextLine());
                originator.restaurar(caretaker.getMemento(posicion));
                Juego juegoRestaurado = originator.getEstado();
                System.out.println("Estado restaurado: " + juegoRestaurado);
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Posición inválida. No se pudo restaurar el estado.");
            }
        }

        scanner.close();
    }
}
