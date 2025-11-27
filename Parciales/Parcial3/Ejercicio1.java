package Parciales.Parcial3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cantidad de elementos:");
        int n = scanner.nextInt();

        int[] v = new int[n];

        System.out.println("Ingrese los elementos:");
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }
        System.out.println("Cantidad de negativos: " + contarNeg(v, 0));

        scanner.close();
    }
    public static int contarNeg(int[] v, int i) {
        if (i == v.length) return 0;

        if (v[i] < 0)
            return 1 + contarNeg(v, i + 1);
        else
            return contarNeg(v, i + 1);
    }
}