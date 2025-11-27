import java.util.Scanner;

public class InvertirPalabra {

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = sc.nextLine();

        System.out.println("Palabra invertida: " + invertir(palabra));

        sc.close();
    }

    public static String invertir(String p) {
        if (p.length() <= 1) {
            return p;
        } else {
            return invertir(p.substring(1)) + p.charAt(0);
        }
    }    
}
