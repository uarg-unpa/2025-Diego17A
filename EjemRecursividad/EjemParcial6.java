//dado un array de elementos enteros, 
//diseñar 3 algoritmos recursivos que calculen
//el mayor elemento del array
// el producto de los elementos del array
//la cantidad de nuemeros negativos

import java.util.Scanner;

public class EjemParcial6 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos:");
        int n = sc.nextInt();

        int[] v = new int[n];

        System.out.println("Ingrese los elementos:");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        System.out.println("Máximo: " + maximo(v, 0));
        System.out.println("Producto: " + producto(v, 0));
        System.out.println("Negativos: " + contarNegativos(v, 0));

        sc.close();
    }

    public static int maximo(int[] v, int i) {
        if (i == v.length - 1) return v[i];

        int maxResto = maximo(v, i + 1);

        return (v[i] > maxResto) ? v[i] : maxResto;
    }

    public static int producto(int[] v, int i) {
        if (i == v.length) return 1;

        return v[i] * producto(v, i + 1);
    }

    public static int contarNegativos(int[] v, int i) {
        if (i == v.length) return 0;

        if (v[i] < 0)
            return 1 + contarNegativos(v, i + 1);
        else
            return contarNegativos(v, i + 1);
    }
}
