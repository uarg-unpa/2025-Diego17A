package Clases.Gestor;

public class Contacto {
    private String nombre;
    private String mail;

    public Contacto (String nombre, String mail){
        this.nombre = nombre;
        this.mail = mail;
    }
    public void setnombre(String a){
        this.nombre = a;
    }
    public String getnombre(){
        return this.nombre;
    }
    public void setmail(String a){
        this.mail = a;
    }
    public String getmail(){
        return this.mail;
    }
}
