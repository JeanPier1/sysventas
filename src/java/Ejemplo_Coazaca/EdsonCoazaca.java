/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Coazaca;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author alum.fial1
 */
public class EdsonCoazaca {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese número: ");
        double num = lector.nextDouble();
        System.out.println("Raiz: " + raiz(num));     
        
    }
    
    static double raiz(double var){
        double res = sqrt(var);     
        return res;
    }  
    
}
