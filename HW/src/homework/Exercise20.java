package homework;
import java.text.*;
import java.util.Date;
public class Exercise20 {

	public static void main(String[] args) {
		Date today;
		DateFormat dateFormat = new SimpleDateFormat ("dd MMMM yyyy");
		today = new Date(System.currentTimeMillis());
		System.out.println(dateFormat.format(today));

	}

}
