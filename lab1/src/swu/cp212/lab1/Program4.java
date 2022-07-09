package swu.cp212.lab1;
import javax.swing.*;
import java.util.*;
import java.text.*;
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today;
		today = new Date( );
		today.toString( );
		SimpleDateFormat dateoutput1,dateoutput2;
		dateoutput1 = new SimpleDateFormat("MM//dd/yy");
		dateoutput2 = new SimpleDateFormat("MM//dd/yy hh:mm aa");
		JOptionPane.showMessageDialog(null,dateoutput1.format(today)+"\n"+dateoutput2.format(today));
	}
}
