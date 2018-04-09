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
public class JoseGuzman {
   
 public static void main(String[] args) {
    
   
  Scanner teclado=new Scanner(System.in);
System.out.println("Introduce el numero para hacer su raiz");
int numero=teclado.nextInt();
double resultado=Math.sqrt(numero);
System.out.println("El resultado es: "+resultado);
 }
 public double raiz(double x){
     return Math.sqrt(x);
 }
}
