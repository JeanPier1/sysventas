/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplokevin;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class ejemplokevin {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        
        System.out.println("Bienvenido a calcula tu raiz");
        System.out.println("Ingrese Ingrese el valor de la raiz ");
        double raiz=lector.nextInt();
        System.out.println("Ingrese la variable");
        double variable=lector.nextDouble();
        double respuesta;
        respuesta=asd(raiz,variable);
        System.out.println(""+respuesta);
        
        
    }
    static double asd(double raiz,double variable){
        double respuesta=Math.pow(variable,(1)/raiz);
        return respuesta;
        
    }
}
