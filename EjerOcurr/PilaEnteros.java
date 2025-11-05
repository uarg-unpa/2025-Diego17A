package EjerOcurr;

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
    public int cantOcurrencias (int elemento){
        int contador = 0;
        for(int i=0; i <= cima;i++){
            if (this.elementos[i] == elemento){
                contador ++;
            }
        }
        return contador;
    }
}