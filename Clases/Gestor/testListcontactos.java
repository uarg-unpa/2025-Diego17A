package Clases.Gestor;

import java.util.Scanner;

public class testListcontactos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int opcion = 0;
        gestorListaContactos listaContactos1 = new gestorListaContactos(50);

        do{
            System.out.println("\n=== MENÚ LISTA DE CONTACTOS===");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Sacar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese datos de contacto:");
                    System.out.println("--------------------");
                    System.out.println("Nombre:");
                    String nombre = scanner.nextLine();
                    System.out.println("Correo electronico:");
                    String mail = scanner.nextLine();
                    Contacto contacto1 = new Contacto(nombre, mail);
                    listaContactos1.agergarContacto(contacto1);
                    break;

                case 0: // Salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

    scanner.close();
    }
}    
