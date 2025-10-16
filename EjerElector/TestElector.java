
//Crea una clase Elector con atributos:nombre // ejemplo Marta,apellido // ejemplo Saldía
//matrícula // ejemplo 23493749,clase // 1956,domicilio // Libertad 1099
//Incluye:constructor completo,métodos gets y sets,toString()
//Test:En main, usa Scanner para leer datos y crear 5 objetos de tipo Elector.
//En alguno de los objetos creados, prueba cambiar el nombre, la matrícula o los datos que quieras.
//Muestra los datos antes y después de hacer los cambios.

package EjerElector;

import java.util.Scanner;

public class TestElector {
    
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Ingrese datos del elector 1 \nNombre:");
        String nombre = scanner.nextLine();
        System.out.println ("Apellido:");
        String apellido = scanner.nextLine();
        System.out.println ("matricula:");
        String matricula = scanner.nextLine();
        System.out.println ("clase:");
        int clase = scanner.nextInt();
        System.out.println ("domicilio:");
        String domicilio = scanner.nextLine();

        Elector E1 = new Elector(nombre,apellido,matricula,clase,domicilio);
        


    }
    
}
