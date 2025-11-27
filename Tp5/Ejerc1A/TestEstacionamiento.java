import java.util.Scanner;

public class TestEstacionamiento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Defina la capacidad del estacionamiento (N): ");
        int n = Integer.parseInt(scanner.nextLine());

        Estacionamiento garage = new Estacionamiento(n);
        int opcion = 0;

        do {
            System.out.println("\n1. Registrar Entrada");
            System.out.println("2. Registrar Salida");
            System.out.println("3. Mostrar Estado");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese patente: ");
                    String patEntrada = scanner.nextLine();
                    Vehiculo nuevoAuto = new Vehiculo(patEntrada);
                    garage.registrarEntrada(nuevoAuto);
                    break;
                case 2:
                    System.out.print("Ingrese patente a retirar: ");
                    String patSalida = scanner.nextLine();
                    garage.registrarSalida(patSalida);
                    break;
                case 3:
                    garage.mostrarEstado();
                    break;
            }
        } while (opcion != 0);
        
        scanner.close();
    }
}
