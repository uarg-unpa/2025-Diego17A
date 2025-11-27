package Parciales.Parcial2;

public class PilaChar {
    private char[] elementos;
    private int cima;
    private final int max = 5;

    public PilaChar(){
        elementos = new char [max];
        cima = -1;
    }
    public boolean estavacia(){
        return (cima == -1);
    }
    public boolean estallena(){
        return (cima == max - 1);
    }
    public void meter (char elem){
        cima ++;
        elementos [cima] = elem;
    }
    public char sacar(){
        char aux = elementos [cima];
        cima--;
        return aux;
    }
    public void mostrar(){
        PilaChar aux = new PilaChar();
        char elemento, elemento2;
        while(!estavacia()){
            elemento = sacar();
            System.out.print(elemento + "");
            aux.meter(elemento);    
        }
        while(!aux.estavacia()){
            elemento2 = aux.sacar();
            meter (elemento2);
            //insertar(aux.borrar());
        }
    }
    
}
