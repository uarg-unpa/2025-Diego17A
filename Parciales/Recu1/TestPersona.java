package Parciales.Recu1;

import java.util.Scanner;

public class TestPersona {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int aux = 0;

        System.out.println("------Carga de datos de Persona------");
        System.out.println ("Ingrese datos de la persona 1 \nApelldio:");
        String apellido = scanner.nextLine();
        System.out.println ("Edad:");
        int edad = scanner.nextInt();
        System.out.println ("DNI:");
        int dni = scanner.nextInt();
        System.out.print("Ingrese un sexo (Hombre 'H'/Mujer 'M'): ");
        char sexo = scanner.next().charAt(0);
        System.out.println ("Peso:");
        double peso = scanner.nextDouble();
        System.out.println ("Altura:");
        double altura = scanner.nextDouble();

        Persona P1 = new Persona (apellido, edad, dni, sexo, peso, altura);

        scanner.nextLine();

        System.out.println ("Ingrese datos de la persona 2 \nApelldio:");
        String apellido2 = scanner.nextLine();
        System.out.println ("Edad:");
        int edad2= scanner.nextInt();
        System.out.println ("DNI:");
        int dni2 = scanner.nextInt();
        System.out.print("Ingrese un sexo (Hombre 'H'/Mujer 'M'): ");
        char sexo2 = scanner.next().charAt(0);
        System.out.println ("Peso:");
        double peso2 = scanner.nextDouble();
        System.out.println ("Altura:");
        double altura2 = scanner.nextDouble();

        Persona P2 = new Persona (apellido2, edad2, dni2, sexo2, peso2, altura2);

        scanner.nextLine();

        System.out.println("Resultados de IMC de cada Persona");
        if(P1.calcularIMC()== -1){
            System.out.println("La persona 1 esta debajo de su peso ideal");
        }
        else{
            if(P1.calcularIMC()== 0){
                System.out.println("La persona 1 esta en su peso ideal");
            }
            else{
                System.out.println("La persona 1 tiene sobrepeso");
            }
        }
        if(P2.calcularIMC()== -1){
            System.out.println("La persona 1 esta debajo de su peso ideal");
        }
        else{
            if(P2.calcularIMC()== 0){
                System.out.println("La persona 1 esta en su peso ideal");
            }
            else{
                System.out.println("La persona 1 tiene sobrepeso");
            }
        }

        System.out.println("Numero de personas mayores de edad");
        if (P1.esMayorDeEdad()){
            aux++;
            if (P2.esMayorDeEdad()){
                aux++;
            }
        }  
        else{
            if (P2.esMayorDeEdad()){
                aux++;
            }
        }
        System.out.println("La cantidad de personas mayores de 18 años es: " +aux);

        System.out.println("Comparacion de personas por su edad ");
        if (P1.esMayorQue(P2)){
            System.out.println("La persona 1  " + P1.getapellido()+ " es mayor que la persona 2 "+P2.getapellido());
        }
         else{
            System.out.println("La persona  2 " + P2.getapellido()+ " es mayor que la persona 1 "+P1.getapellido());
        } 
        scanner.close();

    }
}
