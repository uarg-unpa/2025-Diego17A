
package Parciales.Parcial1;

public class Pc {
    private String marca;
    private String procesador;
    private double precio;
    private int ram;
 
    public Pc (String marca, String procesador, double precio, int ram){
        this.marca = marca;
        this.procesador = procesador;
        this.precio = precio;
        this.ram = ram;
    
    }
    public void setmarca (String marca){
        this.marca = marca;
    }
    public String getmarca(){
        return this.marca;
    }
    public void setmprocesador (String procesador){
        this.procesador = procesador;
    }
    public String getmprocesador(){
        return this.procesador;
    }
    public void setmarca (double precio){
        this.precio = precio;
    }
    public double getprecio(){
        return this.precio;
    }
    public void setram (int ram){
        this.ram = ram;
    }
    public int getram(){
        return this.ram;
    }
    public String toString() {
        return "["+this.marca+"]["+this.procesador+"]["+this.precio+"]["+this.ram+"]";

    }
    public  double descPrecio (double desc){
        double precionuevo;
        precionuevo = precio - desc;
        return precionuevo;
    }    
    public int actualizarRam (){
        int ramAct;
        ramAct = ram + 5;
        return ramAct;   
    }
 }    
     
    

    


