package lab10;

import java.util.*;
class  AgeInput 
{
	private static final String DEFAULT_MESSAGE = "Your age:";
	private static final int DEFAULT_LOWER_BOUND = 0;
	private static final int DEFAULT_UPPER_BOUND = 99;
	private int lowerBound;
	private int upperBound;
	private Scanner scanner;

	public AgeInput() {
	 // Call init method
		init(DEFAULT_LOWER_BOUND,DEFAULT_UPPER_BOUND);
	}
	public AgeInput(int low, int high) throws IllegalArgumentException{
	// Check whether the age is in our range or not. 
	// If low > high then throw IllegalArgumentException
	// Else, call init method 
		if(low > high)
		{
			throw  new IllegalArgumentException("Low (" + low + ") was" + "larger than high (" + high + ")");
		}else {
			init(low,high);
		}
	}
	public int getAge() throws Exception {
	//return DEFAULT_MESSAGE by calling its overloaded method
	return getAge(DEFAULT_MESSAGE);
	}
	public int getAge(String prompt) throws Exception {
		int age;
		while (true){
			System.out.print(prompt);
			try
			{  // Check whether the age is in our range or not. If age is in our range, then return age
			   age = scanner.nextInt();
			   if(age < lowerBound || age > upperBound){
				   throw new Exception("Iput out of bound");
			   }
			   return age;
			}
			catch (InputMismatchException e){
				scanner.next();
				//Inform user to input digits only
				System.out.println("Input is invalid.\n"+"Plase enter digit only");
			}
		}	}
	private void init(int low, int high){
		lowerBound = low;
		upperBound = high;
		scanner = new Scanner(System.in);
	}
}
