import java.util.Scanner;

public class VectorNrecursividad {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad N de elementos: ");
        int n = Integer.parseInt(scanner.nextLine());
        
        int [] vector = new int [n];

        for (int i=0;i < vector.length; i++){
            vector [i] = i + 1;
        }
        
        System.out.println("\n ===Vector Generado===");
        for (int i=0; i < vector.length; i++) {
            System.out.print("[" + vector [i] + "]");
        }
    
        int k=3;

        int sumaTotal = sumarMultiplosRecursivo(vector, k, 0);

        System.out.print("\nLa suma total (recursiva) es: " + sumaTotal);
        
        scanner.close();
    }

    public static int sumarMultiplosRecursivo(int[] vector, int k, int i){
        if (i == vector.length) {
            return 0;
        }
        if (vector[i] % k == 0) {
            return vector[i] + sumarMultiplosRecursivo(vector, k, i + 1);
        }
        else {
            return 0 + sumarMultiplosRecursivo(vector, k, i + 1);
        }
    }

}
