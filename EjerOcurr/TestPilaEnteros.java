//En un Pila de Enteros implementar el 
//método cantOcurrencias(int elemento) 
//que retorne la cantidad de veces que aparece el elmento 
//que es ingresado por el usuario. 
//La pila debe respetar el principio LIFO. 
//Luego realizar una Clase Test que permita cargar la pila, 
//probar el método, de ser posible que sea tipo Menú.

package EjerOcurr;

import java.util.Scanner;

public class TestPilaEnteros{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PilaEnteros pila = new PilaEnteros();
        
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE PILA ===");
            System.out.println("1. Meter elemento");
            System.out.println("2. Sacar elemento");
            System.out.println("3. Ocurrencias de un elemento");
            System.out.println("4. Verificar estado pila (vacía/llena)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: // Meter elemento
                    if (pila.estallena()) {
                        System.out.println("Error: La pila está llena.");
                    } else {
                        System.out.print("Ingrese un número: ");
                        int num = sc.nextInt();
                        pila.meter(num);
                        System.out.println("Elemento " + num + " agregado.");
                    }
                    break;

                case 2: // Sacar elemento
                    if (pila.estavacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        int elemento = pila.sacar();
                        System.out.println("Elemento sacado: " + elemento);
                    }
                    break;
                case 3: //ocurrencia de un elemento
                    System.out.print("Ingrese un número: ");
                    int num = sc.nextInt();
                    System.out.println ("El elemento" + num +" se repite: " + pila.cantOcurrencias(num)+" veces");
                    break;                

                case 4: // Verificar estado
                    System.out.println("¿Vacía? " + pila.estavacia() + " | ¿Llena? " + pila.estallena());
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