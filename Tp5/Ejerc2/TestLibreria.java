//Crea un gestor de biblioteca que se encargue de 
//administrar la prestación y devolución de libros.
//Implementa una clase GestorLibreria 
//que contenga un listado de libros.
//Define métodos para prestar y devolver libros, 
//asegurando que no se pueda prestar un libro que ya ha sido prestado.
//Implementa un método que liste los libros disponibles.

package Tp5.Ejerc2;

import java.util.Scanner;

public class TestLibreria {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GestorLibreria gestor = new GestorLibreria(50);

        int opcion;

        do {
            System.out.println("\n===== MENU BIBLIOTECA =====");
            System.out.println("1. Agregar libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Listar libros disponibles");
            System.out.println("0. Salir");
            System.out.print("Ingrese opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    gestor.agregarLibro(titulo, autor);
                    break;

                case 2:
                    System.out.print("Ingrese el título del libro a prestar: ");
                    String t1 = sc.nextLine();
                    gestor.prestarLibro(t1);
                    break;

                case 3:
                    System.out.print("Ingrese el título del libro a devolver: ");
                    String t2 = sc.nextLine();
                    gestor.devolverLibro(t2);
                    break;

                case 4:
                    gestor.listarDisponibles();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
