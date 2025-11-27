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

public class TestEstacionamiento2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la capacidad máxima del estacionamiento:");
        int capacidad = sc.nextInt();
        sc.nextLine();

        ManejadorEstacionamiento2 gestor = new ManejadorEstacionamiento2 (capacidad);

        int opcion;

        do {
            System.out.println("\n===== MENU ESTACIONAMIENTO =====");
            System.out.println("1. Registrar entrada");
            System.out.println("2. Registrar salida");
            System.out.println("3. Mostrar estado");
            System.out.println("0. Salir");
            System.out.println("Seleccione opción:");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese patente del vehículo:");
                    String patente = sc.nextLine();
                    gestor.registrarEntrada(patente);
                    break;
                }

                case 2: {
                    System.out.println("Ingrese patente a retirar:");
                    String patente = sc.nextLine();
                    gestor.registrarSalida(patente);
                    break;
                }

                case 3:
                    gestor.mostrarEstado();
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