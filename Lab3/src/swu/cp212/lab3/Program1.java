package swu.cp212.lab3;
import java.text.DecimalFormat;
import java.util.*;
public class Program1 {

	public static void main(String[] args) {
		double alpha, beta;
		double distance;
		double alphaRad;
		double betaRad;
		double height;
		// input 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Angle alpha (in degree):");
		alpha = scanner.nextInt();
		System.out.print("Angle Beta (in degree):");
		 beta = scanner.nextInt();
		System.out.print("Distance between point A and B (ft):");
		distance = scanner.nextDouble();
		//test 
		//System.out.print(alpha +" "+ beta+ " "+distance);
		
		//process
		alphaRad = Math.toRadians(alpha); 
		betaRad = Math.toRadians(beta); 
		
		height = (distance * Math.sin(alphaRad) * Math.sin(betaRad))/
				Math.sqrt(Math.sin(alphaRad + betaRad) 
						* Math.sin(alphaRad - betaRad));
		// output
		
		DecimalFormat df = new DecimalFormat("0.000");
		
		System.out.println("Estinating the height of the pole\new");
		System.out.println("Angle at point A (deg):\t\t"+df.format(alpha));
		System.out.println("Angle at point B (deg):\t\t"+df.format(beta));
		System.out.println("Distance between A and B (ft):\t"+df.format(distance));
		System.out.println("Estinating height (ft):\t\t"+df.format(height));
	}

}
