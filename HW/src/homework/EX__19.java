package homework;

import java.util.Scanner;

public class EX__19 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
        System.out.println("Enter a sentance: ");
        String sentence = sc.nextLine();
        StringBuffer sb = new StringBuffer(sentence);
        if(sentence.equals("")) {
            sc.close();
            break;
        }
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (Character.isUpperCase(ch)) {
                sb.setCharAt(i, Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                sb.setCharAt(i, Character.toUpperCase(ch));
            }
        }
        System.out.println(sb);
    }
   }
}