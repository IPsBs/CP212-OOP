package swu.cp212.lab3;
import javax.swing.JOptionPane;
public class ex18 {
    public static void main(String[] args) {
        double a, b, c;
        a = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of A:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of B:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of C:"));
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "a cannot be 0");
        }
        double[] result = new double[2];
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            JOptionPane.showMessageDialog(null, "The discriminant is negative, there are no real roots.");
        }
        result[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
        result[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
        JOptionPane.showMessageDialog(null, "The discriminanttwo real number solutions are: \n" + result[0] + "\nand \n" + result[1]);
        System.exit(0);
    }
}
