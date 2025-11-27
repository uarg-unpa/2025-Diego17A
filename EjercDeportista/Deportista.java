package EjercDeportista;

public class Deportista {
    private String nombre;
    private int edad;
    private String deporte;
    private int puntos;

    public Deportista (String nombre, int edad, String deporte, int puntos){
        this.nombre = nombre;
        this.edad = edad;
        this.deporte = deporte;
        this.puntos = puntos;
    }
    public void setnombre (String nombre){
        this.nombre = nombre;
    }
    public String getnombre(){
        return this.nombre;
    }    
    public void setedad (int edad){
        this.edad = edad;
    }
    public int getedad(){
        return this.edad;        
    }
    public void setdeporte (String deporte){
        this.deporte = deporte;
    }
    public String getdeporte(){
        return this.deporte;
    }    
    public void setlegajo (int puntos){
        this.puntos = puntos;
    }
    public int getpuntos(){
        return this.puntos;        
    }
    public String toString(){
        return "["+this.nombre+"] Edad: "+this.edad+" Deporte: "+this.deporte+" Puntos: "+this.puntos+"";       
    }
    public boolean esMasExperimentado (Deportista a){
        if ( this.puntos > a.getpuntos()){
            return true;
        }
        else{
            return false;
        }
    }
}


