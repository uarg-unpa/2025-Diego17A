package Tp5.Ejerc1;

public class ManejadorEstacionamiento {

       // Vector donde se guardarán las patentes de los vehículos
       private String[] vehiculos;

       // Capacidad máxima del estacionamiento
       private int capacidad;
   
       // Cantidad actual de vehículos y posición donde se guarda el próximo
       private int next;
   
       // ------------------------------------------------------------
       // CONSTRUCTOR
       // Recibe la capacidad y prepara el vector internamente
       // ------------------------------------------------------------
       public ManejadorEstacionamiento(int capacidad) {
           this.capacidad = capacidad;           // guarda la capacidad
           this.vehiculos = new String[capacidad]; // crea el vector de patentes
           this.next = 0;                         // no hay autos al inicio
       }
   
       // ------------------------------------------------------------
       // MÉTODO registrarEntrada
       // Intenta insertar un vehículo al estacionamiento
       // ------------------------------------------------------------
       public boolean registrarEntrada(String patente) {
   
           // Si el estacionamiento está lleno, no se puede ingresar
           if (next >= capacidad) {
               System.out.println(" Estacionamiento lleno. No se puede ingresar más vehículos.");
               return false;  // no realizó la operación
           }
   
           // Guarda la patente en la posición libre indicada por next
           vehiculos[next] = patente;
   
           // Incrementa la cantidad actual de vehículos
           next++;
   
           // Indica que la operación se realizó correctamente
           return true;
       }
   
       // ------------------------------------------------------------
       // MÉTODO registrarSalida
       // Busca y elimina un vehículo del estacionamiento
       // ------------------------------------------------------------
       public boolean registrarSalida(String patente) {
   
           // Si no hay autos, no se puede retirar ninguno
           if (next == 0) {
               System.out.println(" Estacionamiento vacío. No hay vehículos para retirar.");
               return false;
           }
   
           // Variables para saber si se encontró la patente
           boolean encontrado = false;
           int pos = -1;
   
           // Recorremos solo hasta 'next', donde hay valores válidos
           for (int i = 0; i < next; i++) {
   
               // Si la patente coincide (ignorando mayúsculas/minúsculas)
               if (vehiculos[i].equalsIgnoreCase(patente)) {
                   encontrado = true; // encontramos el vehículo
                   pos = i;           // guardamos la posición donde está
                   break;             // cortamos el bucle
               }
           }
   
           // Si no se encontró la patente, avisamos y salimos
           if (!encontrado) {
               System.out.println("Vehículo no encontrado en el estacionamiento.");
               return false;
           }
   
           // Eliminamos la patente colocando null
           vehiculos[pos] = null;
   
           // Llamamos a compactar para eliminar huecos en el vector
           compactar();
   
           // Reducimos la cantidad de autos
           next--;
   
           // Operación finalizada correctamente
           return true;
       }
   
       // ------------------------------------------------------------
       // MÉTODO compactar
       // Reacomoda el vector eliminando posiciones vacías (null)
       // ------------------------------------------------------------
       private void compactar() {
   
           // Creamos un vector auxiliar que será el nuevo ordenado
           String[] aux = new String[capacidad];
   
           // j será el índice en el nuevo vector
           int j = 0;
   
           // Recorremos todo el vector original
           for (int i = 0; i < capacidad; i++) {
   
               // Solo copiamos valores NO nulos
               if (vehiculos[i] != null) {
   
                   // Copiamos la patente al nuevo vector ordenado
                   aux[j] = vehiculos[i];
   
                   // Avanzamos en el índice del nuevo vector
                   j++;
               }
           }
   
           // Sobrescribimos el vector original con el nuevo ordenado
           vehiculos = aux;
       }
   
       // ------------------------------------------------------------
       // MÉTODO mostrarEstado
       // Muestra información del estacionamiento y todas las patentes
       // ------------------------------------------------------------
       public void mostrarEstado() {
           System.out.println("\n=== ESTADO DEL ESTACIONAMIENTO ===");
           System.out.println("Capacidad máxima: " + capacidad);
           System.out.println("Vehículos estacionados: " + next);
   
           // Si no hay autos, avisamos
           if (next == 0) {
               System.out.println("(vacío)");
           } else {
   
               // Recorremos solo hasta next para mostrar autos reales
               for (int i = 0; i < next; i++) {
                   System.out.println((i + 1) + ". " + vehiculos[i]);
               }
           }
   
           System.out.println("==================================\n");
       }
}
    

