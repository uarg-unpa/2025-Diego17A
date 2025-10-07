package Parciales.Parcial1;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public void setbase (double base){
        this.base = base;
    }
    public double getbase (){
        return this.base;
    }
    public void setaltura (double altura){
        this.altura = altura;
    }
    public double getaltura(){
        return this.altura;
    }
    public double calcularArea (){
        double area = base * altura;
        return area;
    }
    public double calcularPerimetro (){
        double perimetro = ((2*base) + (2*altura));
        return perimetro;    
    }
    public boolean esMayorElArea (Rectangulo R){
        if (this.calcularArea() > R.calcularArea()){
            return true;
        }
        else{
            return false;
        }   

    }
    //otra opcion
    public boolean esMayorElArea2 (Rectangulo R){
        return (this.calcularArea() > R.calcularArea());
    }
}
