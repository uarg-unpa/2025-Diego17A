import java.util.Scanner;

public class ContarVocales {

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = sc.nextLine();

        int cantidad = contarVocales(palabra, 0, 0);

        System.out.println("Cantidad de vocales: " + cantidad);

        sc.close();
    }

    public static int contarVocales(String p, int i, int cont) {
        if (i == p.length()) {
            return cont;
        }

        if (p.charAt(i) == 'a' || p.charAt(i) == 'e' || p.charAt(i) == 'i' ||
            p.charAt(i) == 'o' || p.charAt(i) == 'u' ||
            p.charAt(i) == 'A' || p.charAt(i) == 'E' || p.charAt(i) == 'I' ||
            p.charAt(i) == 'O' || p.charAt(i) == 'U') {

            return contarVocales(p, i + 1, cont + 1);
        }

        return contarVocales(p, i + 1, cont);
    }   
}
