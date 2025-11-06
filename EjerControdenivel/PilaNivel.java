package EjerControdenivel;

public class PilaNivel {
    private int[] elementos;
    private int cima;
    private final int max = 5;

    public PilaNivel(){
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
        PilaNivel pilaaux = new PilaNivel ();
        int aux1 = 0;
        int aux2 = 0;
        while (!estavacia()){
            aux1 = sacar();
            if (aux1 == elemento){
                contador ++;
            }
            pilaaux.meter(aux1);
        }
        while (!pilaaux.estavacia()){
            //meter(pilaaux.sacar());
            aux2 = pilaaux.sacar();  
            meter(aux2);
        }  
        return contador;    
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

