package Parciales.Parcial1;

import java.util.Scanner;

public class TestPc {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Ingrese datos de p1");
        System.out.println ("Ingrese marca:");
        String marca = scanner.nextLine();
        System.out.println ("Ingrese procesador:");
        String procesador = scanner.nextLine();
        System.out.println ("Ingrese precio:");
        double precio = scanner.nextDouble();
        System.out.println ("Ingrese RAM:");
        int ram = scanner.nextInt();

        Pc p1 = new Pc(marca, procesador, precio, ram);

        scanner.nextLine();// limpiar el buffer del scanner
        
        System.out.println ("Ingrese datos de p2");
        System.out.println ("Ingrese marca:");
        String marca2 = scanner.nextLine();
        System.out.println ("Ingrese procesador:");
        String procesador2 = scanner.nextLine();
        System.out.println ("Ingrese precio:");
        double precio2 = scanner.nextDouble();
        System.out.println ("Ingrese RAM:");
        int ram2 = scanner.nextInt();

        Pc p2 = new Pc(marca2, procesador2, precio2, ram2);
    
        System.out.println("Datos PC1:"+p1);
        System.out.println("Datos PC2:"+p2);
       
        System.out.println("Ingrese descuento a aplicar en PC1:");
        double desc = scanner.nextDouble();
        System.out.println("El precio nuevo de PC1 :" + p1.aplicarDescuento(desc));

        // CORREGIDO LO QUE PIDE EL PROFE
        System.out.println("Ingrese descuento a aplicar en PC2:");
        double desc2 = scanner.nextDouble();
        p2.aplicarDescuento2(desc2); //LLAMO AL METODO PARA DESCUENTO (EN EL METODO SE REALIZA EL DESCUENTO Y SE SETEA EL VALOR AL ATRIBUTO)
        System.out.println("El precio nuevo de PC2 :" + p2.getprecio());

        System.out.println("Actualizar la memoria RAM en PC2");
        System.out.println("Nuevo valor de memoria RAM de PC2:" + p2.actualizarRam() + "GB");

        //System.out.println ("la PC1 tiene mayor RAM que PC2:" + mayorRam); ERROR EN EL PARCIAL
        System.out.println ("la PC1 tiene mayor RAM que PC2:" + p1.mayorRam(p2)); // CORREGIDO (INVOCACION AL METODO)

        scanner.close();
    }

}
