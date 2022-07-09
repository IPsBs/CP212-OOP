package homework;
import java.util.*;
public class Ex8 {

	public static void main(String[] args) {
		double celsius,fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Celsius: ");
        celsius = sc.nextDouble();
        fahrenheit = 1.8*celsius+32;
        System.out.println("This is Celsius to Fahrenheit: "+fahrenheit);
        sc.close();

	}

}
