package Parciales.Parcial2;

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
    public void mostrar(){
        PilaEnteros aux = new PilaEnteros();
        int elemento, elemento2;
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
    public int contadorPares(){
        int contador = 0;
        PilaEnteros pilaaux = new PilaEnteros ();
        int aux1 = 0;
        int aux2 = 0;
        while (!estavacia()){
            aux1 = sacar();
            if (aux1 % 2 == 0){
                contador ++;
            }
            pilaaux.meter(aux1);
        }
        while (!pilaaux.estavacia()){
            aux2 = pilaaux.sacar();  
            meter(aux2);
        }  
        return contador;    
    }
    public boolean masElementosPares (PilaEnteros a){
        if (this.contadorPares() < a.contadorPares()){
            return true;
        }
        else{
            return false;
        }  
    }
    public int cantOcurrencias (int elemento){
        int contador = 0;
        PilaEnteros pilaaux = new PilaEnteros ();
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
}
