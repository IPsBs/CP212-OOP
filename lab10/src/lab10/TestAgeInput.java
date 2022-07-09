package lab10;

class TestAgeInput 
{  
	public static void main(String[] args) 
	{
		int entrantAge;
		try
		{
			AgeInput input = new AgeInput(25,50);
			entrantAge = input.getAge("Your Age:");
			System.out.println("Input Okay. Age = "+ entrantAge);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
