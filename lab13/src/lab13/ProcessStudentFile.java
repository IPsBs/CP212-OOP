package lab13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class ProcessStudentFile{
	public static final double MAXSCORE = 100;
	public static final double MINSCORE = 0;
	
	public static void main(String[] args) throws FileNotFoundException {
		int status = 0,index=0;
		ArrayList<Student> student = new ArrayList<Student>();
		//Student[] student;
		//student = new Student[...];
		
		//Use JFileChooserto show list of in directory and use Scanner to read file
		JFileChooser chooser;
		File file,directory;
		chooser = new JFileChooser(System.getProperty("user.dir"));
		status = chooser.showOpenDialog(null);
		if(status != JFileChooser.APPROVE_OPTION) {
			System.out.println("Open file dialog cancled");
			}else {
				file = chooser.getSelectedFile();
				directory = chooser.getCurrentDirectory();
				
				//Open the Scanner
				Scanner sc = new Scanner(file);
				//Read 
				String[] arrOfStr;
				double midScore,finalScore;
				while(sc.hasNext()) {
					String line = sc.nextLine();
					arrOfStr =line.split("\t");
					midScore = Double.parseDouble(arrOfStr[2]);
					finalScore = Double.parseDouble(arrOfStr[3]);
					student.add(new Student(arrOfStr[0],midScore,finalScore));
				}
				System.out.println(student.size());
				//--------------Compute Average Score --------------//
				//------Find the highest and lowest score ----------//
				double totalScore;
				double maxVal=0,minVal=0,sumVal=0,avgVal=0;
				int maxId=1,minId=1;
				maxVal = student.get(0).getTotalScore();
				minVal = maxVal;
				for(int i = 1;i<student.size();i++) {
					totalScore = student.get(i).getTotalScore();
					if(totalScore > maxVal) {
						maxVal = totalScore;
						maxId = i;
					}
					if(totalScore < minVal) {
						minVal = totalScore;
						minId = i;
					}
					sumVal = sumVal + totalScore;
				}
				avgVal = sumVal/student.size();
				//Display results
				System.out.printf("Average total score : %.6f\n",avgVal);
				System.out.printf("ID %d got the hightest point : %.2f points\n",maxId+1,maxVal);
				System.out.printf("ID %d got the lowest point : %.2f points\n",minId+1,minVal);
			}
		}
}
