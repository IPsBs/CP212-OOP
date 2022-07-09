package homework;
import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		int power10 ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the power of 10: ");
        power10 = scanner.nextInt();
        scanner.close();
        
        switch (power10) {
        case 6:
            System.out.println("It's Million");
            break;
        case 9:
            System.out.println("It's Billion");
            break;
        case 12:
            System.out.println("It's Trillion");
            break;
        case 15:
            System.out.println("It's Quadrillion");
            break;
        case 18:
            System.out.println("It's Quintillion");
            break;
        case 21:
            System.out.println("It's Sextillion");
            break;
        case 30:
            System.out.println("It's Nonillion");
            break;
        case 100:
            System.out.println("It's Googol");
            break;
        default:
            System.out.println("It's invaild power");
            break;
}

	}

}
