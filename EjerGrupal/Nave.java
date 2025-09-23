//Una simulacion espacial registra naves con nombre, velocidad maxima  (en km/h), 
//combustible restante (en litros) y destinos. Los jugadores quieren verificar si una nave 
//puede llegar a su destino (combustible >1000), acelerar (aumentar la velocidad) 
//y mostrar un informe de mision


public class Nave {
    //atributos
    private String nombre;
    private int velMax;
    private int combRest;
    private String destinos;
    

    //contructor
    public Nave (String nombre, int velMax, int combRest, String destinos){
        //inicializar atributos del constructor
        this.nombre= nombre;
        this.velMax=velMax;
        this.combRest=combRest;
        this.destinos=destinos;
    }   
    //metodos gets y sets
    public void setnombre (String a){
        this.nombre=a;
    }    
    public String nombre(){
        return this.nombre;
    }
    public void setndestinos (String a){
        this.destinos=a;
    }    
    public String destinos(){
        return this.destinos;
    }
    public void setvelMax (int a){
        this.velMax=a;
    }
    public int velmax(){
        return this.velMax;
    }
    public void combRest (int a){
        this.combRest=a;
    }
    public int combRest(){
        return this.combRest;
    }
    //metodo llegarDestino (combustible mayor a 1000)
    public boolean llegarDestino(){
        return combRest>1000; 
    }
    // metodo acelerar velocidad maxima
    public void acelerar (int incremento){
        int velmax2;
        velmax2= this.velMax + incremento;
        System.out.println(nombre +"aceleró. Su nueva velocida es: " + velmax2);
    }
    //metodo informe de mision
    public void informeMision(){
        System.out.println("Informe de Mision");
        System.out.println("Nave: " + nombre);
        System.out.println("Destino" + destinos);
        System.out.println("Velocidad maxima: " + velMax);
        System.out.println("Combustible restante: " + combRest);
        System.out.println("¿Llegara a destino?" + llegarDestino());
        System.out.println("==================");
    }
    
}
