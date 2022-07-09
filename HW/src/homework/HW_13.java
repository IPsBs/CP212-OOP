package homework;

import java.text.DecimalFormat;

public class HW_13 {
    
    public static final void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.000");
		double payScaleTable[][] = { {10.50, 12.00, 14.50, 16.75, 18.00},
									 {20.50, 22.25, 24.00, 26.25, 28.00},
									 {34.00, 36.50, 38.00, 40.35, 43.00},
									 {50.00, 60.00, 70.00, 80.00, 99.99} 
									};
		double sum=0;
		double average;
		System.out.println("The average pay for every grade level");
		System.out.println("-------------------------------------");
		for(int j=0;j<4;j++)
		{
			for(int i=0;i<5;i++) 
			{
				sum += payScaleTable[j][i];
			}
			
		average = sum/5;
		System.out.println("Average pay for Grade level "+ j + " : " + df.format(average));
		sum = 0;
		}
		
		System.out.println();
		
		System.out.println("The average pay for every step");
		System.out.println("-------------------------------------");
		for(int j=0;j<5;j++)
		{
			for(int i=0;i<4;i++) 
			{
				sum += payScaleTable[i][j];
			}
			
		average = sum/4;
		System.out.println("Average pay for Step level "+ j + " : " + df.format(average));
		sum = 0;
		}
    }    
}