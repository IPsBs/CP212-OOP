package lab13;

public class Student {

	private String id;
	private double midScore;
	private double finalScore;
	
	public Student(String id, double midScore, double finalScore) {
		this.id = id;
		this.midScore = midScore;
		this.finalScore = finalScore;
	}
	
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getMidScore() {
		return midScore;
		
	}
	public void setMidScore(double midScore){
        this.midScore = midScore;
    }
	public double getFinalScore() {
		return finalScore;
	}
	public void getFinalScore(double finalScore) {
		this.finalScore = finalScore;
	}
	public double getTotalScore() {
		return midScore + finalScore;
	}
}



