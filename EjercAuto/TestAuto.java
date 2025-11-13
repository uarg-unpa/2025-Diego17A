package EjercAuto;

import java.util.Scanner;

public class TestAuto{

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print ("Ingrese datos del primer auto:" + "\nMarca:");
        String marca = scanner.nextLine();
        System.out.print ("Modelo:");
        String modelo = scanner.nextLine();
        System.out.print ("Anio:");
        int anio = scanner.nextInt();
        System.out.print ("Velocidad maxima:");
        int velmax = scanner.nextInt();

        Auto A1 = new Auto (marca, modelo ,anio ,velmax);

        scanner.nextLine();

        System.out.print ("Ingrese datos del primer auto:" + "\nMarca:");
        String marca2 = scanner.nextLine();
        System.out.print ("Modelo:");
        String modelo2 = scanner.nextLine();
        System.out.print ("Anio:");
        int anio2 = scanner.nextInt();
        System.out.print ("Velocidad maxima:");
        int velmax2 = scanner.nextInt();

        Auto A2 = new Auto (marca2, modelo2 ,anio2 ,velmax2);

        scanner.nextLine();

        System.out.print ("Ingrese datos del primer auto:" + "\nMarca:");
        String marca3 = scanner.nextLine();
        System.out.print ("Modelo:");
        String modelo3 = scanner.nextLine();
        System.out.print ("Anio:");
        int anio3 = scanner.nextInt();
        System.out.print ("Velocidad maxima:");
        int velmax3 = scanner.nextInt();

        Auto A3 = new Auto (marca3, modelo3 ,anio3, velmax3);

        scanner.nextLine();

        if (A1.esMasRapidoQue(A2)){
            if (A1.esMasRapidoQue (A3)){
                System.out.println(" El auto mas rapido es el: "+A1.getmarca() +A1.getmodelo() +" con una velocidad maxima de: "+ A1.getvelmax());    
            }
            else{
                
            }

    }
}
