//Escribe un metodo recursivo que calcule 
//la suma de los primero n numeros pares naturales.
//ej, si = 8, el resultado debe ser 2 + 4 + 6 + 8 = 20

import java.util.Scanner;

public class EjemParcial2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese n:");
        int n = sc.nextInt();

        System.out.println("La suma de los primeros " + n + " pares es: " + sumaPares(n));

        sc.close();
    }

    public static int sumaPares(int n) {
        if (n == 1) {
            return 2;
        } else {
            return (2 * n) + sumaPares(n - 1);
        }
    } 
}
