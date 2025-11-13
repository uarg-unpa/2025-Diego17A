package Parciales.Parcial1;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String motor;
    private int cilindrada;
    private final int potente = 2000; 

    public Vehiculo (String marca, String modelo, String motor, int cilindrada){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.cilindrada = cilindrada;

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
    public void setmotor (String motor){
        this.motor = motor;
    }
    public String getmotor(){
        return this.motor;
    }
    public void setcilindrada (int cilindrada){
        this.cilindrada = cilindrada;
    }
    public int getcilindrada(){
        return this.cilindrada;
    }                
    // metodo espotente comparao la cilindrada con un valor fijo 
    public boolean EsPotente (){
        if (potente <= this.cilindrada){
            return true;
        }
        else{
            return false;
        }
    }
    //metodo actualizar  tipo de motor
    public void actualizarTipoMotor(String motor){
        this.motor = motor;
    }
    //calcular consumo
    // dependiendo de la cilindradaa tendra un consumo.
    // se utilizan cilindradas conocidas 1000,2000,2500,3000.
    public double calcularConsumo (){
        double consumo;
        switch(this.cilindrada){
            case 1000 :
                consumo = 5;
                break;
            case 2000:
                consumo = 8;
                break;
            case 2500:
                consumo = 10;
                break;     
            case 3000:
               consumo = 12.5;
                break;    
            default :
                consumo = 00;
                break;       
        }
        return consumo;
    }
    public String toString(){
        return "["+this.marca+"]["+this.modelo+"]["+this.motor+"]["+this.cilindrada+"]";
    }

    
}
