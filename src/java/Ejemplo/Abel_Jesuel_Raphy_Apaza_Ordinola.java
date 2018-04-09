
package Ejemplo;

import javax.swing.JOptionPane;

public class Abel_Jesuel_Raphy_Apaza_Ordinola {
    public static void main(String[] args) {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número del que desea obtener su raíz cuadrada."));
        JOptionPane.showMessageDialog(null, "La raíz cuadrada de "+n+" es: "+calcularRaiz(n));
    }
    
    public static double calcularRaiz(double n){
        return Math.sqrt(n);
    }
}
