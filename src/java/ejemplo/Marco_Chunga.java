package Ejemplo;
import java.util.Scanner;
public class Marco_Chunga {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); 
        System.out.println("Buenos dias señor ingrese el número a sacar la raiz cuadrada"); 
        double numero; numero=lector.nextInt(); 
        double result = raiz(numero); 
        System.out.println("------------>>>>La raiz cuadrada es: " + result + ">>>>---------");
    }
    static double raiz(double x){
        return Math.sqrt(x);
    }
    
}
