//definir la clase deportista, atributos: nombre,edad,deporte,puntos.
//metodos esmasexperemitneado(deportista otro),esmayor de edad,mostrar datos
//en el main crear 2 deportistas mostrar datos y decir quien tiene mas puntos 
//indicar cuantos son mayor de edad.

package EjercDeportista;

import java.util.Scanner;

public class TestDeportista {
    
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int dep = 0;
        
        System.out.println("------Carga de datos de deportista------");
        System.out.println ("Ingrese datos del deportista 1 \nNombre:");
        String nombre = scanner.nextLine();
        System.out.println ("Deporte:");
        String deporte = scanner.nextLine();
        System.out.println ("Edad:");
        int edad = scanner.nextInt();
        System.out.println ("Puntaje:");
        int puntos = scanner.nextInt();

        Deportista D1 = new Deportista (nombre, edad, deporte, puntos);

        scanner.nextLine();

        System.out.println ("Ingrese datos del deportista 2 \nNombre:");
        String nombre2 = scanner.nextLine();
        System.out.println ("Deporte:");
        String deporte2 = scanner.nextLine();
        System.out.println ("Edad:");
        int edad2 = scanner.nextInt();
        System.out.println ("Puntaje:");
        int puntos2 = scanner.nextInt();
        
        Deportista D2 = new Deportista (nombre2, edad2, deporte2, puntos2);

        System.out.println("Los deportistas cargados son:");
        System.out.println(D1);
        System.out.println(D2);
        
        scanner.nextLine();

        System.out.println("---Comparacion por experiencia/puntaje---");
        if (D1.esMasExperimentado(D2)){
            System.out.println("El Deportista: " + D1.getnombre()+ " tiene mayor puntaje que el deportista "+D2.getnombre());
        }
         else{
            System.out.println("El Deportista: " + D2.getnombre()+ " tiene mayor puntaje que el deportista "+D1.getnombre());
        } 
        if (D1.getedad()>= 18){
            dep++;
            if (D2.getedad()>= 18){
                dep++;
            }
        }  
        else{
            if (D2.getedad()>= 18){
            dep++;
            }
        }
        System.out.println("La cantidad de deportistas mayores de 18 es: " +dep);
        scanner.close();
    }    
}
