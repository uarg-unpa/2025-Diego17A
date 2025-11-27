//Escribe un metodo recursivo que calcule 
//la suma de los primero n numeros multiplos de 3.
//ej, si = 15, el resultado debe ser 3 + 6 + 9 + 12 = 45

import java.util.Scanner;

public class EjemParcial3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese n:");
        int n = sc.nextInt();

        System.out.println("La suma de los primeros " + n + " multiplos de 3: " + sumaMultiplo(n));

        sc.close();
    }

    public static int sumaMultiplo(int n) {
        if (n == 1) {
            return 3;
        } else {
            return (3 * n) + sumaMultiplo(n - 1);
        }
    } 
}
