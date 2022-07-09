package lab8;
public class Student {

    // Data members
    public enum Major {
        NONE, CS, STAT, MATH
    }

    private String name;
    private double gpa;
    private Major major;

    public Student() {
        this("Not Given", 0.00, Major.NONE);
    }

    public Student(String name, double gpa, Major major) {
        this.name = name;
        this.gpa = gpa;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGPA() {
        return gpa;
    }

    public void setGPA(Double gpa) {
        this.gpa = gpa;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
}