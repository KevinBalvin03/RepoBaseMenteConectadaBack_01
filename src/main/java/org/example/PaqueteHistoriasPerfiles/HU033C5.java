package org.example.PaqueteHistoriasPerfiles;


import java.util.ArrayList;
import java.util.Scanner;

public class HU033C5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<ProyectoHU33C5> proyectosdePortafolioHU033C5 = new ArrayList<>();

        proyectosdePortafolioHU033C5.add(new ProyectoHU33C5("Brigada de Apoyo Psicológico", "Programa de atención gratuita para comunidades vulnerables", "12 - Febrero - 2023"));
        proyectosdePortafolioHU033C5.add(new ProyectoHU33C5("Campaña de Prevención del Suicidio", "Charlas y talleres en colegios y universidades", "05 - Marzo - 2023"));
        proyectosdePortafolioHU033C5.add(new ProyectoHU33C5("Jornadas de Salud Mental Comunitaria", "Sesiones grupales en barrios de bajos recursos", "20 - Abril - 2023"));
        proyectosdePortafolioHU033C5.add(new ProyectoHU33C5("Atención a Víctimas de Desastres", "Apoyo psicológico a personas afectadas por emergencias naturales", "10 - Mayo - 2023"));
        proyectosdePortafolioHU033C5.add(new ProyectoHU33C5("Programa de Escucha Activa", "Espacios de conversación y contención emocional", "01 - Junio - 2023"));
        proyectosdePortafolioHU033C5.add(new ProyectoHU33C5("Red de Voluntariado en Psicología", "Organización de profesionales para brindar ayuda solidaria", "15 - Julio - 2023"));
        proyectosdePortafolioHU033C5.add(new ProyectoHU33C5("Proyecto de Rehabilitación Comunitaria", "Talleres de integración social para personas en recuperación", "30 - Agosto - 2023"));
        proyectosdePortafolioHU033C5.add(new ProyectoHU33C5("Campaña contra el Estigma", "Acciones educativas para reducir la discriminación hacia enfermedades mentales", "12 - Septiembre - 2023"));
        proyectosdePortafolioHU033C5.add(new ProyectoHU33C5("Apoyo Psicológico a Migrantes", "Orientación y contención emocional a familias desplazadas", "25 - Octubre - 2023"));
        proyectosdePortafolioHU033C5.add(new ProyectoHU33C5("Espacios de Resiliencia", "Actividades comunitarias para fortalecer habilidades emocionales", "10 - Noviembre - 2023"));

        System.out.println("\u001B[0m");

        System.out.println("\n\u001B[94m=== Lista de proyectos existentes ===");
        for (ProyectoHU33C5 p : proyectosdePortafolioHU033C5) {
            System.out.println(p.nombreProyecto + " | " + p.descripcionProyecto + " | " + p.fechaProyecto);
        }

        String opcionMenu;
        do {
            System.out.print("\n\u001B[92mIngrese nombre del proyecto o una palabra de él para buscar coincidencias: ");
            String datoBuscar = scanner.nextLine();

            boolean estaEncontrado = false;
            for (ProyectoHU33C5 p : proyectosdePortafolioHU033C5) {
                if (p.nombreProyecto.toLowerCase().contains(datoBuscar.toLowerCase())) {
                    System.out.println("\u001B[36mProyecto encontrado: "
                            + p.nombreProyecto + " | "
                            + p.descripcionProyecto + " | "
                            + p.fechaProyecto);
                    estaEncontrado = true;
                }
            }


            if (!estaEncontrado) {
                System.out.println("\u001B[31mNo se encontraron coincidencias.");
            }

            System.out.print("\n\u001B[93m¿Desea realizar otra búsqueda? (s/n): ");
            opcionMenu = scanner.nextLine();

        } while (opcionMenu.equalsIgnoreCase("s"));

        System.out.println("\n\u001B[31mSaliendo del buscador de proyectos...");

    }
}

class ProyectoHU33C5 {
    String nombreProyecto, descripcionProyecto, fechaProyecto;

    public ProyectoHU33C5(String nombreProyecto, String descripcionProyecto, String fechaProyecto) {
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