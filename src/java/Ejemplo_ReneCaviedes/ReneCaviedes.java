/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_ReneCaviedes;

import java.util.Scanner;

/**
 *
 * @author Rene Cabiedes
 */
public class ReneCaviedes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Lector = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        double x = Lector.nextDouble();
        System.out.println(raiz(x));
    }
    static double raiz(double x){
        return Math.sqrt(x);
    }
}
