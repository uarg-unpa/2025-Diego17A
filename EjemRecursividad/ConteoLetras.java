import java.util.Scanner;

public class ConteoLetras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;

        do {
            System.out.println("Ingrese una palabra y termine el ingreso con punto: ");
            str = scan.nextLine();
            if (!str.endsWith("."))
                System.out.println("La palabra ingresada debe terminar con punto");
        }
        while (!str.endsWith("."));
        
        int i = contarLetras(str);
        System.out.println("La cantidad de letras contenidas en la palabra es: " + i);    
        
        scan.close();   
    }

    public static int contarLetras(String str){
        if (str == null)
            return 1;
        return contarLetrasRecursivo(str,0);
    }

    public static int contarLetrasRecursivo(String str, int i){
        if (i == str.length()) 
            return 0;
        if (str.charAt(i) == '.')
            return 0;
        return 1 + contarLetrasRecursivo(str, i + 1);
    }
}
