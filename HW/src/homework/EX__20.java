package homework;

import java.util.Scanner;

public class EX__20 {
	//transposes word that given
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentance: ");
        String sentence = sc.nextLine();
        sc.close();
        String[] array = sentence.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < array.length; i++) {
        	//reverse word 
            String temp = new StringBuffer(array[i]).reverse().toString();
            sb.append(temp);
            if(!(i == array.length - 1)) {
                sb.append(" ");
            }
            
            
        }
        System.out.println(sb);

    }
}