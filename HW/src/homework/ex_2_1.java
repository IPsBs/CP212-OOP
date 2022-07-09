package homework;

import java.text.DecimalFormat;
import java.util.*;
public class ex_2_1 {
    static double temperature[][] = new double[12][];
    static DecimalFormat df = new DecimalFormat("0.000");
    static Scanner scanner = new Scanner(System.in);
    static String month[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static int day_s[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   
    public static void main(String[] args) {
        System.out.println("Input temperature");
        for (int i = 0; i < 12; i++) {
            temperature[i] = new double[day_s[i]];
        }
        for (int i = 0; i < temperature.length; i++) {
            for (int j = 0; j < temperature[i].length; j++) {
                System.out.println("temperature day " + (j+1) + " of " + month[i]+ ": ");
                temperature[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("\n"+"Hottest days of the year: " + df.format(getHottestDays(temperature)) );
        System.out.println("Coldest days of the year: " + df.format(getColdestDays(temperature)));
        getMonthlyAverage(temperature);
        getDif(temperature);
        getDailyAverage(temperature);
    }
    static double getHottestDays(double temp[][]) {
        double hottest = temp[0][0];
        for (int i = 0; i < temp.length; i++) {
            for(int j=0; j<temp[i].length; j++) {
                if (hottest < temp[i][j]) {
                    if (temp[i][j] > hottest) {
                        hottest = temp[i][j];
                }
            }

            }
        }
        return hottest;
    }
    static double getColdestDays(double temp[][]){
        double clodest = temp[0][0];
        for (int i = 0; i < temp.length; i++) {
            for(int j = 0; j < temp[i].length; j++)
                if (temp[i][j] < clodest) {
                    clodest = temp[i][j];
            }
        }
        return clodest;
    }
    static void getMonthlyAverage(double temp[][]) {
        double temperature = 0;
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[i].length;++j){
                temperature += temp[i][j];
            }
            System.out.println("Average temperature of " + month[i] + ": " + df.format(temperature/temp[i].length));
            temperature = 0;
        }
    }
    static void getDif(double temp[][]) {
        double dif = 0,hottest,coldest;
        for (int i = 0; i <temp.length; i++) {
           hottest=temp[i][0];
            for(int j=0;j<temp[i].length;++j){
                if(temp[i][j]>hottest)
                    hottest=temp[i][j];
    }
            coldest=temp[i][0];
            for(int j=0;j<temp[i].length;j++){
                if(temp[i][j]<coldest)
                    coldest=temp[i][j];
        }
            dif = hottest-coldest;
            System.out.println("Difference between the hottest and coldest days of the "+month[i]+" is: " + df.format(dif));  
            dif = 0;
        }
    }
    public static void getDailyAverage(double temp[][]) {
        int month,day;
        double thatday = 0;
        System.out.println("Input month and day: ");
        System.out.println("Input month: ");
        month = scanner.nextInt();
        System.out.println("Input day: ");
        day = scanner.nextInt();
        if((month<13&&month>0)&&(day<=temp[month-1].length&&day>0)){
            for(int i=0;i<temp.length;i++){
                for(int j=0;j<temp[i].length;j++){
                thatday = temp[i][j];
                }
            }
            System.out.println("Daily Temperature: " + thatday);
    }
        else{
            System.out.print("invaid input");
        }
}
}

