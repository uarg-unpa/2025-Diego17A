package Tp5.Ejerc1;

public class ManejadorEstacionamiento2 {

    private Vehiculo[] vehiculos;   // ahora es un vector de OBJETOS Vehiculo
    private int capacidad;
    private int next;

    public ManejadorEstacionamiento2 (int capacidad) {
        this.capacidad = capacidad;
        this.vehiculos = new Vehiculo[capacidad];
        this.next = 0;
    }

    public boolean registrarEntrada(String patente) {// Registrar entrada (recibe patente, crea un vehículo)
        if (next >= capacidad) {
            System.out.println("Estacionamiento lleno. No se puede ingresar más vehículos.");
            return false;
        }

        vehiculos[next] = new Vehiculo(patente); // ← AHORA SE CREA UN OBJETO
        next++;
        return true;
    }
    public boolean registrarSalida(String patente) {// Registrar salida (busca por patente del objeto)

        if (next == 0) {
            System.out.println("Estacionamiento vacío.");
            return false;
        }

        boolean encontrado = false;
        int pos = -1;

        for (int i = 0; i < next; i++) {
            if (vehiculos[i].getPatente().equalsIgnoreCase(patente)) {
                encontrado = true;
                pos = i;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Vehículo no encontrado.");
            return false;
        }

        vehiculos[pos] = null;
        compactar();
        next--;
        return true;
    }
    private void compactar() {// Igual que antes, compacta el vector eliminando huecos
        Vehiculo[] aux = new Vehiculo[capacidad];
        int j = 0;

        for (int i = 0; i < capacidad; i++) {
            if (vehiculos[i] != null) {
                aux[j] = vehiculos[i];
                j++;
            }
        }
        vehiculos = aux;
    } 
    public void mostrarEstado() {// Muestra estado del estacionamiento// Muestra estado del estacionamiento
        System.out.println("\n=== ESTADO DEL ESTACIONAMIENTO ===");
        System.out.println("Capacidad máxima: " + capacidad);
        System.out.println("Vehículos estacionados: " + next);

        if (next == 0) {
            System.out.println("(vacío)");
        } else {
            for (int i = 0; i < next; i++) {
                System.out.println((i + 1) + ". " + vehiculos[i].getPatente());
            }
        }
        System.out.println("==================================\n");
    }
}
    
