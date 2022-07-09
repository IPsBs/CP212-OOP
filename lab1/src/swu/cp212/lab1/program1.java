package swu.cp212.lab1;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				//variable
		Scanner scanner = new Scanner(System.in)) {
			String lastname,title;
			char firstname;
			//io part
			System.out.print("Fisrtname: ");
			firstname = scanner.next().charAt(3);
			System.out.print("Lastname: ");
			lastname = scanner.next();
			System.out.print("Title (Mister/Miss): ");
			title = scanner.next();
			System.out.printf("Hello %s %c. %s.",title,firstname,lastname);
		}
	}

}
