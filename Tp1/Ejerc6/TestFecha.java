//Una fecha se compone de 3 elementos: día, mes y año. 
//Codificar la clase Fecha con los siguientes métodos:
//a) Cuando se crea el objeto de la clase Fecha, los valores de día, mes y año deben ser válidos 
//(es decir, una fecha correcta). Si alguno es inválido, generar la fecha 01/01/2013.
//b) Devolver el día; devolver el mes; devolver el año.
//c) Cambiar el día; cambiar el mes; cambiar el año.
//d) Obtener el nombre del mes de la fecha (ejemplo: si el mes es 1, obtener Enero).
//e) Mostrar la fecha de la siguiente forma: 1 de Setiembre de 2012.

package Tp1.Ejerc6;

import java.util.Scanner;

public class TestFecha{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese datos de la primera fecha");
        System.out.println("Ingrese dia:");
        int dia1=scanner.nextInt();
        System.out.println("Ingrese numero de mes:");
        int mes1=scanner.nextInt();
        System.out.println("Ingrese anio:");
        int anio1=scanner.nextInt();

        Fecha fecha1 = new Fecha(dia1, mes1, anio1);

        System.out.println("Ingrese datos de la segunda fecha");
        System.out.println("Ingrese dia:");
        int dia2=scanner.nextInt();
        System.out.println("Ingrese numero de mes:");
        int mes2=scanner.nextInt();
        System.out.println("Ingrese anio:");
        int anio2=scanner.nextInt();

        Fecha fecha2 = new Fecha(dia2, mes2, anio2);

        System.out.println("la fecha 1 es:"+fecha1);
        System.out.println("la fecha 2 es:"+fecha2);
        System.out.println(fecha1.obtenerMes());
        System.out.println ("mes" + fecha1.getmes()+ "( "+ fecha1.obtenerMes() +")");

        Fecha mayor = fecha1.mayorAnio(fecha2);
        System.out.println ("La fecha con mayot año es: "+mayor);

        scanner.close();
    }
}