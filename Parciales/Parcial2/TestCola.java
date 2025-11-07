//Desde el metodo main, dadas dos pilas de caracteres iguales
//generar una cola de caracteres resultantes de intercalar 
//los elmenentos de ambas pilas
//y que las pilas queden como estaban originalmente
package Parciales.Parcial2;

import java.util.Scanner;

public class TestCola{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaFFChar Q1 = new ColaFFChar();
        PilaChar P1 = new PilaChar();
        PilaChar P2 = new PilaChar();
        int opcion;

        PilaChar auxpila = new PilaChar();
        PilaChar auxpila2 = new PilaChar();
        char aux = 0; 
        char aux2 = 0;

        do {
            System.out.println("\n=== MENÚ DE COLA ===");
            System.out.println("1. Meter elemento en pila 1");
            System.out.println("2. Sacar elemento dn pila 1");
            System.out.println("3. Mostrar elementos pila 1");
            System.out.println("4. Verificar estado P1 (vacía/llena)");
            System.out.println("5. Meter elemento en pila 2");
            System.out.println("6. Sacar elemento en pila 2");
            System.out.println("7. Mostrar elementos pila 2");
            System.out.println("8. Verificar estado P2 (vacía/llena)");
            System.out.println("9. Mostrar elementos de la cola");
            System.out.println("10. Verificar estado de cola (vacía/llena)");
            System.out.println("11. Llenar cola intercalando ambas pilas");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: // Meter elemento p1
                    if (P1.estallena()) {
                        System.out.println("Error: La pila está llena.");
                    } else {
                        System.out.print("Ingrese un caracter: ");
                        char num = sc.next().charAt(0);//para leer un caracter
                        P1.meter(num);
                        System.out.println("Caracter " + num + " agregado.");
                    }
                    break;

                case 2: // Sacar elemento p1
                    if (P1.estavacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        char elemento = P1.sacar();
                        System.out.println("Caracter sacado: " + elemento);
                    }
                    break;

                case 3: //mostrar caracteres en p1 
                    System.out.println("Los caracteres de la pila 1 son: ");
                    P1.mostrar(); 
                    break;

                case 4: // Verificar estado p2
                    System.out.println("¿Vacía? " + P1.estavacia() + " | ¿Llena? " + P1.estallena());
                    break;
                
                case 5: // meter elemento p2
                    if (P2.estallena()) {
                        System.out.println("Error: La pila está llena.");
                    } 
                    else {
                    System.out.print("Ingrese un caracter: ");
                    char num = sc.next().charAt(0);//para leer un caracter
                    P2.meter(num);
                    System.out.println("Caracter " + num + " agregado.");
                    }
                    break;
                
                case 6: // sacar elemento p2
                    if (P2.estavacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        char elemento = P2.sacar();
                        System.out.println("Caracter sacado: " + elemento);
                    }
                    break;

                case 7: // mostrar elementos p2
                    System.out.println("Los caracteres de la pila 2 son: ");
                    P2.mostrar(); 
                    break;   
                
                case 8: // Verificar estado p2
                    System.out.println("¿Vacía? " + P2.estavacia() + " | ¿Llena? " + P2.estallena());
                    break;
            
                case 9: // mostrar elementos q1
                    System.out.println("Los elementos de la cola son: ");
                    Q1.mostrar(); 
                    break;

                case 10: // Verificar estado Q1
                    System.out.println("¿Vacía? " + Q1.estavacia() + " | ¿Llena? " + Q1.estallena());
                    break;

                case 11: //llenar cola con las 2 pilas intercaladas
                    while(!P1.estavacia() && !P2.estavacia()){ 
                        aux = P1.sacar();
                        Q1.insertar(aux);
                        auxpila.meter(aux);
                        aux2 = P2.sacar();
                        //Q1.insertar(aux); error en el parcial lpm
                        Q1.insertar(aux2);
                        //auxpila2.meter(aux); error en el parcial lpm 
                        auxpila2.meter(aux2);
                    }
                    while(!auxpila.estavacia()){
                        aux = auxpila.sacar();
                        P1.meter (aux);
                    }        
                    while(!auxpila2.estavacia()){
                        aux2 = auxpila2.sacar();
                        P2.meter (aux2);
                    }
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
