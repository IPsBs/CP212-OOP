package lab8;
import java.util.*;

public class StudentArrayList {
 private List <Student> students;
 private int size;
	public StudentArrayList() {
		students = new ArrayList<Student>();
	}
	
	public StudentArrayList(int size) {
		students = new ArrayList<Student>();
		this.size = size;
		this.createStudentArray();
	}
	
	public void createStudentArray() {
		String name;
		double gpa;
		Student.Major major;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < this.size; i++) {

			// read in data values
			System.out.print("Enter name: ");
			name = scanner.next();

			System.out.print("Enter GPA: ");
			gpa = scanner.nextDouble();
			//read major and convert to upper case

			System.out.print("Enter major(NONE, CS, STAT, MATH); ");
			major = Student.Major.valueOf(scanner.next().toUpperCase());

			// create a new Student and assign values
			Student student = new Student();

			student.setName(name);
			student.setGPA(gpa);
			student.setMajor(major);
			students.add(student);
		}
	}
	
	public double computeAvgGPA() {
		double sum = 0, averageGPA;

		for (Student s : students) {

			sum += s.getGPA();
		}

		averageGPA = sum/(double)students.size();
		return averageGPA;
	}

	public Student findLowestGPA() {
		Student lowest; // points to the lowest GPA student

		lowest = students.get(0);

		for (Student s : students) {

			if (s.getGPA() < lowest.getGPA()) {
				// found the lowest GPA student
				lowest = s;
			}
		}
		return lowest;

	}

	public Student findHighestGPA() {
		Student highest; // points to the highest GPA student

		highest = students.get(0);
		for (Student s : students) {

			if (s.getGPA() > highest.getGPA()) {
				// found the highest GPA student
				highest = s;
			}
		}
		return highest;
	}
	
	public Student search(String searchName){
		int i = 0;
		Student foundStudent = null;

		
        while (  i < students.size() && !students.get(i).getName().equalsIgnoreCase(searchName)) {
            i++;
        }

        if (i < students.size()) {
        	//found - successful search
        	foundStudent = students.get(i);

        } 
        
        return foundStudent;
	}
	
	public Boolean remove(String name){
		Student student = search(name);
		if (student != null){
			return students.remove(student);
		}
		return false;
	}
}
