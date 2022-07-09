package homework;
import javax.swing.*;
import java.util.*;
public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;
		String firstname, lastname;
		
		System.out.print("Firstname:");
		firstname = scanner.next();
		
		System.out.print("Lastname:");
		lastname = scanner.next();
		
		JFrame mainWindow;
		mainWindow = new JFrame();
		mainWindow.setTitle( lastname + ", " + firstname );
		mainWindow.setSize(500,500);
		mainWindow.setVisible(true);
    }
}
