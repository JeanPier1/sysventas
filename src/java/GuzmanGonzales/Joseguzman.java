/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuzmanGonzales;

import java.util.Scanner;

/**
 *
 * @author alum.fial1
 */
public class Joseguzman {
     public static void main(String [] args)
     {
     Scanner lector = new Scanner (System.in);
     double a = 0;
     double Resultado=0;
         System.out.println("Escriba el numero");
         a= lector.nextDouble();
         Resultado= (Math.sqrt(a));
         System.out.println("El resultado es: " + Resultado);
     
     }
}
