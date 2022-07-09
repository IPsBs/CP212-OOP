package lab9;
import javax.swing.JOptionPane;

public class Lab9Program1 {

	public static void main(String[] args) {
		//Create instance "lab9" from this class
		Lab9Program1 lab9 = new Lab9Program1();

		try {
			lab9.check();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
	
	private void check() throws Exception{
		String email, palin; 
		
		email = JOptionPane.showInputDialog(null,"Please validate yourself as a first year science student with an email");
		//if email doesn't mactch SWU's Science email pattern then throw RuntimeException
		if(!email.matches("[sS][cC][6][4][0-9]{7}@[sS][wW][uU]\\.[aA][cC]\\.[tT][hH]")) throw new RuntimeException("Invalid indentification. You cannot continue.");
		
		
		//email ok, check palindrome. Hint: reverse the original string to check whether it is a palindrome or not.
		palin = JOptionPane.showInputDialog(null,"String to check whether it is a palindrome.");
		StringBuffer str = new StringBuffer("palin");
		str.reverse();
		if(palin.equalsIgnoreCase(str.toString())) {
			JOptionPane.showMessageDialog(null,"Yes " + palin + "is a palindrome. ");
	}else {
		JOptionPane.showMessageDialog(null,"No " + palin + " is not a palindrome. (" + str +")");
}
}
}