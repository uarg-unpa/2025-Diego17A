package EjerElector;

public class Elector {
    private String nombre;
    private String apellido;
    private String matricula;
    private int clase;
    private String domicilio;

    public Elector (String nombre, String apellido, String matricula, int clase, String domicilio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.clase = clase;
        this.domicilio = domicilio;
    }
    public void setnombre (String nombre){
        this.nombre = nombre;
    }
    public String getnombre(){
        return this.nombre;
    }   
    public void setapellido (String apellido){
        this.apellido = apellido;
    }
    public String getapellido(){
        return this.apellido;
    }   
    public void setmatriucla (String matricula){
        this.matricula = matricula;
    }
    public String getmatricula(){
        return this.matricula;
    }
    public void setdomicilio (String domicilio){
        this.domicilio = domicilio;
    }
    public String getdomicilio(){
        return this.domicilio;
    }     
    public void setclase (int clase){
        this.clase = clase;
    }
    public int getclase(){
        return this.clase;
    }     
    public String toString(){
        return "["+this.nombre+"]["+this.apellido+"]["+this.matricula+"]["+this.domicilio+"]["+this.clase+"]";   
    }
    
}
