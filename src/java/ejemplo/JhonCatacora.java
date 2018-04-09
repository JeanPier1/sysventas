/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.Scanner;

/**
 *
 * @author alum.fial1
 */
public class JhonCatacora {
    public static void main(String[] args) {        
        calcularRaiz();
    }
    
    public static void calcularRaiz(){       
        Scanner src = new Scanner(System.in);
        double num = src.nextDouble();
        double res = Math.sqrt(num);
        System.out.println(res);
    }
    
}
