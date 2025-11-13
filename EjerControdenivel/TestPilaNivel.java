//Implementen una pila de enteros que almacene niveles de energía 
//y un método que cuente cuántas veces aparece un valor X, sin modificar la pila
//El programa debe permitir:Agregar nuevos niveles a la pila.
//Mostrar el nivel que se encuentra en la cima de la pila.
//Pedir al usuario un valor X y contar cuántas veces aparece en la pila.

package EjerControdenivel;

import java.util.Scanner;

public class TestPilaNivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaNivel pila = new PilaNivel();
        int opcion;

        do {
            System.out.println("\n=== MENÚ NIVELES DE ENERGIA===");
            System.out.println("1. AGREGAR NIVEL DE ENERGIA");
            System.out.println("2. SACAR NIVEL DE ENERGIA");
            System.out.println("3. MOSTRAR NIVEL DE ENERGIA EN CIMA");
            System.out.println("4. ESTADO DE CONTROL DE NIVELES (vacía/llena)");
            System.out.println("5. OCURRENCIAS DE UN NIVEL");
            System.out.println("0. SALIR");
            System.out.print("OPCION: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: // Meter elemento
                    if (pila.estallena()) {
                        System.out.println("Error: La pila de nivel está llena.");
                    } else {
                        System.out.print("Ingrese un nivel: ");
                        int num = sc.nextInt();
                        pila.meter(num);
                        System.out.println("Nivel" + num + " agregado.");
                    }
                    break;

                case 2: // Sacar elemento
                    if (pila.estavacia()) {
                        System.out.println("Error: La pila de nivel está vacía.");
                    } else {
                        int elemento = pila.sacar();
                        System.out.println("Nivel sacado: " + elemento);
                    }
                    break;
                
                case 3: 
                    System.out.println("El nivel de energia que esta en la cima es: "+pila.elementoCima());    
                    break;

                 case 4: // Verificar estado
                    System.out.println("¿Vacía? " + pila.estavacia() + " | ¿Llena? " + pila.estallena());
                    break;
                
                case 5: //ocurrencia de un elemento
                    System.out.print("Ingrese un nivel de energia: ");
                    int num = sc.nextInt();
                    System.out.println ("El nivel de energia" + num +" se repite: " + pila.cantOcurrencias(num)+" veces");
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

