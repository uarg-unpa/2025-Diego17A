//Escribe un metodo recursivo que calcule 
//el maximo elemento en un vector de enteros

import java.util.Scanner;

public class EjemParcial4 {

      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos:");
        int n = sc.nextInt();

        int[] v = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        System.out.println("El máximo del vector es: " + maximo(v, 0));

        sc.close();
    }

    public static int maximo(int[] v, int i) {
        if (i == v.length - 1) {
            return v[i];
        } else {
            int maxDelResto = maximo(v, i + 1);
            if (v[i] > maxDelResto)
                return v[i];
            else
                return maxDelResto;
        }
    } 
}
