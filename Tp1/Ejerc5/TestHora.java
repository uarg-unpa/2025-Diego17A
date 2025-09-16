package Tp1.Ejerc5;
// importas clase scanner para leer datos por consola
import java.util.Scanner;
//clase
public class TestHora {
// main
    public static void main (String [] args){
        //inicilaizar scanner
        Scanner scanner = new Scanner (System.in);
       // pedir datos para crear objeto 1
        System.out.println("Ingrese datos de primer hora");
        System.out.println("Ingrese hora:");
        int hs1=scanner.nextInt();
        System.out.println("Ingrese minutos:");
        int mm1=scanner.nextInt();
        System.out.println("Ingrese segundos:");
        int sg1=scanner.nextInt();
        
        //crear objeto 1 y inicilaizar un objeto
        Hora hora1 = new Hora(hs1, mm1, sg1);

        // pedir datos para crear objeto 
        System.out.println("Ingrese datos de segunda hora");
        System.out.println("Ingrese hora:");
        int hs2=scanner.nextInt();
        System.out.println("Ingrese minutos:");
        int mm2=scanner.nextInt();
        System.out.println("Ingrese segundos:");
        int sg2=scanner.nextInt();
        
        //crear objeto 2 y inicilaizar un objeto
        Hora hora2 = new Hora(hs2, mm2, sg2);

        // mostrar objetos
        System.out.println("la hora 1 es:"+hora1);
        System.out.println("la hora 2 es:"+hora2);
       
        //mostrar metodo hora 1 en minutos
        System.out.println("la hora 1 en minutos es:");
        System.err.println(hora1.horaenMinutos());
        //mostrar metodo hora 2 en minutos
        System.out.println("la hora 2 en minutos es:");
        System.err.println(hora2.horaenMinutos());
        
        // modificar datos hs mm sg por separado
        hora1.seths (9);
        hora1.setmm (28);
        hora1.setsg (28);
        System.out.println ("La hora 1 modificada es:"+hora1);
      
        // obtener datos de objeto
        System.out.println("detalles de hora 2:");
        System.out.println (" hora :" + hora2.geths());
        System.out.println (" minutos :" + hora2.getmm());
        System.out.println (" segundos :" + hora2.getsg());
        
        // cerrar scanner
        scanner.close();


    }
    
}
