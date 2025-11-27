//Escribe un metodo recursivo que calcule 
// //el minimo elemento en un vector de enteros

import java.util.Scanner;

public class MinimoElem {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos:");
        int n = sc.nextInt();

        int[] v = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        System.out.println("El mínimo del vector es: " + minimo(v, 0));

        sc.close();
    }

    public static int minimo(int[] v, int i) {
        if (i == v.length - 1) {
            return v[i];
        }

        int minResto = minimo(v, i + 1);

        if (v[i] < minResto)
            return v[i];
        else
            return minResto;
    } 
}
