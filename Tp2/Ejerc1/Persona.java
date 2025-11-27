
package Tp2.Ejerc1;
//clase
public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;
    //contrucutor por defecto
    public Persona (){
        this.nombre= "";
        this.edad=0;
        this.dni=0;
        this.sexo='h';
        this.peso=0.0;
        this.altura=0.0;
    }
    //constructor con nombre
    public Persona (String nombre){
        this.nombre=nombre;
        this.edad=0;
        this.dni=0;
        this.sexo='h';
        this.peso=0.0;
        this.altura=0.0;
    }
    //get y set
    public void setnombre(String a){
        this.nombre = a;
     }
    public String getnombre(){
        return this.nombre;
    }
    public void setedad(int e){
        this.edad = e;
    }
    public int getedad(){
        return this.edad;
    }
    public void setdni(int dni){
        this.dni = dni;
    }
    public int getdni(){
        return this.dni;
    }
    public void setsexo(char s){
        this.sexo = s;
    }
    public char getsexo(){
        return this.sexo;
    }
    public void setpeso(double p){
        this.peso = p;
    }
    public double getpeso(){
        return this.peso;
    }
    public void setaltura(double al){
        this.altura = al;
    }
    public double getaltura(){
        return this.altura;
    }
    //metodo mayor de edad
    public boolean esMayorDeEdad(){
        if (this.edad >= 18){
           return true;
        }
        else{
           return false;
        }
     }
     //metodo comprobar sexo
     public void comprobarSexo (char sexo){
        if (sexo == 'H' || sexo == 'M') {
            this.sexo = sexo;
        } else {
            this.sexo = 'H'; // por defecto Hombre
        }
    }  
     //metodo to string
     public String toString(){
        return "[ "+ this.nombre+ " ] [ " +this.edad+ " ] [ "+this.dni+" ] [ "+this.sexo+" ] [ "+this.peso+" ] [ "+this.altura+" ]";
     }

}
