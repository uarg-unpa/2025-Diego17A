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

public class TestEmpresa2 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int opcion;
        String emp1, emp2;

        System.out.println("------Carga de datos de Empleados------");
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

        do{
            System.out.println(" ----COMPARADOR DE SUELDOS----\nSeleccione empleado a comparar");
            System.out.println("1. Empleado 1");
            System.out.println("2. Empleado 2");
            System.out.println("3. Empleado 3");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                System.out.println("Selecione con quien se va a comparar: \n Empleado 2 (A2) o Empleado 3 (A3)");
                emp1 = scanner.nextLine();
                if (emp1.equals("A2")){
                    System.out.println("El empleado 1 gana mas que el empleado 2: " + A1.ganaMasQue(A2));
                }
                else{
                    System.out.println("El empleado 1 gana mas que el empleado 3: " + A1.ganaMasQue(A3));
                }    
                break;

                case 2:
                System.out.println("Selecione con quien se va a comparar: \n Empleado 1 (A1) o Empleado 3 (A3)");
                emp1 = scanner.nextLine();
                if (emp1.equals("A1")){
                    System.out.println("El empleado 2 gana mas que el empleado 1: " + A2.ganaMasQue(A1));
                }
                else{
                    System.out.println("El empleado 2 gana mas que el empleado 3: " + A2.ganaMasQue(A3));
                }   
                break;
                
                case 3:
                System.out.println("Selecione con quien se va a comparar: \n Empleado 1 (A1) o Empleado 2 (A2)");
                emp1 = scanner.nextLine();
                if (emp1.equals("A1")){
                    System.out.println("El empleado 3 gana mas que el empleado 1: " + A3.ganaMasQue(A1));
                }
                else{
                    System.out.println("El empleado 3 gana mas que el empleado 2: " + A3.ganaMasQue(A2));
                }   
                break;

                case 0: // Salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}    

