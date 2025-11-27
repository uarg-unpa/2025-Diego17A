package Tp2.Ejerc4;

public class Articulo {

    private int precio;
    private int codigo;
    private int stock;

    public Articulo (int precio, int codigo, int stock){
        this.precio = precio;
        this.codigo = codigo;
        this.stock = stock;
    }
    public void setprecio (int precio){
        this.precio = precio;
    }
    public int getcodigo(){
        return this.codigo;
    }
    public void setcodigo (int codigo){
        this.codigo = codigo;
    }
    public int getstock(){
        return this.stock;
    }
    public void setstock (int stock){
        this.stock = stock;
    }
    public int getprecio(){
        return this.precio;
    }
    public  void incrementar (int inc){
        if( this.stock >= 0){
            this.stock = this.stock + inc;
            System.out.println("Stock incrementado");
        }
        else {
            System.out.println("Stock invalido, no es posible incrementar");
        }    
    }
    public void decrementar (int dec){
        if ( this.stock >= dec){
            this.stock = this.stock - dec;
            System.out.println("Stock decrementado");
        }
        else{
            System.out.println("Stock insufiencte, no es posible decrementar");
        }
    }
    public String toString() {
        return "["+this.precio+"]["+this.codigo+"]["+this.stock+"]";
    }

}
