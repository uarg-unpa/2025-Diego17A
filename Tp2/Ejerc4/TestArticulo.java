//Un artículo tiene una descripción, un precio, un código, 
//y un stock (cantidad de unidades disponibles del artículo). 
//Implementar las operaciones que permitan decrementar e incrementar el stock.
package Tp2.Ejerc4;

import java.util.Scanner;

public class TestArticulo {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese datos de Articulo 1: \nPrecio: ");
        int precio = scanner.nextInt();
        System.out.println("codigo:");
        int codigo = scanner.nextInt();
        System.out.println("Ingrese cantidad de stock actual del articulo:");
        int stock = scanner.nextInt();

        Articulo a1 = new Articulo(precio, codigo, stock);
        
        System.out.println("valores actuales del articulo:");
        System.out.println(a1);

        System.out.println("Ingerse cantidad a incrementar stock:");
        int inc = scanner.nextInt();
        a1.incrementar(inc);

        System.out.println("Valores actuales del articulo:");
        System.out.println(a1);

        System.out.println("Ingerse cantidad a decrementar stock:");
        int dec = scanner.nextInt();
        a1.decrementar(dec);

        System.out.println("Valores actuales del articulo:");
        System.out.println(a1);

        scanner.close();
    }
}
