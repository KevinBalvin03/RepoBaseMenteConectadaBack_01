package org.example.PaqueteHistoriasPerfiles;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Proyectos {
    String nombre;
    String descripcion;
    int year;

    public Proyectos(String nombre, String descripcion, int year) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.year = year;
    }
}
    public class HU032C5 {

        public static void main(String[] args) {
            ArrayList<Proyectos> proyectos = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            // Agregar proyectos
            proyectos.add(new Proyectos("MindCare",
                    "Plataforma digital para seguimiento emocional diario y acompañamiento psicológico.",
                    2024));

            proyectos.add(new Proyectos("Calma App",
                    "Aplicación móvil que ofrece ejercicios de respiración y meditación guiada.",
                    2024));

            proyectos.add(new Proyectos("Comunidad Sana",
                    "Programa comunitario para promover la salud mental en jóvenes.",
                    2023));

            proyectos.add(new Proyectos("Escucha Activa",
                    "Línea telefónica gratuita de apoyo psicológico para emergencias emocionales.",
                    2023));

            proyectos.add(new Proyectos("Mente Libre",
                    "Campaña educativa sobre prevención de la ansiedad y la depresión en colegios.",
                    2025));
            proyectos.add(new Proyectos("Mente Libre",
                    "Campaña educativa sobre prevención de la ansiedad y la depresión en colegios.",
                    2025));

            ArrayList<Proyectos> proyectosDuplicados = new ArrayList<>();
            ArrayList<String> nombresVistos = new ArrayList<>();
            ArrayList<Proyectos> proyectosFiltrados = new ArrayList<>();
            int opcion = 0;
            String contarProyectos = "";

            try {
                System.out.println("\u001B[32m ---MENU--- \u001B[0m");
                System.out.println(" 1. Agregar proyecto" +
                        "\n 2. Editar proyecto" +
                        "\n 3. Eliminar proyecto" +
                        "\n 4. Visualizar todos los proyectos" +
                        "\n 5. Filtrar proyectos por año" +
                        "\n 6. Contar cuantos proyectos hay" +
                        "\n 7. Saber si hay proyectos duplicados" +
                        "\n 8.salir");

                opcion = scanner.nextInt();
                scanner.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("❌ Se ingresó un valor erróneo. Debe escribir un número.");
            }
            while (opcion != 8) {
                if (opcion == 1) {
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del proyecto");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese la descripcion del proyecto");
                    String descripcion = scanner.nextLine();
                    System.out.println("Ingrese el año del proyecto");
                    Integer anoProyecto = scanner.nextInt();
                    proyectos.add(new Proyectos(nombre,descripcion,anoProyecto ));
                } else if (opcion == 2 ) {
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del proyecto que quiere editar");
                    String nombreBuscado = scanner.nextLine();
                    for (int i = 0; i < proyectos.size(); i++) {
                        if (proyectos.get(i).nombre.equalsIgnoreCase(nombreBuscado)) {
                            System.out.println("Ingrese el nuevo nombre");
                            String nuevoNombre = scanner.nextLine();

                            System.out.println("Ingrese la nueva descripción");
                            String nuevaDescripcion = scanner.nextLine();

                            System.out.println("Ingrese el nuevo año");
                            int nuevoano = scanner.nextInt();
                            scanner.nextLine();

                            proyectos.get(i).nombre = nuevoNombre;
                            proyectos.get(i).descripcion = nuevaDescripcion;
                            proyectos.get(i).year = nuevoano;
                        }
                    }

                } else if (opcion == 3 ) {
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del proyecto que quiere eliminar");
                    String nombreBuscado = scanner.nextLine();
                    for (int i = 0; i < proyectos.size(); i++) {
                        if (proyectos.get(i).nombre.equalsIgnoreCase(nombreBuscado)) {
                            proyectos.remove(i);
                            System.out.println("✅ Proyecto eliminado con éxito.");
                        }
                    }
                    System.out.println("Lista de proyectos:");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                    System.out.printf("| %-15s | %-90s | %-4s |\n", "Nombre", "Descripción", "Año");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                    for (Proyectos p : proyectos) {
                        System.out.printf("| %-15s | %-90s | %-4d |\n", p.nombre, p.descripcion, p.year);
                    }
                } else if (opcion == 4 ) {
                    System.out.println("Lista de proyectos:");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                    System.out.printf("| %-15s | %-90s | %-4s |\n", "Nombre", "Descripción", "Año");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                    for (Proyectos p : proyectos) {
                        System.out.printf("| %-15s | %-90s | %-4d |\n", p.nombre, p.descripcion, p.year);
                    }
                } else if (opcion == 5 ) {
                    scanner.nextLine();
                    System.out.println("Ingrese el año al cual quiere filtrar proyectos: ");
                    int ano = scanner.nextInt();
                    for (Proyectos proyecto : proyectos) {
                        if (proyecto.year == ano) {
                            proyectosFiltrados.add(proyecto);
                        }
                    }
                    if (proyectosFiltrados.size() == 0) {
                        System.out.println("No hay proyectos con ese año");
                    } else {
                        for (Proyectos p : proyectosFiltrados) {
                            System.out.printf("| %-15s | %-70s | %-4d |\n", p.nombre, p.descripcion, p.year);
                        }
                    }
                } else if (opcion == 6 ) {
                    //HU030C5
                    if (proyectos == null || proyectos.isEmpty()) {
                        System.out.println("No hay proyectos registrados.");

                    } else {
                        int total = proyectos.size();
                        System.out.println("Cantidad total de proyectos registrados: " + total);
                    }
                } else if (opcion == 7 ) {
                    //HU034C5
                    for (Proyectos proyecto : proyectos) {
                        if (nombresVistos.contains(proyecto.nombre)) {
                            proyectosDuplicados.add(proyecto);
                        } else {
                            nombresVistos.add(proyecto.nombre);
                        }
                    }

                    if (proyectosDuplicados.isEmpty()) {
                        System.out.println("No hay proyectos duplicados");
                    } else {
                        for (Proyectos p : proyectosDuplicados) {
                            System.out.printf("| %-15s | %-70s | %-4d |\n", p.nombre, p.descripcion, p.year);
                        }
                    }

                } else {
                    System.out.println("❌ Se ingresó un valor erróneo. Intente de nuevo.");            // Aquí podrías poner un switch(opcion) { ... }
                }
                try {
                    System.out.println("\u001B[32m ---MENU--- \u001B[0m");
                    System.out.println(" 1. Agregar proyecto" +
                            "\n 2. Editar proyecto" +
                            "\n 3. Eliminar proyecto" +
                            "\n 4. Visualizar todos los proyectos" +
                            "\n 5. Filtrar proyectos por año" +
                            "\n 6. Contar cuantos proyectos hay" +
                            "\n 7. Saber si hay proyectos duplicados" +
                            "\n 8.salir");

                    opcion = scanner.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("❌ Se ingresó un valor erróneo. Debe escribir un número.");
                }

            }
        }
    }


