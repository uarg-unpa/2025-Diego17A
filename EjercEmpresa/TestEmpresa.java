//Una empresa desea un programa que permita comparar los sueldos
//de sus empleados.Cada empleado tiene los siguientes datos
//nombre, legajo,sueldo. Definir clase empleados con atributos privados
//metodos que considere y metodo que devuelva true si el empleado actual
//gana mas que el se pasa por parametro. 
//en el main crear 3 empleados cargados manualmente, mostrar info de cada uno
//comparar 2 de ellos mediante el metodo ganamasque
//mostrar por consola msj que indica que empleado gana mas.
package EjercEmpresa;

import java.util.Scanner;

import EjerElector.Elector;

public class TestEmpresa {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("------Carga de datos Empleados------");
        System.out.println ("Ingrese datos del Empleado 1 \nNombre:");
        String nombre = scanner.nextLine();
        System.out.println ("N° de legajo:");
        int legajo = scanner.nextInt();
        System.out.println ("Sueldo:");
        int sueldo = scanner.nextInt();
        
        Empleado A1 = new Empleado (nombre, legajo, sueldo);

        scanner.nextLine();

        System.out.println ("Ingrese datos del Empleado 2 \nNombre:");
        String nombre2 = scanner.nextLine();
        System.out.println ("N° de legajo:");
        int legajo2 = scanner.nextInt();
        System.out.println ("Sueldo:");
        int sueldo2 = scanner.nextInt();
        
        Empleado A2 = new Empleado (nombre2, legajo2, sueldo2);

        scanner.nextLine();

        System.out.println ("Ingrese datos del Empleado 3 \nNombre:");
        String nombre3 = scanner.nextLine();
        System.out.println ("N° de legajo:");
        int legajo3 = scanner.nextInt();
        System.out.println ("Sueldo:");
        int sueldo3 = scanner.nextInt();
        
        Empleado A3 = new Empleado (nombre3, legajo3, sueldo3);

        scanner.nextLine();

        System.out.println("Los empleados cargados son:");
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);

    }    
}
