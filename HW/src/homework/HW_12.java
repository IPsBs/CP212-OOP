package homework;

import java.text.DecimalFormat;
import java.util.*;
public class HW_12 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        ArrayList<Double> x = new ArrayList<Double>();
        double xbar = 0;
        double s = 0;
        double sum = 0;
        double sum2 = 0;
        double xi = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter x" + (i + 1) + ": ");
            xi = scanner.nextDouble();
            x.add(xi);
            sum += xi;
        }
        xbar = sum / n;
        for (int i = 0; i < n; i++) {
            sum2 += Math.pow((x.get(i) - xbar), 2);
        }
        s = Math.sqrt(sum2 / n);
        System.out.println("xbar = " + xbar);
        System.out.println("s = " + df.format(s));

        scanner.close();
    }
}
