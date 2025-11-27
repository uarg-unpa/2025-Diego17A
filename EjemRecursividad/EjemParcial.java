//Escribe un metodo recursivo que calcule a^b 
//(a elevado a la potencia b). 
// por ejemplo 2^3 deberia devolver 8

import java.util.Scanner;

public class EjemParcial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese a:");
        int a = sc.nextInt();

        System.out.println("Ingrese b:");
        int b = sc.nextInt();

        System.out.println("Resultado: " + potencia(a, b));

        sc.close();
    }

    public static int potencia(int a, int b) {
        if (b == 0) { 
            return 1;
        } else {
            return a * potencia(a, b - 1);
        }
    }
}
