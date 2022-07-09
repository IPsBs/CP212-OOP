package lab8;
import java.util.*;

public class StudentArray {
	private int size;
	private Student[] students;

	public StudentArray(int size) {
		students = new Student[size];
		this.size = size;
		this.createStudentArray();
	}

	private void createStudentArray() {
		String name;
		double gpa;
		Student.Major major;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < students.length; i++) {

			// read in data values
			System.out.print("Enter name: ");
			name = scanner.next();
			System.out.print("Enter GPA: ");
			gpa = scanner.nextDouble();
			//read major and convert to upper Case	
			System.out.print("Enter major(NONE, CS, STAT, MATH); ");
			major = Student.Major.valueOf(scanner.next().toUpperCase());

			// create a new Person 
			students[i] = new Student();
			// assign values
			students[i].setName(name);
			students[i].setGPA(gpa);
			students[i].setMajor(major);
		}
	}

	public double computeAvgGPA() {
		double sum = 0, averageGPA;

		for (int i = 0; i < students.length; i++) {

			sum += students[i].getGPA();
		}

		averageGPA = sum / (double) students.length;
		return averageGPA;
	}

	public Student findLowestGPA() {
		Student lowest; // points to the lowest GPA student

		lowest = students[0];

		for (int i = 1; i < students.length; i++) {

			if (students[i].getGPA() < lowest.getGPA()) {
				// found the lowest GPA student
				lowest = students[i];
			}
		}
		return lowest;

	}

	public Student findHighestGPA() {
		Student highest; // points to the highest GPA student

		highest = students[0];
		for (int i = 1; i < students.length; i++) {

			if (students[i].getGPA() > highest.getGPA()) {
				// found the highest GPA student
		highest = students[i];
			}
		}
		return highest;
	}
	
	public Student search(String searchName){
		int i = 0;
		Student foundStudent = null;

		
        while ( i < students.length && !students[i].getName().equalsIgnoreCase(searchName)) {
            i++;
        }

        if (i < students.length) {
        	//found - successful search
        	foundStudent = students[i];

        } 
        
        return foundStudent;
	}
}
