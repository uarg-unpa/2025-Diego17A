package Parciales.Recu1;

public class Persona {
    private String apellido;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona (String apellido, int edad, int dni, char sexo, double peso, double altura){
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public void setapellido(String apellido){
        this.apellido = apellido;
    }
    public String getapellido(){
        return this.apellido;
    }
    public void setedad(int edad){
        this.edad = edad;
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
    public void setsexo(char sexo){
        this.sexo = sexo;
    }
    public char getsexo(){
        return this.sexo;
    }
    public void setpeso(double peso){
        this.peso = peso;
    }
    public double getpeso(){
        return this.peso;
    }
    public void setaltura(double altura){
        this.altura = altura;
    }
    public double getaltura(){
        return this.altura;
    }
    public boolean esMayorDeEdad(){
        if (this.edad >= 18){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean esMayorQue(Persona a){
        if( this.edad > a.getedad()){
            return true;
        }
        else{
            return false;
        }
    }
    public double calcularIMC(){
        double imc = 0;
        int aux = 0;
        imc = (peso/(altura * altura));
        if (imc < 18){
            aux = -1;
            return aux;
        }
        else{
            if (imc >=18 & imc <=25){
                aux = 0;
                return aux;
            }
            else{
                aux = 1;
                return aux;
            }
        }  
    }

}
