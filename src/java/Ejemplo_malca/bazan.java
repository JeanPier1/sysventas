
package Ejemplo_malca;

import java.util.Scanner;
import static sun.misc.Version.println;

public class bazan {
    public static void main(String[] args) {
        
    
        Scanner x= new Scanner(System.in);
        System.out.println("Ingresar Raiz");
        double z = x.nextInt();
         double calcularu=calcular(z);
        System.out.println(""+calcularu+"");
        
    }
     
    static double calcular(double z){
       double calcular1 = Math.sqrt(z);
        return calcular1;   
    }
    
}

