package Parciales.Parcial1;

import java.util.Scanner;

public class TestRectangulo {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Ingrese datos de Rectangulo R1");
        System.out.println( "Ingrese base del rectangulo:");
        Double base = scanner.nextDouble();
        System.out.println("Ingese altura del rectangulo:");
        double altura = scanner.nextDouble();

        Rectangulo R1 = new Rectangulo(base, altura);

        scanner.nextLine();

        System.out.println( "Ingrese datos de Rectangulo R2");
        System.out.println( "Ingrese base del rectangulo:");
        Double base2 = scanner.nextDouble();
        System.out.println("Ingese altura del rectangulo:");
        double altura2 = scanner.nextDouble();

        Rectangulo R2 = new Rectangulo(base2, altura2);

        System.out.println("El area del recatangulo R1 es: " + R1.calcularArea());
        System.out.println("El perimetro del rectangulo R2 es: " + R2.calcularPerimetro());
        System.out.println("El area de R1 es mayor a la de R2: "+ R1.esMayorElArea(R2));

        // otra opcion
        if (R1.esMayorElArea2(R2)) {
            System.out.println("R1 tiene un área mayor que R2.");
        } else if (R2.esMayorElArea2(R1)) {
            System.out.println("R2 tiene un área mayor que R1.");
        } else {
            System.out.println("Ambos rectángulos tienen el mismo área.");
        }
        scanner.close();
    }
    
}
