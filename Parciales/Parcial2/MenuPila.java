package Parciales.Parcial2;

import java.util.Scanner;

public class MenuPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaEnteros P1 = new PilaEnteros();
        PilaEnteros P2 = new PilaEnteros();
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE PILA ===");
            System.out.println("1. Meter elemento en pila 1");
            System.out.println("2. Sacar elemento dn pila 1");
            System.out.println("3. Mostrar elementos");
            System.out.println("4. Verificar estado (vacía/llena)");
            System.out.println("5. Contador de pares");
            System.out.println("6. Meter elemento en pila 2");
            System.out.println("7. Sacar elemento en pila 2");
            System.out.println("8. Mayor elementos pares");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: // Meter elemento
                    if (P1.estallena()) {
                        System.out.println("Error: La pila está llena.");
                    } else {
                        System.out.print("Ingrese un número: ");
                        int num = sc.nextInt();
                        P1.meter(num);
                        System.out.println("Elemento " + num + " agregado.");
                    }
                    break;

                case 2: // Sacar elemento
                    if (P1.estavacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        int elemento = P1.sacar();
                        System.out.println("Elemento sacado: " + elemento);
                    }
                    break;

                case 3: 
                    System.out.println("Los elementos de la pila son: ");
                    P1.mostrar(); 
                    break;

                case 4: // Verificar estado
                    System.out.println("¿Vacía? " + P1.estavacia() + " | ¿Llena? " + P1.estallena());
                    break;
                
                case 5: // Verificar estado
                    System.out.println("La cantidad de elementos pares de la píla son: " + P1.contadorPares());
                    break;
                
                case 6: // Meter elemento
                    if (P2.estallena()) {
                        System.out.println("Error: La pila está llena.");
                    } else {
                        System.out.print("Ingrese un número: ");
                        int num = sc.nextInt();
                        P2.meter(num);
                        System.out.println("Elemento " + num + " agregado.");
                    }
                    break;

                case 7: // Sacar elemento
                    if (P2.estavacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        int elemento = P2.sacar();
                        System.out.println("Elemento sacado: " + elemento);
                    }
                    break;    
                case 8:
                System.out.println("La pila 1 tiene mas elementos pares que la pila 2: "+ P1.masElementosPares(P2));     
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