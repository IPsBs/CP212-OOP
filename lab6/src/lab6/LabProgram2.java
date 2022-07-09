package lab6;
import javax.swing.*;
public class LabProgram2 {

	public static void main(String[] args) {
		int num,result;
		num = Integer.parseInt(JOptionPane.showInputDialog(null,"Plese enter and integer number to calculate factorial:"));
		result = factorial(num);
		JOptionPane.showMessageDialog(null,"The result of factorial "+num + " is "+result);
	}
 public static int factorial(int n) {
	 if(n == 1)
		 return 1;
	 else
		 return n * factorial(n-1);
 }
}
