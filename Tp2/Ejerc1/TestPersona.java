//Implementar una clase Persona que siga las siguientes condiciones:
//Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos.
//Todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.).
//Se implementarán varios constructores:Un constructor por defecto.Un constructor con el nombre.
//Los métodos que se implementaran son:
//esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
//comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. No será visible al exterior.
//toString(): devuelve toda la información del objeto.
//Testear la clase implementada.

package Tp2.Ejerc1;

import java.util.Scanner;

public class TestPersona {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
       
        Persona p1 = new Persona();
        p1.setnombre("Juan");
        p1.setedad(20);
        //p1.setdni("12345678");
        p1.setsexo('H');
        p1.setpeso(70.5);
        p1.setaltura(1.75);

        // Crear persona con constructor con nombre
        Persona p2 = new Persona("María");
        p2.setedad(16);
        //p2.setdni("87654321A");
        p2.setsexo('M');
        p2.setpeso(55.2);
        p2.setaltura(1.62);

        // Mostrar información
        System.out.println(p1);
        System.out.println("¿Es mayor de edad? " + p1.esMayorDeEdad());

        System.out.println(p2);
        System.out.println("¿Es mayor de edad? " + p2.esMayorDeEdad());
    }
}

