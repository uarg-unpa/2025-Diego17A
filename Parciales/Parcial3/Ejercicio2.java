package Parciales.Parcial3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo:");
        int n = scanner.nextInt();

        System.out.println("La suma de los dígitos es: " + sumarDigitos(n));

        scanner.close();
    }
    public static int sumarDigitos(int n) {
        if (n == 0) {               
            return 0;
        } else {                    
            return (n % 10) + sumarDigitos(n / 10);
        }
    }
}