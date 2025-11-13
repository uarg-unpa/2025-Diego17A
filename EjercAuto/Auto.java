package EjercAuto;

public class Auto {
    
    private String marca;
    private String modelo;
    private int anio;
    private int velmax;

    public Auto (String marca, String modelo, int anio, int velmax ){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velmax = velmax;
    }
    public void setmarca (String marca){
        this.marca = marca;
    }
    public String getmarca(){
        return this.marca;
    }    
    public void setmodelo (String modelo){
        this.modelo = modelo;
    }
    public String getmodelo(){
        return this.modelo;        
    }
    public void setanio (int anio){
        this.anio = anio;
    }
    public int getanio(){
        return this.anio;        
    }
    public void setvelmax (int velmax){
        this.velmax = velmax;
    }
    public int getvelmax(){
        return this.velmax;        
    }
    public String toString(){
        return "Marca: "+this.marca+" Modelo: "+this.modelo+" anio: "+this.anio+" Vel. maxima: "+this.velmax+"";       
    }
    public boolean esMasRapidoQue (Auto a){
        if ( this.velmax > a.getvelmax()){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean esAutoClasico (){
        if ( this.anio < 2000 ){
            return true;
        }
        else{
            return false;
        }  
    }
    public void MostrarInfo (){
        System.out.println ("Marca: "+this.marca);
        System.out.println ("Marca: "+this.modelo);
        System.out.println ("Marca: "+this.anio);
        System.out.println ("Marca: "+this.velmax);
    }
}
