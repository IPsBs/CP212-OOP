package swu.cp212.lab3;
import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		GregorianCalendar calEndDate; 
		GregorianCalendar calToday = new GregorianCalendar() ;
		String inputStr; 
		int year, month, day; 
		long result, remainder;
		
		//Get input
		System.out.print("Enter the end date in the format dd/MM/yyyy: ");
		inputStr = scanner.next(); 
		day = Integer.parseInt( inputStr.substring(0, 2)); 
		month = Integer.parseInt(inputStr.substring(3,5)); 
		year = Integer.parseInt(inputStr.substring(6,10)); 
		
		calEndDate = new GregorianCalendar(year, month-1, day);
		
		//System.out.print(calToday.get(Calendar.MONTH));
		//System.out.print(calEndDate.getTime().getTime());
		//System.out.print(calToday.getTime().getTime());
		//Calculate how many days until 
		result = ((calEndDate.getTime().getTime() - calToday.getTime().getTime())
				/ 86400000); // 86400000 --> millisecond in a day
				
		remainder = ((calEndDate.getTime().getTime() - calToday.getTime().getTime())
		% 86400000);
		
		if (remainder > (86400000/2));
			result +=1;
		//Display the result 
		System.out.println("It is " + result + " day(s) until " + inputStr + ".");
	}

}
