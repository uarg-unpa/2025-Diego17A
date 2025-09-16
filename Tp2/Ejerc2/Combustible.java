package Tp2.Ejerc2;

public class Combustible{
    private final int capmax = 10000;
    private int litrosactuales;
    // constructor vacio
    public Combustible(){
        this.litrosactuales=0;
    }
    // constructor con validacion de litros entrantes
    public Combustible (int litrosinicial){
        if (litrosinicial > capmax){
            this.litrosactuales = capmax;
        }
        else if (litrosinicial < 0){
            this.litrosactuales = 0;
        }
        else {
            this.litrosactuales = litrosinicial;
        }    
    }    
    // metodo set y get
    public void setlitrosactuales (int litrosactuales){
        this.litrosactuales=litrosactuales;    
    }
    public int getlitrosactuales(){
        return this.litrosactuales;
    }
    public String toString() {
        return  "Estado actual combustible: " + this.litrosactuales + ", Capacidad maxima:" + capmax;         
    }
    //metodos reponer
    public void reponer(int litros) {
        if (litros > 0) {
            this.litrosactuales = this.litrosactuales + litros;
            if (this.litrosactuales > capmax) {
                this.litrosactuales = capmax;
            }
        }
    }
     //metodos cargar
    public void cargar(int litros) {
        if (litros > 0) {
             if (litros <= this.litrosactuales) {
                 this.litrosactuales = this.litrosactuales - litros;
             } else {
                 System.out.println("No hay suficiente combustible para cargar " + litros + " litros.");
             }
         }
    }
}
