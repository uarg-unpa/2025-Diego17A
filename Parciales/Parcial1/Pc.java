
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
    public void setprecio (double precio){
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
    public  double aplicarDescuento (double desc){
        double precionuevo;
        precionuevo = precio - desc;
        return precionuevo;
    }    
    public  void aplicarDescuento2 (double desc2){
        //double precionuevo2;
       // precionuevo2 = this.precio - desc2;   
        //setprecio(precionuevo2);
        this.precio = this.precio - desc2;
    }    
    public int actualizarRam (){
        int ramAct;
        ramAct = ram + 5;
        return ramAct;   
    }
    public boolean mayorRam (Pc p2){
        if (this.getram() > p2.getram()){
        return true;
        }
        else{
            return false;
        }  
    }
}    
     
    

    


