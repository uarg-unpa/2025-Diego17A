//Crea un gestor de estacionamiento que administre 
//la entrada y salida de vehículos. El objetivo es 
// simular cómo se gestiona la ocupación de espacios 
// en un estacionamiento.
//Crea una clase ManejadorEstacionamiento 
// que tenga una capacidad máxima de vehículos.
//Definir métodos para registrar la entrada 
// y registrar la salida de vehículos.
//Asegurarse de que no se permita la entrada 
// de más vehículos si el estacionamiento está lleno 
// y que no se pueda registrar una salida 
// si el estacionamiento está vacío.

package Tp5.Ejerc1;

import java.util.Scanner;

public class TestEstacioanmiento {
     public static void main(String[] args) {

        // Creamos scanner para leer datos del usuario
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario la capacidad del estacionamiento
        System.out.println("Ingrese la capacidad máxima del estacionamiento:");
        int capacidad = sc.nextInt();

        // Limpiamos el buffer por la combinación nextInt() + nextLine()
        sc.nextLine();

        // Creamos el gestor usando la capacidad indicada
        ManejadorEstacionamiento gestor = new ManejadorEstacionamiento(capacidad);

        // Variable de opción del menú
        int opcion;

        // Bucle del menú principal
        do {

            // Mostramos opciones para el usuario
            System.out.println("\n===== MENU ESTACIONAMIENTO =====");
            System.out.println("1. Registrar entrada");
            System.out.println("2. Registrar salida");
            System.out.println("3. Mostrar estado");
            System.out.println("0. Salir");
            System.out.println("Seleccione opción:");

            // Leemos la opción
            opcion = sc.nextInt();
            sc.nextLine(); // limpiamos buffer

            // Procesamos según la opción
            switch (opcion) {

                case 1: {
                    // Pedimos patente
                    System.out.println("Ingrese patente del vehículo:");
                    String patente = sc.nextLine();

                    // Registramos entrada
                    gestor.registrarEntrada(patente);
                    break;
                }

                case 2: {
                    // Pedimos patente
                    System.out.println("Ingrese patente del vehículo a retirar:");
                    String patente = sc.nextLine();

                    // Registramos salida
                    gestor.registrarSalida(patente);
                    break;
                }

                case 3:
                    // Mostramos el estado completo
                    gestor.mostrarEstado();
                    break;

                case 0:
                    // Finalizar programa
                    System.out.println("Saliendo...");
                    break;

                default:
                    // Opción incorrecta
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0); // se repite hasta que elija 0 (salir)

        // Cerramos el scanner
        sc.close();
    }
}
