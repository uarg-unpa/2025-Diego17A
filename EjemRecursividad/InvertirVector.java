import java.util.Scanner;

public class InvertirVector {
    
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cantidad de elementos:");
        int n = sc.nextInt();

        int[] v = new int[n];

        System.out.println("Ingrese los elementos:");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        invertirVector(v, 0, v.length - 1);

        System.out.println("Vector invertido:");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        sc.close();
    }

    public static void invertirVector(int[] v, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }

        int aux = v[inicio];
        v[inicio] = v[fin];
        v[fin] = aux;

        invertirVector(v, inicio + 1, fin - 1);
    }
}
