package org.example.PaqueteHistoriasPerfiles;

import java.util.Scanner;
import java.util.HashMap;

public class HU025C5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> proyecto = new HashMap<>();

        String opcionMenu;

        proyecto.put(1, "Proyecto Numero 1");
        proyecto.put(2, "Proyecto Numero 2");
        proyecto.put(3, "Proyecto Numero 3");
        proyecto.put(4, "Proyecto Numero 4");
        proyecto.put(5, "Proyecto Numero 5");

        System.out.println("\n=== Portafolio de proyectos ===");

        do {

            System.out.print("\nQuieres: " +
                    "\n 1. Eliminar un proyecto" +
                    "\n 2. Salir" +
                    "\nIngrese el numero de opcion: ");
            opcionMenu = scanner.nextLine();

            if (opcionMenu.equals("1")){
                System.out.println("\nProyectos disponibles:");
                proyecto.forEach((k, v) -> System.out.println(k + ": " + v));

                System.out.println("\n--- ELIMINAR UN PROYECTO ---");
                System.out.print("Introduce el número del proyecto que deseas borrar: ");
                int numeroParaEliminar = scanner.nextInt();

                if (!proyecto.containsKey(numeroParaEliminar)) {
                    System.out.println(" No existe un proyecto con ese número.");
                } else {
                    String nombre = proyecto.get(numeroParaEliminar);
                    System.out.println("¿Deseas eliminar el proyecto: \"" + nombre + "\"? (si/no)");
                    String respuesta = scanner.next().trim().toLowerCase();

                    if (respuesta.equals("si") || respuesta.equals("si")) {
                        proyecto.remove(numeroParaEliminar);
                        System.out.println(" Proyecto eliminado exitosamente.");
                    } else {
                        System.out.println(" Operación cancelada. El proyecto NO fue eliminado.");
                    }
                    scanner.nextLine();
                }

                System.out.println("\nLista actual de proyectos:");
                if (proyecto.isEmpty()) {
                    System.out.println("(ninguno)");
                } else {
                    proyecto.forEach((k, v) -> System.out.println(k + ": " + v));
                }


            }

        } while (!opcionMenu.equals("2"));


    }
}








