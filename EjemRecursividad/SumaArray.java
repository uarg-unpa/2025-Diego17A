import java.util.Random;

public class SumaArray {

    // --- ESTE ES EL MÉTODO MAIN (Donde arranca el programa) ---
    public static void main(String[] args) {
        Random random = new Random(); // Usamos 'random'
        int[] vec = new int[6];

        // 1. Llenar el vector
        System.out.println("--- Elementos del vector ---");
        for (int i = 0; i < vec.length; i++) {
            // Genera números entre 0 y 10 (sin el texto 'bound:')
            int num = random.nextInt(10); 
            // Si querés negativos como intentaste antes (-10 a 10), sería: random.nextInt(21) - 10;
            
            vec[i] = num;
            System.out.print("|" + vec[i] + "|");
        }

        // 2. Llamar a la función recursiva
        // IMPORTANTE: Pasamos el vector 'vec' y el índice de inicio '0'
        int resultadoSuma = sumarElementos(vec, 0);
        
        System.out.println("\nLa suma total de los elementos es: " + resultadoSuma);

    } // <--- AQUÍ TERMINA EL MAIN. CERRAR LLAVE ANTES DE CREAR OTRO MÉTODO.

    
    // --- ESTE ES TU MÉTODO RECURSIVO (Afuera del main, pero dentro de la class) ---
    public static int sumarElementos(int[] vec, int i) { // Agregué 'int[]' antes de vec
        
        if (i < vec.length) {
            // Suma el actual + la llamada recursiva del siguiente
            return vec[i] + sumarElementos(vec, (i + 1));
        } else {
            // Caso base: si me paso del largo, sumo 0
            return 0;
        }
    }

    public static int suma(int n){
        if(n==0)
            return 0;
        return n + suma(n-1); 

    }
} // <--- AQUÍ TERMINA LA CLASE MAIN
