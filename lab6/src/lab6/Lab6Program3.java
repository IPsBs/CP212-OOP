package lab6;
import javax.swing.*;
public class Lab6Program3 {
//Lab6Program3
	public static void main(String[] args) {
		int a,b;
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number 1:"));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number 2:"));
		JOptionPane.showMessageDialog(null, "GCD: " +gcd(a,b)+"\nLCM: "+lcm(a,b));
	}
	public static int gcd(int m,int n) {
		int r = n%m;
		while (r!=0) {
			n = m;
			m = r;
			r = n%m;
		}
			return m;
	}
	public static int lcm(int m,int n) {
		return (m*n)/gcd(m,n);
	}
	}
