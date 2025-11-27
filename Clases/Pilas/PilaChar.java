package Clases.Pilas;

public class PilaChar {
    private char[] elementos;
    private int cima;
    private int max;

    public PilaChar(int max){
        this.max = max;
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
    
}
