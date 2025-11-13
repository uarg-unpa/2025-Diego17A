package EjercEmpresa;

public class Empleado {
    private String nombre;
    private int legajo;
    private int sueldo;

    public Empleado (String nombre, int legajo, int sueldo){
        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }    
    public void setnombre (String nombre){
        this.nombre = nombre;
    }
    public String getnombre(){
        return this.nombre;
    }    
    public void setlegajo (int legajo){
        this.legajo = legajo;
    }
    public int getlegajo(){
        return this.legajo;        
    }
    public void setsueldo (int sueldo){
        this.sueldo = sueldo;
    }
    public int getsueldo(){
        return this.sueldo;        
    }
    public String toString(){
        return "["+this.nombre+"] Legajo N°: "+this.legajo+" Sueldo: "+this.sueldo+"";   
    }
    public boolean ganaMasQue (Empleado a){
        if ( this.sueldo > a.getsueldo()){
            return true;
        }
        else{
            return false;
        }    
    }
}    


