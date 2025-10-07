package Parciales.Parcial1;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadenstock;

    public Producto (String nombre, double precio, int cantidadenstock){
    this.nombre = nombre;
    this.precio = precio;
    this.cantidadenstock = cantidadenstock;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getnombre(){
        return this.nombre;
    }
    public void setprecio (double precio){
        this.precio = precio;
    }
    public double getprecio(){
        return this.precio;
    }
    public void setcantidadenstock(int cantidadenstock){
        this.cantidadenstock = cantidadenstock;
    }
    public int getcantidadenstock(){
        return this.cantidadenstock;
    }
    public boolean hayStock (int cantidad){
        return (this.cantidadenstock > cantidad);
    }
    public int vender(int cantidad){
        this.cantidadenstock = this.cantidadenstock - cantidad;
        return this.cantidadenstock;
    } 
    public void aumentarStock (int cantidad2){
        this.cantidadenstock = this.cantidadenstock + cantidad2;
    }
    public boolean tieneMasStockQue ( Producto P){
        return (this.cantidadenstock > P.cantidadenstock);
    }

}
