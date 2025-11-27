public class Estacionamiento {
   
    private Vehiculo[] plazas;
    private int size;         
    private int next; 

    public Estacionamiento(int n) {
        this.size = n;
        this.plazas = new Vehiculo[size];
        this.next = 0;
    }

    public void registrarEntrada(Vehiculo vehiculo) {
        if (!(this.next < this.size)) {
            System.out.println("Estacionamiento LLENO. No puede entrar patente: " + vehiculo.getPatente());
        } else {
            plazas[next] = vehiculo;
            this.next++;
            System.out.println("Ingresó vehículo: " + vehiculo.getPatente());
        }
    }

    public void registrarSalida(String patente) {
        if (this.next == 0) {
            System.out.println("Estacionamiento VACÍO. No hay nada para sacar.");
            return;
        }

        boolean found = false;
        int count = 0;
        Vehiculo aux;

        while (!found && count < next) {
            if (plazas[count] != null) {
                aux = plazas[count];
                if (aux.getPatente().equals(patente)) {
                    found = true;
                }
            }
            count++;
        }

        if (found) {
            int posEliminar = count - 1;
            plazas[posEliminar] = null;
            System.out.println("Salió vehículo: " + patente);

            for (int i = posEliminar; i < next - 1; i++) {
                plazas[i] = plazas[i + 1];
            }
            plazas[next - 1] = null;
            this.next--; 
        } else {
            System.out.println("No se encontró el vehículo con patente: " + patente);
        }
    }

    public void mostrarEstado() {
        System.out.println("--- Estado del Estacionamiento (Ocupados: " + next + "/" + size + ") ---");
        for (int i = 0; i < next; i++) {
            if (plazas[i] != null) {
                System.out.println("Posición " + i + ": [" + plazas[i].getPatente() + "]");
            }
        }
        System.out.println("-----------------------------------");
    } 
}
