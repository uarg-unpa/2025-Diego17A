
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

        scanner.nextLine();
        
        System.out.println ("Ingrese datos del elector 2 \nNombre:");
        String nombre2 = scanner.nextLine();
        System.out.println ("Apellido:");
        String apellido2 = scanner.nextLine();
        System.out.println ("matricula:");
        String matricula2 = scanner.nextLine();
        System.out.println ("clase:");
        int clase2 = scanner.nextInt();
        System.out.println ("domicilio:");
        String domicilio2 = scanner.nextLine();

        Elector E2 = new Elector(nombre2,apellido2,matricula2,clase2,domicilio2);

        scanner.nextLine();

        System.out.println ("Ingrese datos del elector 3 \nNombre:");
        String nombre3= scanner.nextLine();
        System.out.println ("Apellido:");
        String apellido3 = scanner.nextLine();
        System.out.println ("matricula:");
        String matricula3 = scanner.nextLine();
        System.out.println ("clase:");
        int clase3 = scanner.nextInt();
        System.out.println ("domicilio:");
        String domicilio3 = scanner.nextLine();

        Elector E3 = new Elector(nombre3,apellido3,matricula3,clase3,domicilio3);
        
        scanner.nextLine();

        System.out.println ("Ingrese datos del elector 4 \nNombre:");
        String nombre4 = scanner.nextLine();
        System.out.println ("Apellido:");
        String apellido4 = scanner.nextLine();
        System.out.println ("matricula:");
        String matricula4 = scanner.nextLine();
        System.out.println ("clase:");
        int clase4 = scanner.nextInt();
        System.out.println ("domicilio:");
        String domicilio4 = scanner.nextLine();

        Elector E4 = new Elector(nombre4,apellido4,matricula4,clase4,domicilio4);

        scanner.nextLine();

        System.out.println ("Ingrese datos del elector 5 \nNombre:");
        String nombre5 = scanner.nextLine();
        System.out.println ("Apellido:");
        String apellido5 = scanner.nextLine();
        System.out.println ("matricula:");
        String matricula5 = scanner.nextLine();
        System.out.println ("clase:");
        int clase5 = scanner.nextInt();
        System.out.println ("domicilio:");
        String domicilio5 = scanner.nextLine();

        Elector E5 = new Elector(nombre5,apellido5,matricula5,clase5,domicilio5);
        
        scanner.nextLine();

        System.out.print(E1);
        System.out.print(E2);
        System.out.print(E3);
        System.out.print(E4); System.out.print(E5);

    }
}
