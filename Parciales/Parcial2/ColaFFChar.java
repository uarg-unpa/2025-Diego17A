package Parciales.Parcial2;

public class ColaFFChar {
    private final int maxcola = 11;
    private int frente, ultimo;
    private char []elementos;
    
    public ColaFFChar(){
        frente=0;
        ultimo=0;
        elementos=new char[maxcola];
    }
    public boolean estavacia(){
        return (ultimo == frente);
    }
    public boolean estallena(){
        return (ultimo == maxcola - 1);
    }
   
    public void insertar(char elem){
        elementos[ultimo]= elem;
        ultimo++;
    }
    public char borrar(){
        char elemento = elementos[frente];
        int i = 0;
        while(i < ultimo){
            elementos[i] = elementos[i+1];
            i++;
        }
        ultimo--;
        return elemento;
    }     
    public void mostrar(){
        ColaFFChar aux = new ColaFFChar();
        char elemento, elemento2;
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
