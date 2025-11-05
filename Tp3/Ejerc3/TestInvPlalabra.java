//Realice un programa que dado el ingreso 
//de una palabra como cadena de caracteres,
// permita visualizarla en forma inversa.
package Tp3.Ejerc3;

import java.util.Scanner;

public class TestInvPlalabra {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        PilaChar palabrainv = new PilaChar(palabra.length());

        for (int i = 0; i <palabra.length(); i++){
            palabrainv.meter(palabra.charAt(i));
        }
        String inversa = "";
        while(!palabrainv.estavacia()){
            inversa = inversa + palabrainv.sacar();
        }
        System.out.println("La palabra invertida es: " + inversa);

        sc.close();
    }
}
