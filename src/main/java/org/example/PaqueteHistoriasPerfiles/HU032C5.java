package org.example.PaqueteHistoriasPerfiles;

import java.util.ArrayList;
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
            Scanner scanner=new Scanner(System.in);
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
            System.out.println("Ingrese el año al cual quiere filtrar proyectos: ");
            int ano = scanner.nextInt();
            ArrayList<Proyectos> proyectosFiltrados = new ArrayList<>();

            for (Proyectos proyecto : proyectos) {
                if (proyecto.year == ano){
                    proyectosFiltrados.add(proyecto);
                }
            }if (proyectosFiltrados.size() == 0){
                System.out.println("No hay proyectos con ese año");
            }else {
                for (Proyectos p : proyectosFiltrados) {
                    System.out.printf("| %-15s | %-70s | %-4d |\n", p.nombre, p.descripcion, p.year);
                }
            }
        }
    }

