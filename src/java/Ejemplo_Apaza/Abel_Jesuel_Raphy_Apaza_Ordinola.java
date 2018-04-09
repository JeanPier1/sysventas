package Ejemplo_Apaza;

import javax.swing.JOptionPane;

public class Abel_Jesuel_Raphy_Apaza_Ordinola {

    public static void main(String[] args) {
        boolean condicion = true;
        double n = 0;
        while (condicion) {
            try {
                 n = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número del que desea obtener su raíz cuadrada."));
                condicion = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese un caracter válido \n    " + e.getMessage());
            }
        }
        if (!condicion) {
            JOptionPane.showMessageDialog(null, "La raíz cuadrada de " + n + " es: " + calcularRaiz(n));
        }
    }

    public static double calcularRaiz(double n) {
        return Math.sqrt(n);
    }
}
