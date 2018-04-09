/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_capcha;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author alum.fial1
 */
public class MarcelinoCapcha{
    public static void main(String[] args) {
        Scanner Lector=new Scanner(System.in);
        System.out.println("Ingrese el numero");
        double nom;
        nom=Lector.nextDouble();
        System.out.println("La raiz es: "+raiz(nom));
    }
    static double raiz(double x){ 
        double retu= sqrt(x);
       
    return retu;
}
}
