package Parciales.Parcial2;

import java.util.Scanner;

public class TestCola{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaFFChar Q1 = new ColaFFChar();
        PilaChar P1 = new PilaChar();
        PilaChar P2 = new PilaChar();

        PilaChar auxpila = new PilaChar();
        PilaChar auxpila2 = new PilaChar();
        char aux = 0; 
        char aux2 = 0;

        while(!P1.estavacia() && !P2.estavacia()){ 
            aux = P1.sacar();
            Q1.insertar(aux);
            auxpila.meter(aux);
            aux2 = P2.sacar();
            Q1.insertar(aux);
            auxpila2.meter(aux);
        }
        while(!auxpila.estavacia()){
            aux = auxpila.sacar();
            P1.meter (aux);
        }        
        while(!auxpila2.estavacia()){
            aux2 = auxpila2.sacar();
            P2.meter (aux2);
        }      
    }  
}    