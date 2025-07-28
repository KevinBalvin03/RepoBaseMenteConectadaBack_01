package org.example.PaqueteHistoriasPerfiles;
import java.util.Scanner;

class Persona {
    String nombre;
    String telefono;
    String direccion;
    String correo;
}
public class HU022C5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String edit, campo;
        Byte num;
        int posicion, cantidad;

        System.out.print("¿Cuántas personas deseas registrar?: ");
        cantidad = scanner.nextInt();
        scanner.nextLine();

        if (cantidad>0) {
            Persona[] personas = new Persona[cantidad];


            for (int i = 0; i < cantidad; i++) {
                personas[i] = new Persona();

                System.out.println("\nPersona #" + (i + 1));

                System.out.print("Nombre: ");
                personas[i].nombre = scanner.nextLine();

                while (personas[i].nombre.equals("")){
                    System.out.println("No se puede dejar el espacio de nombre vacio");
                    System.out.print("Ingrese el nombre: ");
                    personas[i].nombre = scanner.nextLine();
                }


                System.out.print("Teléfono: ");
                personas[i].telefono = scanner.nextLine();

                System.out.print("Dirección: ");
                personas[i].direccion = scanner.nextLine();

                System.out.print("Correo: ");
                personas[i].correo = scanner.nextLine();
            }

            System.out.println("\n=== Personas Registradas ===");
            System.out.printf("%-10s %-20s %-15s %-25s %-30s\n", "Código", "Nombre", "Teléfono", "Dirección", "Correo");
            System.out.println("-----------------------------------------------------------------------------------------------");

            for (int i = 0; i < cantidad; i++) {
                System.out.printf("%-10d %-20s %-15s %-25s %-30s\n",
                        (i + 1),
                        personas[i].nombre,
                        personas[i].telefono,
                        personas[i].direccion,
                        personas[i].correo);
            }


            System.out.println("Desea editar algun registro? responda si o no ");
            edit = scanner.nextLine();
            if (edit.equalsIgnoreCase("si")) {
                if (cantidad == 1){
                    System.out.println("Ingrese el codigo del unico registro:");
                } else if (cantidad>1) {
                    System.out.print("Ingrese el numero del registro a editar: entre 1 y " + cantidad + ": ");
                }
                num = scanner.nextByte();
                posicion = num - 1;
                scanner.nextLine();
                if (posicion<=num && num>0 && posicion<cantidad) {

                    System.out.println("Ingrese el nombre del campo a editar o escriba TODO si desea editar todos los datos");
                    campo = scanner.nextLine();
                    scanner.nextLine();
                    if (campo.equalsIgnoreCase("nombre")) {
                        System.out.print("Ingrese el nuevo nombre: ");
                        personas[posicion].nombre = scanner.nextLine();
                        if (personas[posicion].nombre.equalsIgnoreCase("")) {
                            System.out.println("El nombre es un campo obligatorio no se puede dejar en blanco");
                            personas[posicion].nombre = scanner.nextLine();

                        }
                    } else if (campo.equalsIgnoreCase("direccion")) {
                        System.out.print("Ingresa la nueva direccion: ");
                        personas[posicion].direccion = scanner.nextLine();
                    } else if (campo.equalsIgnoreCase("telefono")) {
                        System.out.print("Ingresa el nuevo telefono: ");
                        personas[posicion].telefono = scanner.nextLine();
                    } else if (campo.equalsIgnoreCase("Correo")) {
                        System.out.print("Ingrese el nuevo correo: ");
                        personas[posicion].correo = scanner.nextLine();
                    } else if (campo.equalsIgnoreCase("todo")) {
                        System.out.print("Ingrese el nuevo nombre: ");
                        personas[posicion].nombre = scanner.nextLine();
                        if (personas[posicion].nombre.equalsIgnoreCase("")) {
                            System.out.println("El nombre es un campo obligatorio no se puede dejar en blanco");
                            personas[posicion].nombre = scanner.nextLine();
                        }
                        System.out.print("Ingresa la nueva direccion: ");
                        personas[posicion].direccion = scanner.nextLine();
                        System.out.print("Ingresa el nuevo telefono: ");
                        personas[posicion].telefono = scanner.nextLine();
                        System.out.print("Ingrese el nuevo correo: ");
                        personas[posicion].correo = scanner.nextLine();
                    } else {
                        System.out.println("Ingreso un valor erroneo");
                    }
                    System.out.println("\u001B[32m El cambio fue realizado \u001B[0m");
                    System.out.println("\n=== Personas Registradas ===");
                    System.out.printf("%-10s %-20s %-15s %-25s %-30s\n", "Código", "Nombre", "Teléfono", "Dirección", "Correo");
                    System.out.println("-----------------------------------------------------------------------------------------------");

                    for (int i = 0; i < cantidad; i++) {
                        System.out.printf("%-10d %-20s %-15s %-25s %-30s\n",
                                (i + 1),
                                personas[i].nombre,
                                personas[i].telefono,
                                personas[i].direccion,
                                personas[i].correo);
                    }

                }else {
                    System.out.println("\u001B[31m Se ingreso un valor inexistente \u001B[0m");
                }
            } else {
                System.out.println("\u001B[31m No se edito ningun registro, Gracias \u001B[0m");
            }
        }else {
            System.out.println("\u001B[31m Se ingreso un valor erroneo \u001B[0m");
        }

    }

}
