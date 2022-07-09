package homework;
import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double cen,feet,inches;
        System.out.print("Enter Centimeters: ");
        cen = scanner.nextDouble();
        feet = (cen*0.0328084);
        inches = (cen*0.393701);
        System.out.printf("Feet: %f ft.\n",feet);
        System.out.printf("Inches: %f in.\n",inches);
        scanner.close();
    }
}

