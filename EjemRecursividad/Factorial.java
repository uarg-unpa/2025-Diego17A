import java.util.Scanner;

public class Factorial {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();

        System.out.println("El factorial de " + n + " es: " + factorial(n));

        sc.close();
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
