package org.example.PaqueteHistoriasPerfiles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HU024C5 {


    public static void main(String[] args) {
            String opcionMenu;
            String ID, nombre, descripcion, year;
            int opcionEliminar,opcionEditar;


            Scanner scanner = new Scanner(System.in);
            ArrayList<Proyecto> ListaProyectos = new ArrayList<>();

            do {
                System.out.println("\n\u001B[35m=== Bienvenido a ZENITH ===");
                System.out.print("\nQue quieres hacer: " +
                        "\n  1. Agregar proyecto" +
                        "\n  2. Mostrar lista de proyectos" +
                        "\n  3. Salir" +
                        "\nIngrese el numero de opcion: ");
                opcionMenu = scanner.nextLine();


                switch (opcionMenu){
                    case "1":

                        System.out.println("\nEstas en el apartado para crear un proyecto:");
                        System.out.print("Ingresa un ID del proyecto: ");
                        ID = scanner.nextLine();
                        System.out.print("Ingresa el nombre del proyuecto: ");
                        nombre = scanner.nextLine();
                        System.out.print("Ingresa una descripcion del proyecto: ");
                        descripcion = scanner.nextLine();
                        System.out.print("Ingresa el año del proyecto: ");
                        year = scanner.nextLine();

                        Proyecto proyectoNuevo = new Proyecto(ID,nombre,descripcion,year);

                        ListaProyectos.add(proyectoNuevo);

                        System.out.println("El proyecto se ha guardado con exito");

                        break;

                    case "2":
                        if (
                                ListaProyectos.isEmpty()
                        ) {
                            System.out.println("Primero debes agregar proyectos");
                            break;
                        }

                        System.out.println("Estamos en el apartado de mostrar proyectos: ");
                        int numeroProyecto = 1;
                        for (Proyecto p : ListaProyectos){
                            System.out.println("PROYECTO NUMERO " + numeroProyecto);
                            System.out.println(p);
                            numeroProyecto = numeroProyecto +1;
                        }
                        break;

                    case "3":
                        System.out.println("Saliste de sistema");
                        break;
                }

            } while(!opcionMenu.equals("3"));
            scanner.close();
        }
    }


    class Proyecto {

        String ID, nombre, descripcion, year;


        public Proyecto (String ID, String nombre, String descripcion, String year) {
            this.ID = ID;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.year = year;
        }


        @Override
        public String toString() {
            return "📦 Proyecto: " + nombre +
                    "\n🔖 ID: " + ID +
                    "\n📝 Descripción: " + descripcion +

                    "\n📅 year: " + year +

                    "\n---------------------------------------------";
        }

    }

