package swu.cp212.lab1;
import javax.swing.*;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname,lastname,title;
		firstname = JOptionPane.showInputDialog(null,"Firstname: ");
		firstname = firstname.substring(0,1);
		lastname = JOptionPane.showInputDialog(null,"Lastname: ");
		title = JOptionPane.showInputDialog(null,"Title (Mister/Miss)");
		JOptionPane.showMessageDialog(null,"Hello "+title+" "+firstname+". "+lastname+".");
	}

}
