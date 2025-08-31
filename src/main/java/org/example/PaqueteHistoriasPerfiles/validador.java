package org.example.PaqueteHistoriasPerfiles;
import java.util.Scanner;

public class validador {
    Scanner scanner = new Scanner(System.in);

    public String validarCampoVacio(String nombreCampo) {
        String campo = "";

        while (campo.equalsIgnoreCase("")){
            System.out.print("Ingrese el " + nombreCampo + ": ");
            campo = scanner.nextLine();

            if (campo.equalsIgnoreCase("")){
                System.out.println("No se puede dejar el espacio de " + nombreCampo + " vacio");
            }
        }

        return campo;
    }

    public boolean esActivo() {
        String campo = "";
        boolean esActivo = true;

        while (!campo.equalsIgnoreCase("si") && !campo.equalsIgnoreCase("no")){
            System.out.print("El registro no puede ser diferente de (si/no)!");
            System.out.print("¿El registro es una persona activa? (si/no):");
            campo = scanner.nextLine();

            if (campo.equalsIgnoreCase("no")) {
                esActivo = false;
            }
        }

        return esActivo;
    }
    public String agregarOtro() {
        String campo = "";

        while (!campo.equalsIgnoreCase("si") && !campo.equalsIgnoreCase("no")){
            System.out.print("La respuesta no puede ser diferente de (si/no)!");
            System.out.print("¿Desea agregar otro registro? (si/no):");
            campo = scanner.nextLine();

        }

        return campo;
    }
}

