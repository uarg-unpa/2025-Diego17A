package Clases.Colas;

import java.util.Scanner;

public class MenuColaC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaCEnteros cola = new ColaCEnteros();
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE COLA ===");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Borrar elemento");
            System.out.println("3. Mostrar elementos de la cola");
            System.out.println("4. Verificar estado (vacía/llena)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: // Meter elemento
                    if (cola.estallena()) {
                        System.out.println("Error: La cola está llena.");
                    } else {
                        System.out.print("Ingrese un número: ");
                        int num = sc.nextInt();
                        cola.insertar(num);
                        System.out.println("Elemento " + num + " agregado.");
                    }
                    break;

                case 2: // Sacar elemento
                    if (cola.estavacia()) {
                        System.out.println("Error: La cola está vacía.");
                    } else {
                        int elemento = cola.borrar();
                        System.out.println("Elemento sacado: " + elemento);
                    }
                    break;
                
                case 3: 
                    System.out.println("Los elemento de la cola son: ");
                    cola.mostrar(); 
                    break;
                    
                 case 4: // Verificar estado
                    System.out.println("¿Vacía? " + cola.estavacia() + " | ¿Llena? " + cola.estallena());
                    break;

                case 0: // Salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}

