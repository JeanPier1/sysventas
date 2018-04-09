
package Ejemplo;
import javax.swing.JOptionPane;
public class SamuelMauricio {
    public static void main(String[] args) {
       
            double n = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero"));
            JOptionPane.showMessageDialog(null, "El resultado es: " + calcular(n));
    }
    public static double calcular(double n){
            return Math.sqrt(n);
            }
}
