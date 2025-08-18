package org.example.PaqueteHistoriasPerfiles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

class Registros{
    String nombre;
    String apellidos;
    String email;
    String direccion;
    LocalDate fechaRegistro;
    Boolean activo;

}

public class HU027C5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Registros> listaRegistro = new ArrayList<Registros>();

        String agregar = "si";
        String preguntaActivo="si";
        validador v = new validador();

        while (agregar.equalsIgnoreCase("si")) {
            Registros registro = new Registros();

            registro.nombre = v.validarCampoVacio("nombre");
            registro.apellidos = v.validarCampoVacio("apellido");
            registro.email = v.validarCampoVacio("correo");

            System.out.println("Ingrese su direccion:");
            registro.direccion = scanner.nextLine();

            registro.fechaRegistro = LocalDate.now();
            System.out.println("La fecha del registro es: " + registro.fechaRegistro);

            registro.activo = v.esActivo();

            listaRegistro.add(registro);

            agregar = v.agregarOtro();

        }


        System.out.printf("%-15s %-15s %-25s %-20s %-15s %-10s\n",
                "Nombre", "Apellidos", "Email", "Dirección", "Fecha registro", "Activo");
        System.out.println("------------------------------------------------------------------------------------------------------");

        for (Registros registro : listaRegistro) {
            System.out.printf("%-15s %-15s %-25s %-20s %-15s %-10s\n",
                    registro.nombre, registro.apellidos, registro.email, registro.direccion, registro.fechaRegistro, registro.activo);
        }
    }
}

