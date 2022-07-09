package lab8;
import java.text.DecimalFormat;
import java.util.*;

public class TestStudentArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//prog1();
				int num = 3;
		DecimalFormat df = new DecimalFormat("0.00");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		num = scanner.nextInt();
		StudentArray students = new StudentArray(num);

		System.out.println();

		System.out.println("--------Statistics----------");
		System.out.println("Average GPA: " + df.format(students.computeAvgGPA()));
		System.out.println();

		Student highest = students.findHighestGPA();
		Student lowest = students.findLowestGPA();
		System.out.println(highest.getName() + " who has the highest GPA " + df.format(highest.getGPA()) + " is from major "
				+ highest.getMajor().toString() + ".");
		System.out.println(lowest.getName() + " who has the lowest GPA "+ df.format(lowest.getGPA()) + " is from major "
				+ lowest.getMajor().toString() + ".");

		System.out.println("--------------------------");

		String name;
		Student resultStudent;
		
		System.out
				.print("Enter name of the student to search (STOP to quit): ");
		name = scanner.next();
		while (!name.equalsIgnoreCase("STOP")) {

			resultStudent = students.search(name);
			if (resultStudent != null) {
				System.out.println("Name: " + resultStudent.getName()
						+ " GPA: " + resultStudent.getGPA()
						+ " Major:" + resultStudent.getMajor());
			} else {
				System.out.println("Not found.");
			}

			System.out
					.print("Enter name of the student to search (STOP to quit): ");
			name = scanner.next();
		}


	}

}
