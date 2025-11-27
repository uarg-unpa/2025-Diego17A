package Clases.Gestor;

public class gestorListaContactos {
    
    private Contacto [] contactos;
    private int capacidad, actual;

    public gestorListaContactos (int n){
        this.capacidad = n;
        this.contactos = new Contacto [capacidad];
        this.actual = 0;
    }
    public void agergarContacto (Contacto a){
        if (!(this.actual < this.capacidad))
            this.enlarge();
            contactos[actual] = a;
            this.actual++;
    }
    public void sacarContacto (String nombrecontacto){
        boolean found = false;
        int contador = 0;
        Contacto aux;
        while (!found && contador < actual){
            if (contactos[contador] != null){
                aux = contactos [contador];
                if ( aux.getnombre().equals (nombrecontacto))
                    found = true;
            }
            contador++;
        }
        if (found){
            contactos [contador -1] = null;
        }
    }
    public boolean buscarContacto (String nombrecontacto){
        boolean found = false;
        int contador = 0;
        Contacto aux;
        while (!found && contador < actual){
            if (contactos[contador] != null){
                aux = contactos [contador];
                if ( aux.getnombre().equals (nombrecontacto))
                    found = true;
            }
            contador++;
        }
        return found;
        }
    private void enlarge(){
        int contador1;
        int contador2 = 0;
        Contacto [] aux = new Contacto [capacidad+100];
        for (contador1 = 0; contador1<capacidad; contador1++);
            if (contactos [contador1]!=null){
                 aux [contador2] = contactos[contador1];
                contador2++;
            }
            this.contactos = aux;
            this.actual = contador2;
            this.capacidad = capacidad+100;
        }
    }

