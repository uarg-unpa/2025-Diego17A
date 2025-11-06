public class main{ 
    public static ColaC llenarCola(PilaC p1, PilaC p2){ 
        ColaC principal = new ColaC(); 
        int cont = 0; 
        while(!p1.estaVacia() && !p2.estaVacia()){ 
            if(cont%2 == 0){ 
                 principal.meter(p1.sacar()); 
            }
            else{ 
                 principal.meter(p2.sacar()); 
            } 
            cont++;
        } 
        while(!p1.estaVacia()){ 
            principal.meter(p1.sacar()); 
        } 
        while(!p2.estaVacia()){
            principal.meter(p2.sacar());
        } 
        return principal; 
    }  
}    