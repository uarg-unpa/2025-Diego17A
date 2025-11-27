//programar un algortimo recursivo que
// permita sumar los elementos de un vector

import java.util.Scanner;

public class EjemParcial5 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cantidad de elementos:");
        int n = sc.nextInt();

        int[] v = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        System.out.println("La suma del vector es: " + sumarVector(v, 0));

        sc.close();
    }

    public static int sumarVector(int[] v, int i) {
        if (i == v.length) {
            return 0;
        } else {
            return v[i] + sumarVector(v, i + 1);
        }
    }
}
