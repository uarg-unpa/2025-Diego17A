package Tp3.Ejerc5;

public class PilaEnteros {
    private int[] elementos;
    private int cima;
    private final int max = 5;

    public PilaEnteros(){
        elementos = new int [max];
        cima = -1;
    }
    public boolean estavacia(){
        return (cima == -1);
    }
    public boolean estallena(){
        return (cima == max - 1);
    }
    public void meter (int elem){
        cima ++;
        elementos [cima] = elem;
    }
    public int sacar(){
        int aux = elementos [cima];
        cima--;
        return aux;
    }
    public int elementoCima (){
        int aux1 = 0;
        int aux2 = 0;
        if(!estavacia()){
            aux1 = sacar();
            aux2 = aux1;    
            meter(aux1);
        }
        return aux2;    
    }
}
