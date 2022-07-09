package swu.cp212.lab3;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class Program3 {

	public static void main(String[] args) {
		String strNum1,strNum2,strNum3;
		int num1, num2, num3;
		double mean;
		//input
		 strNum1 = JOptionPane.showInputDialog(null,"Input number 1:");
		 strNum2 = JOptionPane.showInputDialog(null,"Input number 2:");
		 strNum3 = JOptionPane.showInputDialog(null,"Input number 3:");
		
		num1 = Integer.parseInt(strNum1);
		num2 = Integer.parseInt(strNum2);
		num3 = Integer.parseInt(strNum3);
		
		/*System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);*/
		
		//process
		//find mean
		mean=(double)(num1+num2+num3)/3;
		
		//find SD
		double sumsquare = Math.pow(num1 - mean,2) + Math.pow(num2 - mean,2)+ Math.pow(num3 - mean,2);
		double result = Math.sqrt(sumsquare/(3-1));
		//output
		DecimalFormat df = new DecimalFormat("0.000");
		JOptionPane.showMessageDialog(null,"The standard devidation is "+df.format(result)+".");
	}

}
