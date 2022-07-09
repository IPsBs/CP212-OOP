package cp212.swulab4;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*
*	Name: Atikan Moopayak
*	Lab: 4
*	Class:	CP212 Object Oriented Programming
*	Date: 31/01/2022
*/
class StatCalculation {

	public static void main(String[] args) {
		int num1, num2, num3;
		Stat stat;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number 1:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number 2:"));
		num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number 3:"));
		stat = new Stat(num1, num2, num3);
		
		DecimalFormat df = new DecimalFormat("0.00");
		JOptionPane.showMessageDialog(null,
				 "The sum is " + df.format(stat.getSum()) + ".\n" 
				+ "The mean is " + df.format(stat.getAvg()) + ".\n"
				+ "The standard deviation is " + df.format(stat.getStd()) + ".");

	}

}
