package org.example.PaqueteHistoriasPerfiles;

import java.util.ArrayList;
import java.util.Scanner;

public class HU026C5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Proyecto26C5> proyectosdePortafolio2 = new ArrayList<>();

        proyectosdePortafolio2.add(new Proyecto26C5("Brigada de Apoyo Psicológico", "Programa de atención gratuita para comunidades vulnerables", "12 - Febrero - 2023"));
        proyectosdePortafolio2.add(new Proyecto26C5("Campaña de Prevención del Suicidio", "Charlas y talleres en colegios y universidades", "05 - Marzo - 2023"));
        proyectosdePortafolio2.add(new Proyecto26C5("Jornadas de Salud Mental Comunitaria", "Sesiones grupales en barrios de bajos recursos", "20 - Abril - 2023"));
        proyectosdePortafolio2.add(new Proyecto26C5("Atención a Víctimas de Desastres", "Apoyo psicológico a personas afectadas por emergencias naturales", "10 - Mayo - 2023"));
        proyectosdePortafolio2.add(new Proyecto26C5("Programa de Escucha Activa", "Espacios de conversación y contención emocional", "01 - Junio - 2023"));
        proyectosdePortafolio2.add(new Proyecto26C5("Red de Voluntariado en Psicología", "Organización de profesionales para brindar ayuda solidaria", "15 - Julio - 2023"));
        proyectosdePortafolio2.add(new Proyecto26C5("Proyecto de Rehabilitación Comunitaria", "Talleres de integración social para personas en recuperación", "30 - Agosto - 2023"));
        proyectosdePortafolio2.add(new Proyecto26C5("Campaña contra el Estigma", "Acciones educativas para reducir la discriminación hacia enfermedades mentales", "12 - Septiembre - 2023"));
        proyectosdePortafolio2.add(new Proyecto26C5("Apoyo Psicológico a Migrantes", "Orientación y contención emocional a familias desplazadas", "25 - Octubre - 2023"));
        proyectosdePortafolio2.add(new Proyecto26C5("Espacios de Resiliencia", "Actividades comunitarias para fortalecer habilidades emocionales", "10 - Noviembre - 2023"));

        String opcionInicial2;

        System.out.println("\n===  Bienvenido al portafolio de proyectos  ===");

        do {
            System.out.println("\nActualmente tienes " + proyectosdePortafolio2.size() + " proyectos en la base de datos.");
            System.out.print("\nDeseas:" +
                    "\n  1.Ver los proyectos guardados" +
                    "\n  2.Modificar un proyecto" +
                    "\n  3.Salir" +
                    "\nIngrese el numero de opcion: ");
            opcionInicial2 = scanner.nextLine();

            switch (opcionInicial2){
                case "1":
                    Proyecto26C5.mostrarProyectos(proyectosdePortafolio2);
                    break;
                case "2":
                    Proyecto26C5.modificarProyecto(proyectosdePortafolio2, scanner);
                    break;
                case "3":
                    System.out.println("\n¡Gracias por usar el gestor de proyectos!");
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, intente de nuevo.");
            }
        } while (!opcionInicial2.equals("3"));

        scanner.close();
    }
}

class Proyecto26C5 {
    String nombreProyecto, descripcionProyecto, fechaProyecto;

    public Proyecto26C5(String nombreProyecto, String descripcionProyecto, String fechaProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.fechaProyecto = fechaProyecto;
    }

    public static void mostrarProyectos(ArrayList<Proyecto26C5> lista){
        System.out.println("\n==  Viendo proyectos guardados  ==");

        if (lista.isEmpty()) {
            System.out.println("\nNo hay proyectos guardados.");
            return;
        }

        for (Proyecto26C5 p : lista) {
            System.out.println(p);
        }
    }

    // Nuevo método para modificar un proyecto con confirmación visual

    public static void modificarProyecto(ArrayList<Proyecto26C5> lista, Scanner scanner) {
        System.out.println("\n==  Modificar un proyecto  ==");
        if (lista.isEmpty()) {
            System.out.println("\nNo hay proyectos para modificar.");
            return;
        }

        // Muestra la lista de proyectos con sus índices
        System.out.println("\nProyectos disponibles:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i).nombreProyecto);
        }

        System.out.print("\nIngrese el número del proyecto a modificar: ");
        String seleccion = scanner.nextLine();
        int indice = -1;
        try {
            indice = Integer.parseInt(seleccion) - 1;
        } catch (NumberFormatException e) {
            System.out.println("\nEntrada no válida. Por favor, ingrese un número.");
            return;
        }

        if (indice >= 0 && indice < lista.size()) {
            Proyecto26C5 proyectoSeleccionado = lista.get(indice);

            System.out.println("\n--- Proyecto seleccionado ---");
            System.out.println(proyectoSeleccionado);

            System.out.println("\nIngrese la nueva información (deje en blanco para no cambiar):");
            System.out.print("Nuevo nombre del proyecto: ");
            String nuevoNombre = scanner.nextLine();
            System.out.print("Nueva descripción del proyecto: ");
            String nuevaDescripcion = scanner.nextLine();
            System.out.print("Nueva fecha del proyecto: ");
            String nuevaFecha = scanner.nextLine();

            // Crear un objeto temporal para mostrar la información actualizada
            String nombreFinal = nuevoNombre.isEmpty() ? proyectoSeleccionado.nombreProyecto : nuevoNombre;
            String descripcionFinal = nuevaDescripcion.isEmpty() ? proyectoSeleccionado.descripcionProyecto : nuevaDescripcion;
            String fechaFinal = nuevaFecha.isEmpty() ? proyectoSeleccionado.fechaProyecto : nuevaFecha;

            Proyecto26C5 proyectoTemporal = new Proyecto26C5(nombreFinal, descripcionFinal, fechaFinal);

            // Muestra el resumen visual de los cambios
            System.out.println("\n--- Resumen de Cambios ---");
            System.out.println("Información Original:");
            System.out.println(proyectoSeleccionado);
            System.out.println("\nInformación Actualizada (no guardada):");
            System.out.println(proyectoTemporal);

            // Solicita confirmación
            System.out.print("¿Desea guardar los cambios? (si/no): ");
            String confirmacion = scanner.nextLine();

            // Aplica los cambios si se aprueba
            if (confirmacion.equalsIgnoreCase("si")) {
                proyectoSeleccionado.nombreProyecto = nombreFinal;
                proyectoSeleccionado.descripcionProyecto = descripcionFinal;
                proyectoSeleccionado.fechaProyecto = fechaFinal;
                System.out.println("\nCambios guardados exitosamente!");
            } else {
                System.out.println("\nCambios cancelados. El proyecto no ha sido modificado.");
            }

        } else {
            System.out.println("\nNúmero de proyecto no válido. Por favor, intente de nuevo.");
        }
    }

    @Override
    public String toString() {
        return "\nNombre del Proyecto: " + nombreProyecto +
                "\nDescripción: " + descripcionProyecto +
                "\nFecha: " + fechaProyecto + "\n";
    }
}
