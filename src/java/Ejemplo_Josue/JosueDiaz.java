/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Josue;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Ackerman
 */
public class JosueDiaz {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        inciar();
    }

    private static double ingresar() {
        double num;
        System.out.println("Ingrese numero");
        num=sc.nextDouble();
        return num;
    }

    private static double raiz(double number) {
        return Math.sqrt(number);
    }

    private static void resultado(double number, double resultado) {
        DecimalFormat dec = new DecimalFormat("#.00");
        System.out.println("--------------------------------");
        System.out.println("La raiz cuadrada de " + number + " es: " + dec.format(resultado));
    }

    private static void again() {
        String rs;
        System.out.println("--------------------------------");
        System.out.println("¿Desea hacerlo otra vez?");
        rs=sc.next();
        if (rs.equals("si")||rs.equals("yes")) 
        {
            System.out.println("--------------------------------");
            inciar();
        }else{
            System.out.println("--------------------------------");
            System.out.println("Gracias por su preferencia");
        }
    }

    private static void inciar() {
        double number;
        double resultado;
        number=ingresar();
        resultado=raiz(number);
        resultado(number,resultado);
        again();
    }
    
}
