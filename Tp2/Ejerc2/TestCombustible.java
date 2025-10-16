//Una estación de servicio cuenta con una capacidad máxima de 10000 litros. 
//En la estación es posible cargar o reponer combustible. 
//Cuando la capacidad de la estación está por debajo de los 10 litros se debe informar de tal situación. 
//Implemente la clase.
package Tp2.Ejerc2;

import java.util.Scanner;

public class TestCombustible {
    Scanner scanner = new Scanner (System.in);

    public static void main (String[] args){
        //crear objeto
        Combustible Comb1 = new Combustible(100);
        //mostrar estado actal del objeto
        System.out.println(Comb1);
        //reponer combustible
        System.out.println("coloque valor a reponer:");
        //int valrep = scanner.nextInt();
        //Comb1.reponer (valrep);
        Comb1.reponer(1500);
        System.out.println (Comb1);
        System.out.println("coloque valor a cargar:");
        //int litros=scanner.nextInt();
        //Comb1.cargar (litros);
        Comb1.cargar(750);
        System.out.println (Comb1);
    }    

}
