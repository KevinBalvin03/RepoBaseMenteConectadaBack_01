package org.example.PaqueteHistoriasPerfiles;

import java.util.ArrayList;
import java.util.Scanner;

public class HU029C5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Proyecto29C5> proyectosdePortafolio2 = new ArrayList<>();

        proyectosdePortafolio2.add(new Proyecto29C5("Brigada de Apoyo Psicológico", "Programa de atención gratuita para comunidades vulnerables", "12 - Febrero - 2023"));
        proyectosdePortafolio2.add(new Proyecto29C5("Campaña de Prevención del Suicidio", "Charlas y talleres en colegios y universidades", "05 - Marzo - 2023"));
        proyectosdePortafolio2.add(new Proyecto29C5("Jornadas de Salud Mental Comunitaria", "Sesiones grupales en barrios de bajos recursos", "20 - Abril - 2023"));
        proyectosdePortafolio2.add(new Proyecto29C5("Atención a Víctimas de Desastres", "Apoyo psicológico a personas afectadas por emergencias naturales", "10 - Mayo - 2023"));
        proyectosdePortafolio2.add(new Proyecto29C5("Programa de Escucha Activa", "Espacios de conversación y contención emocional", "01 - Junio - 2023"));
        proyectosdePortafolio2.add(new Proyecto29C5("Red de Voluntariado en Psicología", "Organización de profesionales para brindar ayuda solidaria", "15 - Julio - 2023"));
        proyectosdePortafolio2.add(new Proyecto29C5("Proyecto de Rehabilitación Comunitaria", "Talleres de integración social para personas en recuperación", "30 - Agosto - 2023"));
        proyectosdePortafolio2.add(new Proyecto29C5("Campaña contra el Estigma", "Acciones educativas para reducir la discriminación hacia enfermedades mentales", "12 - Septiembre - 2023"));
        proyectosdePortafolio2.add(new Proyecto29C5("Apoyo Psicológico a Migrantes", "Orientación y contención emocional a familias desplazadas", "25 - Octubre - 2023"));
        proyectosdePortafolio2.add(new Proyecto29C5("Espacios de Resiliencia", "Actividades comunitarias para fortalecer habilidades emocionales", "10 - Noviembre - 2023"));

        String opcionInicial2;


        System.out.println("\n\u001B[35m===  Bienvenido al portafolio de proyectos  ===");


        do {
            System.out.println("\n\u001B[35mActualmente tienes " + proyectosdePortafolio2.size() + " proyectos en la base de datos.");
            System.out.print("\nDeseas:" +
                    "\n  1.Ingresar proyecto al protafolio" +
                    "\n  2.Ver los proyectos guardados" +
                    "\n  3.Exportar documentos" +
                    "\n  4.Salir" +
                    "\nIngrese el numero de opcion: ");
            opcionInicial2 = scanner.nextLine();

            switch (opcionInicial2){
                case "1":
                    Proyecto29C5.agregarProyecto(proyectosdePortafolio2,scanner);
                    break;

                case "2":
                    Proyecto29C5.mostrarProyectos(proyectosdePortafolio2);
                    break;
                    
                case "3":
                    String opcExportacion;
                    System.out.println("\n==  Exportar proyectos  ==");
                    do {
                        System.out.print("\nSeleccione el tipo de exportacion:" +
                                "\n  1. Formato SVG" +
                                "\n  2. Formato de texto plano" +
                                "\n  3.Cancelar" +
                                "\nIngrese el numero de opcion: ");
                        opcExportacion = scanner.nextLine();

                        switch (opcExportacion) {
                            case "1":
                                System.out.println("Exportando proyectos en formato SVG...");
                                Proyecto29C5.expProyectosCsv(proyectosdePortafolio2);
                                break;
                            case "2":
                                Proyecto29C5.expProyectosTxt(proyectosdePortafolio2);
                                break;
                            case "3":
                                System.out.println("Cancelando exportación y volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("\u001B[31m Opción no válida, por favor intente de nuevo. \u001B[0m");
                        }
                    }while (!opcExportacion.equals("3"));

                case "4":
                    break;
            }

        }while (!opcionInicial2.equals("4"));

        }
}



    class Proyecto29C5 {
        String nombreProyecto, descripcionProyecto, fechaProyecto;

        public Proyecto29C5(String nombreProyecto, String descripcionProyecto, String fechaProyecto) {
            this.nombreProyecto = nombreProyecto;
            this.descripcionProyecto = descripcionProyecto;
            this.fechaProyecto = fechaProyecto;
        }

        public static void agregarProyecto(ArrayList<Proyecto29C5> lista, Scanner scanner) {
            System.out.println("\n==  Nuevo proyecto  ==");
            System.out.print("\n\u001B[32mIngrese el nombre del proyecto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la descripción del proyecto: ");
            String descripcion = scanner.nextLine();

            System.out.print("Ingrese la fecha del proyecto (Recomendado: dia - mes en letra - año): ");
            String fecha = scanner.nextLine();

            Proyecto29C5 nuevoProyecto2 = new Proyecto29C5(nombre, descripcion, fecha);
            lista.add(nuevoProyecto2);

            System.out.println("¡El proyecto se ha añadido correctamente! \u001B[35m");
        }

        public static void mostrarProyectos(ArrayList<Proyecto29C5> lista){
            System.out.println("\n\u001B[34m==  Viendo proyectos guardados  ==");

            for (Proyecto29C5 p : lista) {
                System.out.println(p);
            }
        }

        public static void expProyectosTxt(ArrayList<Proyecto29C5> lista){
            System.out.println("\n\u001B[94m==  Exportando en TEXTO PLANO  ==\n");

            System.out.printf("%-40s %-80s %-20s%n", "NOMBRE", "DESCRIPCIÓN", "FECHA");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

            for (Proyecto29C5 p : lista) {
                System.out.printf("%-40s %-80s %-20s%n", p.nombreProyecto, p.descripcionProyecto, p.fechaProyecto);
            }
            System.out.println("\u001B[0m");
        }

        public static void expProyectosCsv(ArrayList<Proyecto29C5> lista){
            System.out.println("\n\u001B[92m==  Exportando en formato CSV ==\n");

            System.out.printf("%-40s | %-80s | %-20s%n" , "NOMBRE", "DESCRIPCIÓN", "FECHA");
            System.out.println("---------------------------------------------------------------------------------" +
                    "---------------------------------------------------------------------");

            for (Proyecto29C5 p : lista) {
                System.out.printf("%-40s | %-80s | %-20s%n", p.nombreProyecto, p.descripcionProyecto, p.fechaProyecto);
                System.out.println("---------------------------------------------------------------------------------" +
                        "---------------------------------------------------------------------");
            }
            System.out.println("\u001B[0m");
        }

        @Override
        public String toString() {
            return "\nNombre del Proyecto: " + nombreProyecto +
                    "\nDescripción: " + descripcionProyecto +
                    "\nFecha: " + fechaProyecto + "\n";
        }
    }
