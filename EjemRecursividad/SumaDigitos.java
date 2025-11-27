//Escrive un metodo recursivo que calcule
//la suma de los digitos de un numero entero positivo
//ej numero = 1234 resultado 1+2+3+4= 10
//el caso base es cuando el numero es 0, la suma es 0
// en caso contrario suma el ultimo digito (n % 10)
//y llama recurisvamente con n / 10

import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo:");
        int n = sc.nextInt();

        System.out.println("La suma de los dígitos es: " + sumaDigitos(n));

        sc.close();
    }

    public static int sumaDigitos(int n) {
        if (n == 0) {               // CASO BASE
            return 0;
        } else {                    // CASO GENERAL
            return (n % 10) + sumaDigitos(n / 10);
        }
    }
}