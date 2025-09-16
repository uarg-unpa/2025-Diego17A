package Tp1.Ejerc6;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha (int dia, int mes, int anio){
        if (dia >=1 && dia <=31 && mes >=1 && mes <=12 && anio >=2013 && anio <=2025){
            this.dia = dia;    
            this.mes = mes;
            this.anio = anio;
        }
        else {     
            this.dia=1;
            this.mes=1;
            this.anio=2013;
        }    
    }
    public void setdia (int dia){
        if (dia >=1 && dia <=31){
            this.dia = dia;
        }
        else{
             this.dia=00;
        }
    }
    public int getdia(){
        return this.dia;
    }   
    public void setmes (int mes){
        if (mes >=1 && mes <=12){
            this.mes = mes;
        }
        else{
            this.mes=00;
        }
    }
    public int getmes(){
        return this.mes;
    }    
    public void setanio (int anio){
        if (anio >=2013 && anio <=2025){
            this.anio = anio;
        }
        else{
            this.anio=00;
        }
    }
    public int getanio(){
        return this.anio;
    }    
    public String obtenerMes() {
        String mess;
        switch (mes) {
            case 1:
                mess = "Enero";
                break;
            case 2:
                mess = "Febrero";
                break;
            case 3:
                mess = "Marzo";
                break;
            case 4:
                mess = "Abril";
                break;
            case 5:
                mess = "Mayo";
                break;
            case 6:
                mess = "Junio";
                break;
            case 7:
                mess = "Julio";
                break;
            case 8:
                mess = "Agosto";
                break;
            case 9:
                mess = "Septiembre";
                break;
            case 10:
                mess = "Octubre";
                break;
            case 11:
                mess = "Noviembre";
                break;
            case 12:
                mess = "Diciembre";
                break;    
            default :
                mess = "mes invalido";
                break;                
        }
        return mess;
    }
    public String toString() {
        return "["+this.dia+"]["+this.mes+"]["+this.anio+"]";
    }
}

       
