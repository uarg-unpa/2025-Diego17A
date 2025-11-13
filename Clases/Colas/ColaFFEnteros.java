package Clases.Colas;

public class ColaFFEnteros {
    private final int maxcola=5;
    private int frente, ultimo;
    private int []elementos;
    
    public ColaFFEnteros(){
        frente=0;
        ultimo=0;
        elementos=new int[maxcola];
    }
    public boolean estavacia(){
        return (ultimo == frente);
    }
    public boolean estallena(){
        return (ultimo == maxcola - 1);
    }
   
    public void insertar(int elem){
        elementos[ultimo]= elem;
        ultimo++;
    }
    public int borrar(){
        int elemento = elementos[frente];
        int i = 0;
        while(i < ultimo){
            elementos[i] = elementos[i+1];
            i++;
        }
        ultimo--;
        return elemento;
    }     
    public void mostrar(){
        ColaFFEnteros aux = new ColaFFEnteros();
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
