package Parciales.Parcial1;

import java.util.Scanner;

public class TestProducto {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ingrese datos producto 1" + "\nNombre:");
        String nombre = scanner.nextLine();
        System.out.println("Precio:");
        double precio = scanner.nextDouble();
        System.out.println( "Stock disponible:");
        int cantidadenstock = scanner.nextInt();

        Producto P1 = new Producto(nombre, precio, cantidadenstock);

        scanner.nextLine();
     
        System.out.println("Ingrese datos producto 2" + "\nNombre:");
        String nombre2 = scanner.nextLine();
        System.out.println("Precio:");
        double precio2 = scanner.nextDouble();
        System.out.println( "Stock disponible:");
        int cantidadenstock2 = scanner.nextInt();

        Producto P2 = new Producto(nombre2, precio2, cantidadenstock2);

        System.out.println("Ingrese cantidad a vender del producto 1:");
        int cantidad = scanner.nextInt();
        if (P1.hayStock(cantidad)){ // verificar que hay stock
            P1.vender(cantidad);
            System.out.println("se vendio la cantidad, \nstock actualizado: "+P1.getcantidadenstock());
        } 
        else{
            System.out.println("No se pudo vender la cantidad por falta de stock");
        }     
       
        System.out.println("Indique cantidad en que se incremetara el stock del producto 2:");
        int cantidad2 =scanner.nextInt();
        P2.aumentarStock(cantidad2);
        System.out.println("el nuevo stock del producto 2 es de:" + P2.getcantidadenstock());

        if (P1.tieneMasStockQue(P2)){
            System.out.println("el producto "+P1.getnombre()+ " tiene mas stock");
        }
        else if (P2.tieneMasStockQue(P1)){
            System.out.println("el producto "+P2.getnombre()+ " tiene mas stock");
        }   
        else{
            System.out.println("tienen el mismo stock");
        } 
        scanner.close();
    }
}

