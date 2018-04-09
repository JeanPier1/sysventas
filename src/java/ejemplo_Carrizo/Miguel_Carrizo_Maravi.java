package ejemplo_Carrizo;
import java.util.Scanner;

public class Miguel_Carrizo_Maravi {
    
    public static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Ingrese el numero: \n-- ");
        double n = lector.nextInt();
        System.out.println("La respuesta es: " + CalcularRaiz(n));
        
    }
    
    public static double CalcularRaiz(double numero){
        return Math.sqrt(numero);
    }
    
}
