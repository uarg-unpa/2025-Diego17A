//Gestión de un Vehículo Diseña una clase Vehiculo con atributos: marca, modelo, y motor 
//(objeto de clase Motor con cilindrada y tipo).
//Puedes agregar otros atributos si lo consideras necesario.
// Incluye un constructor completo, 
//un método esPotente() (boolean, determina la condición para que sea potente),
// un método actualizarTipoMotor() (void, para cambiar el tipo de motor), 
//un método calcularConsumo() (double, determina cómo calcularlo), y toString().
// En main, crea al menos dos objetos (pueden crear más), 
//lee datos para uno con Scanner (marca, modelo, cilindrada, tipo)
// e invoca los métodos para verificar si es potente, 
//actualizar el tipo de motor y calcular el consumo

package Parciales.Parcial1;

import java.util.Scanner;

public class TestVehiculo {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print ("Ingrese datos del primer vehiculo:" + "\nMarca:");
        String marca = scanner.nextLine();
        System.out.print ("Modelo:");
        String modelo = scanner.nextLine();
        System.out.print ("Motor:");
        String motor = scanner.nextLine();
        System.out.print ("Cilindrada:");
        int cilindrada = scanner.nextInt();

        Vehiculo V1 = new Vehiculo(marca,modelo,motor,cilindrada);

        scanner.nextLine();

        System.out.print ("Ingrese datos del segundo vehiculo:" + "\nMarca:");
        String marca2 = scanner.nextLine();
        System.out.print ("Modelo:");
        String modelo2 = scanner.nextLine();
        System.out.print ("Motor:");
        String motor2 = scanner.nextLine();
        System.out.print ("Cilindrada:");
        int cilindrada2 = scanner.nextInt();

        Vehiculo V2 = new Vehiculo(marca2,modelo2,motor2,cilindrada2);

        scanner.nextLine();
        
        System.out.print("Analisis de potencia");
        if (V1.EsPotente()){
            System.out.print("El Vehiculo es potente");
        }
        else{
            System.out.print("El Vehiculo es no potente");
        }

        System.out.println(V1);
        System.out.println(V2);

        System.out.println("Coloque tipo de motor a cambiar en vehivulo 2:");
        String motore = scanner.nextLine();
        V2.actualizarTipoMotor(motore);

        System.out.println(V1);
        System.out.println(V2);

        System.out.println("Consumos en litros/km de cada vehiculo:");

        System.out.println("Vehiculo 1:"+ V1.calcularConsumo()+"litros/km");
        System.out.println("Vehiculo 2:"+ V2.calcularConsumo()+"litros/km");
        
        scanner.close();
    }  
}
