import java.util.Scanner;

public class BuscarOcurrencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cantidad de elementos:");
        int n = sc.nextInt();

        int[] v = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        System.out.println("Ingrese el número a buscar:");
        int objetivo = sc.nextInt();

        System.out.println("Cantidad de ocurrencias: " + 
            contarOcurrencias(v, objetivo, 0));

        sc.close();
    }

    public static int contarOcurrencias(int[] v, int objetivo, int i) {
        if (i == v.length) {
            return 0;
        }

        if (v[i] == objetivo) {
            return 1 + contarOcurrencias(v, objetivo, i + 1);
        }

        return contarOcurrencias(v, objetivo, i + 1);
    }
}
