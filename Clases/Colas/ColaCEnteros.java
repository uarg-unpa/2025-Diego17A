package Clases.Colas;

public class ColaCEnteros {
    private final int maxcola=5;
    private int frente, ultimo;
    private int []elementos;
        
    public ColaCEnteros(){
        frente=0;
        ultimo=0;
        elementos=new int[maxcola];
    }
    public boolean estavacia(){
        return (ultimo == frente);
    }
    public boolean estallena(){
        int sigUltimo = siguiente(ultimo);
        return (sigUltimo == frente);
    }
    private int siguiente(int subind){
        if (subind == maxcola - 1){
            return 0;
        }
        else{
            return ++subind;
        }
    }
    public void insertar(int elem){
        ultimo = siguiente(ultimo);
        elementos[ultimo]= elem;
    }
    public int borrar(){
        frente = siguiente(frente);
        return elementos[frente];
    }     
    public void mostrar(){
        ColaCEnteros aux = new ColaCEnteros();
        int elemento, elemento2;
        while(!estavacia()){
            elemento = borrar();
            System.out.print(elemento + "");
            aux.insertar(elemento);    
        }
        while(!aux.estavacia()){
            elemento2 = aux.borrar();
            insertar(elemento2);
            //insertar(aux.borrar());
        }
    }
}

