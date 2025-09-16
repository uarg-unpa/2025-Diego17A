package Tp1.Ejerc5;
//clase Hora
public class Hora{
    private int hs;
    private int mm;
    private int sg;
    //constructor y validacion de valores 
    public Hora (int hs, int mm, int sg){
        if (hs >=0 && hs <=23 && 00 >=0 && mm <=59 && hs >=0 && hs <=59){
            this.mm = mm;    
            this.hs = hs;
            this.sg = sg;
        }
        else {     
            this.hs=00;
            this.mm=00;
            this.sg=00;
        }
    }
    //get y set
    // metodo set para cambiar la hs por separado
    //con validacion
    public void seths (int hs){
        if (hs >=0 && hs <=23){
            this.hs = hs;
        }
        else{
             this.hs=00;
        }
    }
    public int geths(){
        return this.hs;
    } 
    // metodo set para cambiar los mm por separado
    //con validacion   
    public void setmm (int mm){
        if (mm >=0 && mm <=59){
            this.mm = mm;
        }
        else{
            this.mm=00;
        }
    }
    public int getmm(){
        return this.mm;
    }    
    // metodo set para cambiar los sg por separado
    //con validacion
    public void setsg (int sg){
        if (hs >=0 && hs <=59){
            this.sg = hs;
        }
        else{
            this.sg=00;
        }
    }
    public int getsg(){
        return this.sg;
    }    
    // metodos
    //metodo hs en minutos
    public int horaenMinutos() {
        int result;
        result= (hs * 60) + mm;
        return result;
    }
    // metodo mostrar hh:mm:ss usando to String
    public String toString() {
        return "["+this.hs+"]["+this.mm+"]["+this.sg+"]";
    }

}