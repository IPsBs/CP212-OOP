package lab6;

import java.util.Scanner;

public class Lab6Program1 {

	public static void main(String[] args) {
		Lab6Program1 exercise = new Lab6Program1();   
		exercise.start();  
		}  

		     public void start( ) {   
		Scanner scanner = new Scanner( System.in );
		int num = 0;
		do {
			System.out.println("Enter number: ");
			num = scanner.nextInt();
		if(num < 1)
			System.out.println("invalid input! The number must be greater than 0.");
		     }while(num<1);
		     System.out.println("Divisor: 1");
		     System.out.println(", is perfect: " + isPerfect(num));  
	}  
public boolean isPerfect( int number ) { 
 int sumOfDivisors=1, divisors=2;
 int divisor;
while(divisors <= number-1) {
	 if(number%divisors == 0) {
		 System.out.print("+"+divisors);
		 sumOfDivisors += divisors;
	 }
	 divisors++;
 }
 System.out.println("="+sumOfDivisors);
 if(sumOfDivisors == number) {
	 return true;
 }else {
		 return false;
 }
	}

}
