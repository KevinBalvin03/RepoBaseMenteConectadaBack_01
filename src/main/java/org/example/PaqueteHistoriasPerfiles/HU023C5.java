package org.example.PaqueteHistoriasPerfiles;

import java.util.ArrayList;
import java.util.Scanner;

public class HU023C5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Proyecto> proyectosPortafolio = new ArrayList<>();

        byte opcionInicial;


        System.out.println("\n\u001B[35m===  Bienvenido al portafolio de proyectos  ===");


        do {
            System.out.println("\n\u001B[35mActualmente tienes " + proyectosPortafolio.size() + " proyectos en la base de datos.");
            System.out.print("\nDeseas:" +
                    "\n  1.Ingresar proyecto al protafolio" +
                    "\n  2.Ver los proyectos guardados" +
                    "\n  3.Salir" +
                    "\nIngrese el numero de opcion: ");
            opcionInicial = scanner.nextByte();
            scanner.nextLine();

            if (opcionInicial == 1) {
                System.out.print("\u001B[32mIngrese el nombre del proyecto: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese la descripción del proyecto: ");
                String descripcion = scanner.nextLine();

                System.out.print("Ingrese la fecha del proyecto (Recomendado: dia - mes en letra - año): ");
                String fecha = scanner.nextLine();

                Proyecto nuevoProyecto = new Proyecto(nombre, descripcion, fecha);
                proyectosPortafolio.add(nuevoProyecto);

                System.out.println("¡El proyecto se ha añadido correctamente! \u001B[35m");
            } else {

                System.out.println("\n\u001B[34mViendo proyectos guardados: ");


                for(Proyecto p : proyectosPortafolio){
                    System.out.println(p);
                }
            }
        } while (opcionInicial != 3);

    }
}

class Proyecto {
    String nombreProyecto, descripcionProyecto, fechaProyecto;

    public Proyecto(String nombreProyecto, String descripcionProyecto, String fechaProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.fechaProyecto = fechaProyecto;
    }

        @Override
        public String toString() {
            return "\nNombre del Proyecto: " + nombreProyecto +
                    "\nDescripción: " + descripcionProyecto +
                    "\nFecha: " + fechaProyecto + "\n";
        }
    }

